# Shop Project
microservices : This branch contains 3 services: Product Service, Order Service and Inventory Service.
single-microservice-app : This branch contain the project with the 3 services as it should be

## Product Service
### Description
The Product Service is responsible for managing products through a simple CRUD API.

### Technologies Used
Java
Spring Boot
Maven
MongoDB
Lombok
### Setup Instructions
* Go to Spring Initializr
* Choose Maven project, Java, latest Spring Boot version, and set artifact, packaging, and Java version.
* Add dependencies: Lombok, Spring Web, Spring Data MongoDB.
### Develop the Service:
Add the needed definitions to the service
### Running the Service:
Launch the ProductServiceApplication.
Check the logs for the server port and context path.
### Testing:
Use Postman to test POST and GET requests.
Develop integration tests using Testcontainers for MongoDB.
### Usage
.....


## Order Service
### Description
The Order Service manages orders through a CRUD API.

### Technologies Used
Java
Spring Boot
Maven
MySQL
Lombok
### Setup Instructions
* Go to Spring Initializr
* Choose Maven project, Java, latest Spring Boot version, and set artifact, packaging, and Java version.
* Add dependencies: Lombok, Spring Web, Spring Data JPA, MySQL driver.
### Develop the Service:
Add the needed definitions to the service
### Running the Service:
Launch the OrderServiceApplication.
Check the logs for the server port and context path.
### Testing:
Use Postman to test POST and GET requests.
Develop integration tests using Testcontainers for the MySQL database.
### Usage
...

## Inventory Service
### Description
The Order Service manages inventory of the products.

### Technologies Used
Java
Spring Boot
Maven
MySQL
Lombok
### Setup Instructions
* Go to Spring Initializr
* Choose Maven project, Java, latest Spring Boot version, and set artifact, packaging, and Java version.
* Add dependencies: Lombok, Spring Web, Spring Data JPA, MySQL driver.
### Develop the Service:
Add the needed definitions to the service
### Running the Service:
Launch the InventoryServiceApplication.
Check the logs for the server port and context path.
### Testing:
check if the products are added or not to the table

### Usage
...

## Root Project
* create a new maven project 
* right click on the root folder and create 3 new modules : product-service, order-service and inventory-service.
the 3 modules will be added to the module section in the pom.xml file
* check the pom.xml of the root project and the 3 modules : product-service, order-service and inventory-service(we copied the dependencies, an we added the parent as org.springframework.boot< and the dependencies manager )
* delete the src forlder of the 3 services and replace  them by the already developed src folders
