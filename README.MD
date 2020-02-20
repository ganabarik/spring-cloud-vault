1)Write a dockerfile with D capital and put in the project root. please refer the contents of the Dockerfile from the project

2)To build, use the following command :

docker build -f Dockerfile -t spring-boot-docker .

3)To chech if image has been created,use the following command :
docker images

4)To run , use the following command :

docker run -p 8085:5454 spring-boot-docker

5)To list all running containter use the following command :

docker ps -a
