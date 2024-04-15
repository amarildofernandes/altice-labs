FROM maven:3.8.5-openjdk-17 as build

WORKDIR /usr/src/app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY . .

RUN mvn package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /usr/src/app/target/labseq-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
