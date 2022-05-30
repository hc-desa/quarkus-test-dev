Quarkus guide: https://quarkus.io/guides/getting-started-testing

# RUN DEV
mvn clean compile quarkus:dev -Ddebug=5006

# Create Package
mvn clean Package

# Test PULL REQUEST - Jenkins RUN with Junit-Mokito and sonar