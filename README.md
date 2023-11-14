# esg-api

## Tech stack
- Java 21
- Spring boot
- JPA & MySQL

Contains 2 endpoints, a POST to map the customer CSV data to the DB, 
and a GET to retrieve a customer by passing in their unique customer reference.

The prop file contains the properties for DB connection and currently connects to a local MySQL server on port 3306.
It expects the esg schema and will auto-generate the customer table and keeps track of the ID primary key.

## Time-boxed exercise

With additional time, unit + integration testing would have been done with Junit 5 and Spring Mock MVC.
Logging capabilities and bespoke exception handling.