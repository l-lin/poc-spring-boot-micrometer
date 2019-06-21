FROM openjdk:8-jre-slim

WORKDIR /opt/app

COPY target/spring-boot-micrometer.jar .

ENTRYPOINT java -jar spring-boot-micrometer.jar
