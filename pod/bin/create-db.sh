#!/bin/bash

kubectl create -f pod/db/db-configmap-definition.yaml
kubectl create -f pod/db/db-volume-definition.yaml
kubectl create -f pod/db/db-deployment-definition.yaml
kubectl create -f pod/db/db-service-definition.yaml
kubectl get pvc postgres-pvc
kubectl get svc postgres
minikube ip
