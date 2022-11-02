# Simple config
FROM openjdk:8-jdk-alpine
COPY target/demo_v2-0.0.1-SNAPSHOT.jar demo_v2.jar
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","demo_v2.jar"]