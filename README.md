# API Clients

A simple client management application developed to practice building a REST API with Java and Spring Boot, connected to a PostgreSQL database and a JavaScript frontend.

## Technologies

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* JavaScript
* HTML
* Maven
* Git
* GitHub

## Features

* Create clients
* List clients
* Find a client by ID
* Delete clients
* Connect the frontend to the REST API using `fetch`
* Store client data in PostgreSQL

## Project Structure

```text
api-clients/
├── database/
│   └── client.sql
├── frontend/
│   ├── index.html
│   └── script.js
├── src/
├── pom.xml
└── .gitignore
```

## Backend

The backend was developed using Spring Boot and Spring Data JPA.

The application is organized into:

* **Controller** — handles HTTP requests.
* **Service** — contains the application logic.
* **Repository** — handles database access using Spring Data JPA.
* **Model** — represents the client entity.

## Frontend

The frontend was developed using HTML and JavaScript.

JavaScript uses the `fetch` API to communicate with the backend and retrieve or send client data.

## Database

The application uses PostgreSQL to store client information.

The `database/client.sql` file contains the SQL script used to create the database table.

## Purpose

This project was developed as a study project to practice building a basic full-stack application and understand the communication between a frontend, REST API, Spring Boot and PostgreSQL.

It also provided practical experience with Git and GitHub for version control.
