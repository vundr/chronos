# Maven
build-common:
	./mvnw -f libs/common-starter/pom.xml clean install

build-bootstrapper:
	./mvnw -f modules/bootstrapper clean install
