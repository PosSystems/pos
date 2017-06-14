# POS-Systems

# Installation

## 1. Install Docker

Before you can install our application you need to install the following tool called "Docker":
https://docs.docker.com/engine/installation/

## 2. Start Docker

When the installation is finished start the Docker Terminal and enter the following code:

```
docker pull possystem/pos
docker run -d -p 80:8080 possystem/pos
```
This starts our Web Server.

Now you can open any Web Browser and enter the following URL:
```
http://localhost/system-1.0.0/faces/pos.xhtml
```
