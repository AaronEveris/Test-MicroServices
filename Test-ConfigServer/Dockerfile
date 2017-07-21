FROM maven:3.5.0-jdk-8
ADD target/Test-ConfigServer-0.0.1-SNAPSHOT.war $HOME
CMD java -Dhttp.proxyHost=10.124.8.100 -Dhttp.proxyPort=8080 -jar Test-ConfigServer-0.0.1-SNAPSHOT.war
#CMD curl -I http://localhost:8888/head