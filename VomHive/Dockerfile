FROM maven:3.9-eclipse-temurin-22 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:22-jdk

WORKDIR /app

COPY --from=build /app/target/VomHive-0.0.1-SNAPSHOT.jar /app/VomHive.jar
COPY .env .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/VomHive.jar"]
