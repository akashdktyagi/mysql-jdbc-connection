## MySQL - JDBC Connection

To test the connections we need to have MySQL database in place. There are many ways to do it but simplest of all is using Docker.
This tutorial uses latest My SQL Docker image to test the java-mq sql connection.

---
### Steps:
* First you need to install Docker-Desktop. To install Docker follow below link:
 [Docker-Desktop](https://www.docker.com/products/docker-desktop)
 
* Once docker is installed, go to Docker-Desktop settings and increase the memory to at least 2 GB (more the better, if you have 8 GB RAM, then give 4 GB).

> ![Image](Screenshot%202020-11-24%20at%203.36.10%20PM.png)

* Open Command Prompt and run: ```docker pull mysql:latest```
* Run ```docker run --name mysql-db -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest``` 
* Note the password. ```MYSQL_ROOT_PASSWORD=123456```. We will need it later.


```shell script

Akashs-MacBook-Pro:mysql-jdbc-connection akashtyagi$ git add .
Akashs-MacBook-Pro:mysql-jdbc-connection akashtyagi$ docker pull mysql
Using default tag: latest
latest: Pulling from library/mysql
852e50cd189d: Pull complete 
29969ddb0ffb: Pull complete 
a43f41a44c48: Pull complete 
5cdd802543a3: Pull complete 
b79b040de953: Pull complete 
938c64119969: Pull complete 
7689ec51a0d9: Pull complete 
a880ba7c411f: Pull complete 
984f656ec6ca: Pull complete 
9f497bce458a: Pull complete 
b9940f97694b: Pull complete 
2f069358dc96: Pull complete 
Digest: sha256:4bb2e81a40e9d0d59bd8e3dc2ba5e1f2197696f6de39a91e90798dd27299b093
Status: Downloaded newer image for mysql:latest
docker.io/library/mysql:latest
Akashs-MacBook-Pro:mysql-jdbc-connection akashtyagi$ docker run --name mysql-db -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest
f00b49fdd9f6b6e148d332b405433dc7996f48455d4d889b0ff79eb2ed4f10e2
Akashs-MacBook-Pro:mysql-jdbc-connection akashtyagi$ 

```

docker

docker run --name some-mysql -v /my/own/datadir:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:tag

docker run --name mysql-db -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest

> ![Image](Screenshot%202020-11-24%20at%203.21.49%20PM.png)

https://hub.docker.com/_/mysql


