.PHONY: build

test:
	./gradlew test

build:
	./gradlew assemble

start:
	source .env.local && java -jar ./build/libs/helloworld-0.0.1-SNAPSHOT.jar

build_docker:
	./gradlew assemble
	docker build -t helloworld .
	cd src/main/resources/db && docker build -t helloworld_db .
	docker-compose build

start_docker:
	docker-compose up

login_minikube_k8s:
	minikube start --driver=virtualbox

login_tks_k8s:
	./pod/bin/kubectl-tks-login.sh

build_k8s:
	./pod/bin/create-db.sh
	./pod/bin/create-app.sh

stop_k8s:
	./pod/bin/delete-app.sh
	./pod/bin/delete-db.sh
