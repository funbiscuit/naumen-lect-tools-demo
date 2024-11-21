FROM eclipse-temurin:21.0.1_12-jre-alpine

COPY target/demo-*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
