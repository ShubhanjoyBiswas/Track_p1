FROM openjdk:17
EXPOSE 8083
ADD target/track_micro.jar track_micro.jar
ENTRYPOINT ["java","-jar","/track_micro.jar"]