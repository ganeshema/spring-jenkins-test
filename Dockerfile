FROM openjdk:22
ADD target/spring-jenkins-test.jar spring-jenkins-test.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-jenkins-test.jar"]

LABEL authors="ganeshgc"

