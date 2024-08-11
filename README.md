# API RESTful Sistema Bancário
API RESTful Java do desafio Dev Week 

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
