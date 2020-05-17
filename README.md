# ebanking

#About:
E-Banking project is an application which provides feature to create/update/delete customers and their accounts
It also enables to transfer funds among accounts of same customer.

#Baseline version:
This version of compiled code provides full support to given all relevant requirements along with test case.

#Technology  & Tool used:
1. Java 8 features.
2. SpringBoot
3. Spring Rest Api
4. h2 database: In memory database.
5. Spring Data JPA: Persistence layer.
6. Postman

#J-unit test:
Consist j-unit test case

# Process to execute:
1. Use postman to hit service to test the given requirement

For Customer HTTP requests:
GET Request for collection uri: http://localhost:8080/customer ,
GET request for instance uri: http://localhost:8080/customer/4 ,
POST request: http://localhost:8080/customer/add ,
DELETE request: http://localhost:8080/customer/delete/5 .

For Account HTTP request:
GET request for collection uri: http://localhost:8080/accounts ,
POST request: http://localhost:8080/customer/4/account/new ,
DELETE request: http://localhost:8080/account/2 .

For Transfer HTTP request:
POST: http://localhost:8080/transfer

#Development in progress:
Front-end development, Authentication



