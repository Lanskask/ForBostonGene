# ForBostonGene

## In the beginning
На задание рекомендуем потратить не больше недели (а чем быстрее, тем лучше), 
результат выложить на ресурс github.com или bitbucket.com (репозиторий git).

Все задания необходимо реализовать на языке Java 8 и сопроводить инструкцией по сборке. 
Рекомендуем использовать системы сборки maven версии 3+ или gradle версии 2+. 
Дополнительным бонусом будет считаться наличие тестов.

## Многопоточность

Реализовать многопоточное приложение на языке Java.  
В приложение должно быть реализовано два потока:

1. Первый поток считывает введённые с клавиатуры числительные на 
английском языке (от one до nine thousand nine hundred ninety nine) 
и помещает их в память.

2. Второй поток обращается к памяти один раз в пять секунд, 
извлекает (удаляет его из памяти) самое маленькое из записанных 
чисел и выводит его на экран.

Задачу запрещается решать с помощью имеющихся потокозащищённых 
коллекций из пакета java.util.concurrent и других специальных библиотек 
от сторонних разработчиков.

## Spring user service

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
String firstname;
String lastname;
Date dirthday;
String email;
String pw_cash;
```

Пароль пользователя должен храниться в безопасной форме

Функции которые должен предоставлять сервис:
- добавление пользователя, 
- удаление пользователя, 
- поиск пользователя по email

Использовать MongnDB в качестве базы данных для хранения информации.  
Рекомендуется использовать стек технологий Spring не ниже версии 4.  
Большим преимуществом является описание dockerfile в корне проекта для 
возможности распространения сервиса в виде docker образа.  

## Twitter API

Предлагается сделать приложение, которое отправляет на twitter.com tweet с 
заданным текстом. Задание можно реализовать в виде консольного приложения, 
а можно расширить предыдущее задание, публикую tweet о добавлении каждого 
нового пользователя.  
Twitter API send tweet

## In the end
По завершению задания, просим прислать Вас ссылки на соответствующие репозитории.
