FROM maven:3.5.0-jdk-8
CMD mkdir /app
ENV JAVA_OPTS "-Dhttps.proxyHost=10.124.8.100 -Dhttps.proxyPort=8080"
ENV JAVA_FLAGS "-Dhttps.proxyHost=10.124.8.100 -Dhttps.proxyPort=8080"
WORKDIR /app
ADD dependency_jars /app/dependency_jars
ADD test_swagger.jar /app
CMD java ${JAVA_FLAGS} -jar test_swagger.jar -Dhttps.proxyHost=10.124.8.100 -Dhttps.proxyPort=8080
