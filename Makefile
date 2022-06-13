.DEFAULT_GOAL := build-run

build:
	./gradlew clean build

run:
	./gradlew run

build-run: build run

run-dist:
	./build/install/app/bin/app

