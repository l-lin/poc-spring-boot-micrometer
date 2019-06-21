default: build run

build:
	mvn clean package

run:
	sudo chmod 777 -R docker/grafana && docker-compose up --build
