mkdir -p multiproject-gradle
mkdir -p multiproject-gradle/shared
mkdir -p multiproject-gradle/services
mkdir -p multiproject-gradle/app

cd multiproject-gradle
gradle init --type java-library

cp -r src shared/
cp -r src services/
cp -r src app/

rm -rf src/