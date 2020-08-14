![Java CI with Gradle](https://github.com/iumehara/spring-hello-world/workflows/Java%20CI%20with%20Gradle/badge.svg)

# Hello World sample app

## Dependencies
- Java 8
- Gradle
- Spring Boot Starter Web/Test

## Behavior
- GET request to "localhost:8080/" returns "hello world!" 
- 2 passing tests (one @SpringBootTest and one unit test) 

## Test/Build/Run
#### Local
- `make test`
- `make build`
- `make start`

#### Docker
- `make build_docker`
- `make start_docker`

#### Kubernetes
- `make build_k8s`

uses [iumehara/spring-hello-world image](https://hub.docker.com/r/iumehara/spring-hello-world) from dockerhub 
