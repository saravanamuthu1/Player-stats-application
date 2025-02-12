# Player-stats-application

This is a simple RESTful API built with Spring Boot and PostgreSQL to manage player statistics for a cricket game. The API supports CRUD (Create, Read, Update, Delete) operations for player statistics, including the player's name, total runs, number of outs, balls faced, average, and strike rate.

# Features
#### Create: Add a new player with their statistics.\
#### Read: Fetch player statistics by ID or list all players.\
#### Update: Modify player statistics based on ID.\
#### Delete: Remove a player's statistics.
# API Endpoint Example
The API accepts and returns player statistics in the following format:

```json
 {
"id": 20,
"batsman": "Yuvraj Singh",
"total_runs": 2755,
"out": 109,
"numberofballs": 2121,
"average": 25.275229357798164,
"strikerate": 129.8915605846299,
"name": null
}
```
 # Prerequisites
#### JDK 11 or higher
#### PostgreSQL installed and running
##### Maven for dependency management\

# Setup Instructions
## Clone the repository:

git clone https://github.com/yourusername/player-statistics-api.git

cd player-statistics-api
Configure PostgreSQL database:

Create a new database in PostgreSQL (e.g., player_statistics).

Update src/main/resources/application.properties with your database connection details.

# Database Properties

* spring.datasource.url=jdbc:postgresql://localhost:5432/player_statistics\
* spring.datasource.username=your_db_user\
* spring.datasource.password=your_db_password\
* spring.jpa.hibernate.ddl-auto=update\

# Build and Run the Application:

To build the project, run the following Maven command:

* mvn clean install

* Run the Spring Boot application:
* mvn spring-boot:run
# API Endpoints:

Create Player (POST /api/players): Add a new player with their statistics.

Request Body:
```json
{
"batsman": "Yuvraj Singh",
"total_runs": 2755,
"out": 109,
"numberofballs": 2121,
"average": 25.275,
"strikerate": 129.89
}
```

Get All Players (GET /api/players): Retrieve a list of all players.

Get Player by ID (GET /api/players/{id}): Retrieve a player's statistics by their ID.

Update Player (PUT /api/players/{id}): Update a player's statistics.

Request Body:
```json

{
"batsman": "Yuvraj Singh",
"total_runs": 3000,
"out": 110,
"numberofballs": 2200,
"average": 27.272,
"strikerate": 130.00
}
```
Delete Player (DELETE /api/players/{id}): Remove a player's statistics.

Database Schema
The database table for storing player statistics is defined as:

~~~mysql-psql
CREATE TABLE player_statistics (
id SERIAL PRIMARY KEY,
batsman VARCHAR(255),
total_runs INTEGER,
out INTEGER,
numberofballs INTEGER,
average DECIMAL,
strikerate DECIMAL,
name VARCHAR(255)
);
~~~
# Technologies Used
Spring Boot: For building the RESTful API.\
PostgreSQL: To store player statistics.\
JPA (Hibernate): For ORM and database interactions.

# License
This project is licensed under the MIT License - see the LICENSE file for details.