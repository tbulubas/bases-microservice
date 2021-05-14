# Docker build

#docker build --build-arg target/bases-microservice-0.0.1-SNAPSHOT.jar -t tbulubas/bases-microservice .
docker build -t tbulubas/bases-microservice .

docker image ls | grep bases

docker run -d --name bases-microservice tbulubas/bases-microservice

docker container ls -a  grep bases

docker exec -it bases-microservice bash

