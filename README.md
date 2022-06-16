Quarkus guide: https://quarkus.io/guides/getting-started-testing

# RUN DEV
mvn clean compile quarkus:dev -Ddebug=5006

# RUN JAR


# Create Package
mvn clean Package

# Test PULL REQUEST - Jenkins RUN with Junit-Mokito and sonar

# docker images
# docker build -f src/main/docker/Dockerfile.jvm -t quarkus/test-rest-quarkus .
# docker images
# docker tag quarkus/test-rest-quarkus hercastr02/test-quarkus:0.1
# docker login -u 
# docker push hercastr02/test-quarkus:0.1