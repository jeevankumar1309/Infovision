FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/target/todo-app-1.0.0.jar app.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","/app/app.jar"]