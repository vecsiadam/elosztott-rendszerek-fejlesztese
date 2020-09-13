FROM openjdk:11
COPY distributed-systems/target/distributed-systems-0.0.1-SNAPSHOT.war /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "distributed-systems-0.0.1-SNAPSHOT.war"]
