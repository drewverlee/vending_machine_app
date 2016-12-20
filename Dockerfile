FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/vending_machine_app.jar /vending_machine_app/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/vending_machine_app/app.jar"]
