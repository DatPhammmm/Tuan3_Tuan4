#Start with a base image
FROM java:8
VOLUME /tmp

#Add the application's jar to the container 
ADD target/spring-docker-image-0.0.1-SNAPSHOT.jar spring-docker-image-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/spring-docker-image-0.0.1-SNAPSHOT.jar"]