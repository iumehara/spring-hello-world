#!/bin/bash

kubectl create -f pod/configmap-definition.yaml
kubectl create -f pod/deployment-definition.yaml
kubectl create -f pod/service-definition.yaml
kubectl get svc helloworld
minikube ip
