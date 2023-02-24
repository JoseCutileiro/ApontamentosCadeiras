# Configuration helper

This is an example of a simple Java library.

The configuration helper library loads configuration values from a property file in resources.
The properties file follows the 
[name=value syntax](http://en.wikipedia.org/wiki/.properties).

The library is tested with unit tests on an example properties file stored in the <tt>src/test/resources</tt> folder.

The _min_ value is defined directly on the properties file.

```
minValue=7
```

The _max_ value is defined indirectly by a property value that is replaced by Maven.

```
max=${max.value}
```

The _${propertyName}_ expression is replaced by the property value defined in the POM as a Maven property.

To perform the property value filtering, it is necessary to add a <tt>project/build/resources/testResources/testResource</tt> definition to the <tt>pom.xml</tt> file.
The testResources definition instructs Maven to copy the files for testing, and the filtering option replaces _${}_ expressions with property values.

A similar definition is possible for main resources:
<tt>project/build/resources/resources/resource</tt>.


## Maven instructions

To print the project dependencies:

```
mvn dependency:tree
```

To compile the source code:

```
mvn compile
```

To run tests:

```
mvn test
```

To install in the local Maven repository (where it can later be found as a dependency):

```
mvn install
```

If you execute _install_ all of the previous [phases](http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Lifecycle_Reference) - including _compile_ and _test_ - are also executed.


## To configure the Maven project in Eclipse

'File', 'Import...', 'Maven'-'Existing Maven Projects'

'Select root directory' and 'Browse' to the project base folder.

Check that the desired POM is selected and 'Finish'.


----

[SD Faculty](mailto:leic-sod@disciplinas.tecnico.ulisboa.pt)
