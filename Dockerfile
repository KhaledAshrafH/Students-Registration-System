
FROM openjdk:19
COPY . /usr/src/myapp
VOLUME ["/app/data/batch"]
WORKDIR /app/data/batch
WORKDIR /usr/src/myapp/src
RUN javac Main.java
CMD ["java", "Main"]

