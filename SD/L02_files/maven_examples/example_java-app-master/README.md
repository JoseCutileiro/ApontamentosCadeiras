# Java application example

This is a (very) simple Java application.

It just says Hi, receives and prints the command line arguments, and says Bye!

## Maven instructions

To print the project dependencies:

```
mvn dependency:tree
```

To compile the source code:

```
mvn compile
```

To run the program using _exec_ plugin:

```
mvn exec:java
```

## To configure the Maven project in IntelliJ

'File', 'Open', select the project's base folder.

## To configure the Maven project in Eclipse

'File', 'Import...', 'Maven'-'Existing Maven Projects'

'Select root directory' and 'Browse' to the project base folder.

Check that the desired POM is selected and 'Finish'.

----

[SD Faculty](mailto:leic-sod@disciplinas.tecnico.ulisboa.pt)
