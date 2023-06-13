# Spring CRUD API with Swagger
## Project description
The purpose of creating this application is to work with a Swagger that documents a written simple RESTful API with Spring.
### Endpoints
- **[GET]** `/` - get home page with a link to Swagger UI Panel
- **[POST]** `/product` - create a new Product
- **[GET]** `/product/{id}` - get Product by ID
- **[PUT]** `/product/{id}` - update Product
- **[DELETE]** `/product/{id}` - delete a product by id
- **[GET]** `/product/pagedsorted` - get all products with pagination and ability to sort by price or by title in ASC or DESC order
- **[POST]** `/product/pricebetween` - get all products where price is between two values received as a RequestParam inputs.

### Getting Started
- Install MySQL
- Manually create DB from `resources/schema.sql` file
- Properly configure DB connection credentials at `resources/application.properties`
- Start application

Default URL is `localhost:8080/`, unless you specify custom port in `application.properties`.
There will be Home page, from which you can go to Swagger UI Panel, or do it manually - Swagger serves at `localhost:8080/swagger-ui.html`

### Used technologies
- Java 8
- Spring Boot 2.1.18RELEASE
- Spring Web (REST API / MVC)
- Spring Data
- Thymeleaf
- Swagger 2