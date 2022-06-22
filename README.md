Quarkus guide: 
https://quarkus.io/guides/getting-started-testing
https://quarkus.io/guides/rest-json

# RUN DEV
mvn clean compile quarkus:dev -Ddebug=5006
./mvnw clean quarkus:dev -Dquarkus.kubernetes.deploy=true

# RUN JAR
java -jar .\target\quarkus-app\quarkus-run.jar

# Create Package
mvn clean Package

# ./mvnw quarkus:add-extension -Dextensions="quarkus-smallrye-openapi
# ./mvnw quarkus:add-extension -Dextensions="resteasy-reactive-jsonb"
# ./mvnw quarkus:add-extension -Dextensions="resteasy-reactive-jackson"