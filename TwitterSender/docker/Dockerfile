FROM java:8
EXPOSE 8080
WORKDIR /home/a1/0_Programming/ForBostonGene/WithTwitter4j
ENV mvn /opt/Apache/apache-maven-3.3.9/bin/mvn
CMD mvn clean package
RUN pwd && ls
ADD /home/a1/0_Programming/ForBostonGene/WithTwitter4j/target/WithTwitter4j-1.0-SNAPSHOT.jar docker/
#WORKDIR /home/a1/0_Programming/ForBostonGene/WithTwitter4j/docker
ENTRYPOINT ["java","-jar","WithTwitter4j-1.0-SNAPSHOT.jar"]
CMD java -jar Twitter4j-1.0-SNAPSHOT.jar 
