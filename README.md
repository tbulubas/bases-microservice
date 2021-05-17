# Docker 
## Build

#docker build --build-arg target/bases-microservice-0.0.1-SNAPSHOT.jar -t tbulubas/bases-microservice .
docker build -t tbulubas/bases-microservice .

docker image ls | grep bases

## Test
docker run -d -p 8080:8080 --name bases-microservice tbulubas/bases-microservice

docker container ls -a | grep bases

docker exec -it bases-microservice bash

## Check
curl -X GET http://localhost:8080/books

# Helm 

## Prepare
kubectl create namespace test-bases

## Deploy
cd helm
helm install bases-microservice -n test-bases .

kubectl get pods -n test-bases

## Forward port
export POD_NAME=$(kubectl get pods --namespace test-bases -l "app.kubernetes.io/name=bases-microservice-chart,app.kubernetes.io/instance=bases-microservice" -o jsonpath="{ .items[0].metadata.name}")
export CONTAINER_PORT=$(kubectl get pod --namespace test-bases $POD_NAME -o jsonpath="{.spec.containers[0].ports[0].containerPort}")
echo "Visit http://127.0.0.1:8080 to use your application"
kubectl --namespace test-bases port-forward $POD_NAME 8080:$CONTAINER_PORT

## Check
curl -X GET http://localhost:8080/books
