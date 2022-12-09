run-dist: # запуск исполняемого файла
	./build/install/app/bin/app

lint: # проверка линтер
	./gradlew checkstyleMain

install:
	./gradlew clean install

check-updates:
	./gradlew dependencyUpdates

build:
	./gradlew clean build

.PHONY: build