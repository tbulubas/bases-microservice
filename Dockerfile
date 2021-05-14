FROM openjdk:11
VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
COPY target/bases-microservice-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
