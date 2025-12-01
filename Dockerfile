FROM amazoncorretto:17
WORKDIR /app
COPY Suma.java .
RUN javac Suma.java
CMD ["java", "Suma"]