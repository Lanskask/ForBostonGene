# Spring + Mongo + BCrypt 

Работает.  
Поиск по email есть.  
Шифрования пароля (BCrypt) есть.  
Docker - нет. 
  
## Задание

- Spring 4 REST
- Spring Security - для хранения паролей
- MongoDB
    - добавление пользователя, 
    - удаление пользователя, 
    - поиск пользователя по email
- dockerfile - не обязательно

В некоторой компании возникла потребность в хранении и управление учетными 
записями пользователей. Задача по реализации данных потребностей выпала вам.

Spring Rest Храниние и управление записями пользователей

Необходимо реализовать REST сервис отвечающий следующим требованиям:

Данные пользователя которые необходимо хранить:
  
- Фамилия, 
- Имя, 
- Дата рождения, 
- email 
- пароль

```
private String surname;
private String Name;
private Date dirthday;
private String email;
private String password;
```

Пароль пользователя должен храниться в безопасной форме

Функции которые должен предоставлять сервис:
- добавление пользователя, 
- удаление пользователя, 
- поиск пользователя по email

Использовать MongnDB в качестве базы данных для хранения информации.

Рекомендуется использовать стек технологий Spring не ниже версии 4.

Большим преимуществом является описание dockerfile в корне проекта для возможности распространения сервиса в виде docker образа.

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

Форматы для вставки birthday: 

```
\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\"
\"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\" 
\"EEE, dd MMM yyyy HH:mm:ss zzz\" 
\"yyyy-MM-dd\"
```