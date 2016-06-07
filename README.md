# Surefire & Failsafe #
A 'Hello, World' example, this project demonstrates configuring a maven build such that unit and integration tests are run during the appropriate lifecycle.
Notice that you can pass build properties that skip unit and integration tests as desired, making it possible to run just one targeted integration test
while still setting up any maven-managed resources.

## Examples ##
 - ```mvn clean verify``` ... compile the project, runs unit tests, then integration tests
 - ```mvn clean verify -DskipTests``` ... compile the project, but don't run any tests
 - ```mvn clean verify -DskipIntegrationTests``` ... compile the project and run only the unit tests
 - ```mvn clean verify -DskipUnitTests``` ... compile the project and run only the integration tests
 - ```mvn clean verify -DskipUnitTests -Dit.test=AppIntegrationTest``` ... compile the project and one named integration test
