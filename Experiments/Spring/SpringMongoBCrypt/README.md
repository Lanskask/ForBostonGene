# gs-accessing-mongodb-data-rest 

Работает.  
Поиск по email есть.  
Шифрования пароля нет (BCrypt нет).  

## Использовано

- [Spring Guides: Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)

- [GitHub Source Code](https://github.com/spring-guides/gs-accessing-mongodb-data-rest.git)

## Usage:

- Общая информация:
```
curl http://localhost:8080
```

- Все Persons:
```
curl http://localhost:8080/people
```

- Новый Person:   
```
curl -i -X POST -H \
"Content-Type:application/json" -d \
"{ \"firstName\": \"Bilbo 3\", \"password\": \"123456\", \"email\": \"somemail2@mail.fd\" }" \
http://localhost:8080/people
```

- Обновление имеющегося:
```
curl -X PATCH -H \
"Content-Type:application/json" -d \
"{ \"firstName\": \"Bilbo Jr.\", \"password\": \"123456\"}" \
http://localhost:8080/people/58cb65b4e3ef8c2d67f45887
```

- Поиск по email:
```
curl http://localhost:8080/people/search/findByEmail?name=somemail1@mail.fd
```

- Удаление:
```
curl -X DELETE http://localhost:8080/people/53149b8e3004990b1af9f229
```

