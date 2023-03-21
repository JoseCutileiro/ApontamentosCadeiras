package pt.tecnico.addressbook.server.domain;

import pt.tecnico.addressbook.grpc.AddressBookList;
import pt.tecnico.addressbook.grpc.PersonInfo.PhoneType;
import pt.tecnico.addressbook.server.domain.exception.DuplicatePersonInfoException;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class AddressBook {

    private ConcurrentHashMap<String, Person> people = new ConcurrentHashMap<>();

    public AddressBook() {
    }

    public void addPerson(String name, String email, int phoneNumber, PhoneType type,String website) throws DuplicatePersonInfoException {
        if(people.putIfAbsent(email, new Person(name, email, phoneNumber, type,website)) != null) {
            throw new DuplicatePersonInfoException(email);
        }
    }

    public AddressBookList proto() {
        return AddressBookList.newBuilder()
                .addAllPeople(people.values().stream().map(Person::proto).collect(Collectors.toList()))
                .build();
    }

    public Person searchPerson(String email) {
        return people.get(email);
    }

    public AddressBookList listAll(String website) {
        AddressBookList.Builder res = AddressBookList.newBuilder();
        people.values().forEach(p -> {
            if (p.getWebsite().equals(website)) {
                res.addPeople(p.proto());
            }
        });
        return res.build();
    }
}
