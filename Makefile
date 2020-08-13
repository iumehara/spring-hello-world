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


