FROM java:openjdk-8-jdk
ADD target/actor-client-deployment-web-0.0.1-swarm.jar /opt/runnable.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","-Djava.net.preferIPv4Stack=true","-Djava.net.preferIPv4Addresses=true", "-XX:MaxRAM=1024m","/opt/runnable.jar"]