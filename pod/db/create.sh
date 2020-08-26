kubectl create -f db-configmap-definition.yaml
kubectl create -f db-volume-definition.yaml
kubectl create -f db-deployment-definition.yaml
kubectl create -f db-service-definition.yaml
kubectl get pvc postgres-pvc
kubectl get svc postgres
minikube ip

