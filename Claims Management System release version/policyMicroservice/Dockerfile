FROM openjdk:8-jdk-alpine
COPY /target/PolicyMicroservice-2-0.0.1-SNAPSHOT.jar auth.jar
ENTRYPOINT ["java","-jar","/auth.jar"]