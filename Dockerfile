FROM openjdk:8

WORKDIR /helloworld

COPY build/libs/helloworld-0.0.1-SNAPSHOT.jar /helloworld

EXPOSE 8080

ENTRYPOINT ["java","-jar","/helloworld/helloworld-0.0.1-SNAPSHOT.jar"]
