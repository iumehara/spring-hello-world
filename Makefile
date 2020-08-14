test:
	./gradlew test

build:
	./gradlew assemble

start:
	java -jar ./build/libs/helloworld-0.0.1-SNAPSHOT.jar

build_docker:
	docker build -t example/helloworld .

start_docker:
	docker run -p 8080:8080 example/helloworld


login_minikube_k8s:
	minikube start --driver=virtualbox

login_tks_k8s:
	./pod/kubectl-tks-login.sh

build_k8s:
	kubectl create -f pod/deployment-definition.yaml
	kubectl create -f pod/service-definition.yaml
