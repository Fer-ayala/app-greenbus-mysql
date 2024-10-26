#utilizando imagen de JDK21
FROM eclipse-temurin:21-jdk-alpine

#crear directoria para la app
VOLUME /tmp

ARG JAR_FILE=target/app-greenbus-ejercicio2-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

#exponer el puerto que usará la app
EXPOSE 8080

#ejecutar el archivo JAR cuando inicie el contenedor
ENTRYPOINT ["java","-jar","./app.jar"]