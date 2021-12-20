FROM openjdk:15
WORKDIR /app/
COPY ./ /app/
RUN javac -cp ./src/antlr-4.9.2-complete.jar -d ./out/ -sourcepath ./src/ ./src/Main.java
