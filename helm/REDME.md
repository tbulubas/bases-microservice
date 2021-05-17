$ helm upgrade --install bases-microservice-chart .
Release "bases-microservice-chart" has been upgraded. Happy Helming!
NAME: bases-microservice-chart
LAST DEPLOYED: Sun May 16 21:01:34 2021
NAMESPACE: default
STATUS: deployed
REVISION: 2
NOTES:
1. Get the application URL by running these commands:
  export POD_NAME=$(kubectl get pods --namespace default -l "app.kubernetes.io/name=bases-microservice-chart,app.kubernetes.io/instance=bases-microservice-chart" -o jsonpath="{.items[0].m
etadata.name}")
  export CONTAINER_PORT=$(kubectl get pod --namespace default $POD_NAME -o jsonpath="{.spec.containers[0].ports[0].containerPort}")
  echo "Visit http://127.0.0.1:8080 to use your application"
  kubectl --namespace default port-forward $POD_NAME 8080:$CONTAINER_PORT


