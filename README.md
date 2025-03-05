# Test Command Line Application
## How to build image and Run as a container
step 1.) clone project
``` bash
git init
git clone https://github.com/Phongsathornjan/Test_CMD_Application.git
```
step 2.) build image with dockerfile
``` bash
docker build -t my-commandline-app .
```
step 3.) after build image. Then run you image as a container
``` bash
docker run my-commandline-app
```
