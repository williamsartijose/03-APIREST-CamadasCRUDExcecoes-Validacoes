# SistemaWSJCommerce

# Sobre o Sistema:
API REST
Conceitos importantes

- API - Application Programming Interface: é o conjunto de
funcionalidades que são expostas por uma aplicação/módulo.
Outra aplicação/módulo pode acessar essa API.
- É um contrato entre um provedor e um consumidor de
funcionalidades.

- API Web: é uma API que está disponibilizada via web. As
funcionalidades são acessadas por meio de endpoints web (host,
porta, rota, parâmetros, corpo (payload), cabeçalhos) usando
protocolo HTTP.

- API REST: é uma API Web que está em conformidade com as
restrições do padrão REST.

![Web 0](https://github.com/williamsartijose/03-APIREST-CamadasCRUDExcecoes-Validacoes/blob/main/Imagem/1.png)



# Padrão REST

- Cliente/servidor com HTTP
- Comunicação stateless
- Cache
- Interface uniforme, formato padronizado
- Sistema em camadas
- Código sob demanda (opcional)
- DOCUMENTAÇÂO: https://www.redhat.com/pt-br/topics/api/what-is-a-rest-api

![Web 2](https://github.com/williamsartijose/03-APIREST-CamadasCRUDExcecoes-Validacoes/blob/main/Imagem/2.png)

# Verbos (métodos) HTTP mais utilizados

- GET - obter recurso
- POST - criar novo recurso
- PUT - salvar recurso de forma idempotente
- DELETE - deletar recurso
- Operação idempotente = não causa novos efeitos se executada mais de uma vez
- DOCUMENTAÇÂO: https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods

# Padrão camadas Organizando a aplicação em camadas com responsabilidades definidas

- Consiste em organizar os componentes do sistema em partes denominadas camadas
- Cada camada possui uma responsabilidade específica
- componentes da mesma camada, ou da camada mais abaixo

![Web 3](https://github.com/williamsartijose/03-APIREST-CamadasCRUDExcecoes-Validacoes/blob/main/Imagem/3.png) 

![Web 4](https://github.com/williamsartijose/03-APIREST-CamadasCRUDExcecoes-Validacoes/blob/main/Imagem/4.png) 

# Como copiar dados da entity para o DTO?

- Cópia manual (set / construtor)
- Usar alguma lib que copia atributos de mesmo nome de um objeto
para outro, por exemplo: ModelMapper
https://www.baeldung.com/entity-to-and-from-dto-for-a-java-spring-application

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
<dependency>
<groupId>jakarta.validation</groupId>
<artifactId>jakarta.validation-api</artifactId>
<version>3.0.2</version>
</dependency>
<dependency>
<groupId>org.hibernate</groupId>
<artifactId>hibernate-validator</artifactId>
<version>8.0.0.CR2</version>
</dependency>
```

# Autor

William Sarti José

https://www.linkedin.com/in/william-analistadesistema/
