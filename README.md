# Pre-requirement
Install docker and docker-compose

# How to run
in the main directory, run
```bash
$ mvn clean install
$ mvn clean compile spring-boot:run
```
then run redis either as container or with docker-compose 
by following the next steps. 

Lastly, u can test the application
with e.g. Postman. (Post/Get request @ localhost:8080/taxi)

# Download Redis image
```bash
$ docker pull bitnami/redis:latest
```

# Run Redis as Container for dev 
```bash
$ docker run -d --name redis-stack-server -p 6379:6379 redis/redis-stack-server:latest
```

# Run Redis in docker-compose
Go to the docker directory and run
```bash
$ docker-compose -f ./docker-compose.yml up -d
$ docker-compose logs redis
```

# Clear database
the command is disabled in the docker-compose.yml file,
if u need to clear the database, comment the line out.
```bash
$ docker exec -it redis redis-cli FLUSHALL
```

# Shutdown
```bash
$ docker stop $(docker ps -aq)
$ docker rm $(docker ps -aq)
```
