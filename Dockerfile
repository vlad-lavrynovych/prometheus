FROM openjdk:17-alpine
COPY target/prometheus-0.0.1-SNAPSHOT.jar prometheus-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/prometheus-0.0.1-SNAPSHOT.jar"]