[![Test](https://github.com/iumehara/spring-hello-world/workflows/Test/badge.svg)](https://github.com/iumehara/spring-hello-world/actions?query=workflow%3ATest)
[![Build](https://github.com/iumehara/spring-hello-world/workflows/Build/badge.svg)](https://github.com/iumehara/spring-hello-world/actions?query=workflow%3ABuild)

# Hello World sample app

## Dependencies
- Java 8
- Gradle
- Spring Boot Starter Web/Test

## Behavior
- `GET` request to `localhost:8080/` returns list of strings 
- `POST` request to `localhost:8080/` with `"{\"sentence\":\"my greeting！\"}"` adds new greeting to DB 
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


## CI (Github Actions)
#### Test
- run all tests

#### Build
- assemble jar
- push to DockerHub