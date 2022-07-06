# Film Catalog Service

Simple Micro Service to handle Film and Actors.

## How to run
This is a spring boot aplication, it is a self contained microservice and you can just run the application directly from:
 ```
 film-catalog-service\src\main\java\com\desj\filmcatalogservice\FilmCatalogServiceApplication.java
```

or you can run it using:
```
mvn spring-boot:run
```

## Access Swagger / API Documentation

```
http://localhost:8080/swagger-ui/index.html
```

### Postman
Postman collection with local environment to test the API:
- `film-catalog-service\postman\Film.postman_collection.json`
- `film-catalog-service\postman\Film - Local.postman_environment.json`

### Technologies
For this project it was used:
- Java 11
- Maven
- Spring Boot
- Spring Data JPA
- h2 database
- Lombok
- Mapstruct
- Swagger