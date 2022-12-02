# Pre-requirement
Install docker and docker-compose

# Download Redis image
```bash
$ docker pull bitnami/redis:latest
```

# Run Redis as Container for dev 
```bash
$ docker run -d --name redis-stack-server -p 6379:6379 redis/redis-stack-server:latest
```

# Run Redis in docker-compose
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
