FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu AS base

EXPOSE 8080

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
