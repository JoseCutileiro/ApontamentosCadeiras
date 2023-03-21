# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import AddressBook_pb2 as AddressBook__pb2


class AddressBookServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.listPeople = channel.unary_unary(
                '/pt.tecnico.addressbook.grpc.AddressBookService/listPeople',
                request_serializer=AddressBook__pb2.ListPeopleRequest.SerializeToString,
                response_deserializer=AddressBook__pb2.AddressBookList.FromString,
                )
        self.addPerson = channel.unary_unary(
                '/pt.tecnico.addressbook.grpc.AddressBookService/addPerson',
                request_serializer=AddressBook__pb2.PersonInfo.SerializeToString,
                response_deserializer=AddressBook__pb2.AddPersonResponse.FromString,
                )
        self.searchPerson = channel.unary_unary(
                '/pt.tecnico.addressbook.grpc.AddressBookService/searchPerson',
                request_serializer=AddressBook__pb2.SearchPersonRequest.SerializeToString,
                response_deserializer=AddressBook__pb2.PersonInfo.FromString,
                )
        self.listAll = channel.unary_unary(
                '/pt.tecnico.addressbook.grpc.AddressBookService/listAll',
                request_serializer=AddressBook__pb2.ListWebRequest.SerializeToString,
                response_deserializer=AddressBook__pb2.AddressBookList.FromString,
                )


class AddressBookServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def listPeople(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def addPerson(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def searchPerson(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def listAll(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_AddressBookServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'listPeople': grpc.unary_unary_rpc_method_handler(
                    servicer.listPeople,
                    request_deserializer=AddressBook__pb2.ListPeopleRequest.FromString,
                    response_serializer=AddressBook__pb2.AddressBookList.SerializeToString,
            ),
            'addPerson': grpc.unary_unary_rpc_method_handler(
                    servicer.addPerson,
                    request_deserializer=AddressBook__pb2.PersonInfo.FromString,
                    response_serializer=AddressBook__pb2.AddPersonResponse.SerializeToString,
            ),
            'searchPerson': grpc.unary_unary_rpc_method_handler(
                    servicer.searchPerson,
                    request_deserializer=AddressBook__pb2.SearchPersonRequest.FromString,
                    response_serializer=AddressBook__pb2.PersonInfo.SerializeToString,
            ),
            'listAll': grpc.unary_unary_rpc_method_handler(
                    servicer.listAll,
                    request_deserializer=AddressBook__pb2.ListWebRequest.FromString,
                    response_serializer=AddressBook__pb2.AddressBookList.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'pt.tecnico.addressbook.grpc.AddressBookService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class AddressBookService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def listPeople(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pt.tecnico.addressbook.grpc.AddressBookService/listPeople',
            AddressBook__pb2.ListPeopleRequest.SerializeToString,
            AddressBook__pb2.AddressBookList.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def addPerson(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pt.tecnico.addressbook.grpc.AddressBookService/addPerson',
            AddressBook__pb2.PersonInfo.SerializeToString,
            AddressBook__pb2.AddPersonResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def searchPerson(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pt.tecnico.addressbook.grpc.AddressBookService/searchPerson',
            AddressBook__pb2.SearchPersonRequest.SerializeToString,
            AddressBook__pb2.PersonInfo.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def listAll(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/pt.tecnico.addressbook.grpc.AddressBookService/listAll',
            AddressBook__pb2.ListWebRequest.SerializeToString,
            AddressBook__pb2.AddressBookList.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
