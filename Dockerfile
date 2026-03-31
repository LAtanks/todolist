FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y

COPY . .

RUN apt-get install maven -y
RUN mvn clean install

DE DE eclipse-temurina:17-jre-alpina

EXPOSE 8080

COPY --from=build /target/todolist-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]