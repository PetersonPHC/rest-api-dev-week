# API RESTful Sistema Bancário
API RESTful Java que realiza operações de Get e Post em um Usuário que possuí uma Conta com algumas características.

Neste código foi Implentada uma APIRESTful com tratamento de exceções, Autenticação Básica para controle e acesso usando o banco de dados em memória H2.

# Diagrama de Classes
```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }

    class Account {
        -String number
        -String agency
        -Float balance
        -Float limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -Float limit
    }

    class News {
        -String icon
        -String description
    }



    User "1" *-- "1" Account
    User "1" *-- "1" Card
    User "1" *-- "*" Feature
    User "1" *-- "*" News
```

## Technologias Utilizadas:    
- Spring Boot
- Spring Web
- Open API Swagger
- JPA
- Hibernate
- Spring Security
- Gradle
