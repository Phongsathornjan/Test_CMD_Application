# Install Docker on Linux Ubuntu

This guide will help you install Docker on Ubuntu.

## Prerequisites
- Ubuntu 20.04 or later
- A user with `sudo` privileges
- Internet connection

## Step 1: Update System Packages
```sh
sudo apt update && sudo apt upgrade -y
```

## Step 2: Install Required Dependencies
```sh
sudo apt install -y ca-certificates curl gnupg
```

## Step 3: Add Docker’s Official GPG Key
```sh
sudo install -m 0755 -d /etc/apt/keyrings
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo tee /etc/apt/keyrings/docker.gpg > /dev/null
sudo chmod a+r /etc/apt/keyrings/docker.gpg
```

## Step 4: Set Up Docker Repository
```sh
echo "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```

## Step 5: Install Docker Engine
```sh
sudo apt update
sudo apt install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
```

## Step 6: Verify Docker Installation
```sh
docker --version
sudo systemctl status docker
```

## Step 7: Run Docker Without Sudo (Optional)
```sh
sudo usermod -aG docker $USER
newgrp docker
```

## Step 8: Install Git
```sh
sudo apt install -y git
```

## Step 9: Clone Project
```sh
git init
git clone https://github.com/Phongsathornjan/Test_CMD_Application.git
```

## Step 10: Build Image with Dockerfile
```sh
docker build -t my-commandline-app .
```

## Step 11: Run the Image as a Container
```sh
docker run my-commandline-app
```


