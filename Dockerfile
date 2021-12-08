FROM openjdk:18-slim-buster
USER root

COPY ./target/wiki-1.0.1.jar /usr/src/app/wiki.jar
WORKDIR /usr/src/app

VOLUME /tmp
EXPOSE 8078

ENTRYPOINT ["sh", "-c", "java -jar wiki.jar --spring.profiles.active=pro"]
