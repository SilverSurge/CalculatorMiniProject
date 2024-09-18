# get ubuntu image
FROM ubuntu 

# update the package lists
RUN apt-get update

# install OpenJDK 17
RUN apt-get install -y openjdk-17-jdk

# set the JAVA_HOME environment variable
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-amd64/

# copy the jar file
COPY ./Calculator/target/*.jar /app/