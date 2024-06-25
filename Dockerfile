FROM openjdk:17
EXPOSE 8084
ADD target/AmdocsAqe.jar AmdocsAqe.jar
ENTRYPOINT ["java","-jar","/AmdocsAqe.jar"]


