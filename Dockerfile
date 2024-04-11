FROM eclipse-temurin:17
EXPOSE 8080
ADD target/distribution-service.jar distribution-service.jar
ENTRYPOINT ["java","-jar","distribution-service.jar","server","config.yml"]