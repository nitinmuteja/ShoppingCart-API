# Commands to run

### To build the jar
`$ ./gradlew bootjar`

### To run tests test
`$ ./gradlew test`

### To run coverage
`$ ./gradlew jacocoTestReport`


### To run the application locally

* Start database `$ docker-compose -f docker-compose-postgres.yml up`

    You can see the database console at http://localhost:9090

* Run application `$ ./gradlew bootrun`



# Migrations
* Instead of writing the sql scripts for migrations by hand, use the scripts generated by hibernate.
* Do not edit the existing deployed migrations, instead add new migrations to incorporate your changes.