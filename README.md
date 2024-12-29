<h1 align="center">
  Desafio AutoScore
</h1>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.


## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Tarefa
- 
$ Metodo Post http://localhost:8080/veiculos

 ![Get-veiculos - AluraFilmes 22_12_2024 15_52_03](https://github.com/user-attachments/assets/d72d862d-e221-4751-8854-4f7e6650e77a)


```

- Listar Tarefas
```
$  Metodo Get http://localhost:8080/veiculos

![Get-veiculos - AluraFilmes 22_12_2024 15_51_36](https://github.com/user-attachments/assets/bb16f589-effd-4e5f-9d4e-9fa8235ce7c6)


```

- Atualizar Tarefa
```
$ Metodo Put http://localhost:8080/veiculos/1

![Get-veiculos - AluraFilmes 22_12_2024 15_52_28](https://github.com/user-attachments/assets/3b058eb2-f490-4d85-8e7e-64b41755fb15)

```

- Remover Tarefa
```
Metodo Delete http://localhost:8080/veiculos/1

![Get-veiculos - AluraFilmes 22_12_2024 15_53_01](https://github.com/user-attachments/assets/f9e99fc6-5b20-48d7-9570-446a5e82a22b)


```
