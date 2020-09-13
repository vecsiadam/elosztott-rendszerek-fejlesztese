# Elosztott rendszerek fejlesztese

Docker-ben futtatás:

1. Docker image-t készítés: 
```sh
docker build -t distributed-systems .
```

2. Docker image futtatás: 
```sh
docker run -p 3333:8080 distributed-systems
```

3. Alkalmazás swagger elérése:
http://localhost:3333/swagger-ui.html#/
