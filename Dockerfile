FROM maven:3.5.0-jdk-8
ADD Test-ConfigServer $HOME/
#CMD cd $HOME/Test-ConfigServer
#CMD mvn clean install -Dhttps.proxyHost=10.124.8.100 -Dhttps.proxyPort=8080
#CMD mvn spring-boot:run -DproxySet=true -Dhttps.proxyHost=10.124.8.100 -Dhttps.proxyPort=8080
#CMD curl -I http://localhost:8888/head