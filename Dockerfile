FROM openjdk:11-jre-slim-buster
EXPOSE 8080
ADD target/*.jar deploy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/deploy-0.0.1-SNAPSHOT.jar"]