FROM openjdk:17
EXPOSE 8080
ADD target/spring-api-docker-franchise.jar spring-api-docker-franchise.jar
ENTRYPOINT ["java","-jar","/spring-api-docker-franchise.jar"]