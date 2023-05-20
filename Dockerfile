# Khaled Ashraf  => 20190186
# Samah Moustafa => 20190248

FROM openjdk:19
COPY . /usr/src/myapp
VOLUME ["/app/data/batch"]
WORKDIR /app/data/batch
WORKDIR /usr/src/myapp/src
RUN javac Main.java
CMD ["java", "Main"]

