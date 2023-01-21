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
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Apex Charts
- Expo
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/williamsartijose/SistemaWSJCommerce

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/williamsartijose/SistemaWSJCommerce

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```



### Modelo conceitual 
![Web 0](https://github.com/williamsartijose/SistemaWSJCommerce/blob/main/Nova%20pasta/imgDoc/49daadd836f3ce8f307b4ceaa4240e28-0.jpg)
![Web 1](https://github.com/williamsartijose/SistemaWSJCommerce/blob/main/Nova%20pasta/imgDoc/49daadd836f3ce8f307b4ceaa4240e28-1.jpg)
![Web 2](https://github.com/williamsartijose/SistemaWSJCommerce/blob/main/Nova%20pasta/imgDoc/49daadd836f3ce8f307b4ceaa4240e28-2.jpg)
![Web 3](https://github.com/williamsartijose/SistemaWSJCommerce/blob/main/Nova%20pasta/imgDoc/49daadd836f3ce8f307b4ceaa4240e28-3.jpg)
![Web 4](https://github.com/williamsartijose/SistemaWSJCommerce/blob/main/Nova%20pasta/imgDoc/49daadd836f3ce8f307b4ceaa4240e28-4.jpg)
![Web 5](https://github.com/williamsartijose/SistemaWSJCommerce/blob/main/Nova%20pasta/imgDoc/49daadd836f3ce8f307b4ceaa4240e28-5.jpg)
![Web 6](https://github.com/williamsartijose/SistemaWSJCommerce/blob/main/Nova%20pasta/imgDoc/49daadd836f3ce8f307b4ceaa4240e28-6.jpg)
![Web 7](https://github.com/williamsartijose/SistemaWSJCommerce/blob/main/Nova%20pasta/imgDoc/49daadd836f3ce8f307b4ceaa4240e28-7.jpg)


# Autor

William Sarti José

https://www.linkedin.com/in/william-analistadesistema/
