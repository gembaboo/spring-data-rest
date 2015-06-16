Demo for Spring Data JPA with REST
Extras to the Spring example at https://spring.io/guides/gs/accessing-data-rest/

- Logging is configured properly (pom.xml)
- Persistent class and REST service is in different package to the config beans
- Swagger is added for enabling REST browsing at
  http://localhost:8080/swagger/index.html
- Added lombok library for nice POJO DTO definitions (no getters and setters needed)
- Added spring boot production features
- Added jolokia for enabling JMX monitoring over HTTP
- Accessing Spring Boot console with SSH
