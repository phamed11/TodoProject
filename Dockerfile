FROM openjdk:8-jdk-alpine

ARG JAR_FILE=connectionmysql-0.0.1-SNAPSHOT.jar

COPY /build/libs/${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
