# TESTE Projedata Informática

## Sistema Operacional:

Ubuntu 22.04

## O que estou fazendo:

### No Frontend:

Estou utilizando o **Angular**, importei pelo script direto no *HTML*, assim não precisei instalar o angular por **npm ou yarn**.

```html
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript">
```

Esta localizado em: ```/src/main/resources/META-INF/resources/index ```.

### No Backend:

Estou utilizando o [Quarkus](https://quarkus.io/) framework Java, usando o Json REST Service. Para iniciar o servidor use o comando ``` quarkus dev ```.

Esta localizado em: ```/src/main/org.acme.rest.json/Product ```.

Esta localizado em: ```/src/main/org.acme.rest.json/ProductResource ```.

### No Banco de Dados:

Estou subindo uma imagem com *docker-compose* do banco **postgres**, criando as tabelas através do script SQL.
O arquivo *YML* que fiz é:
```yml
version: '3.8'
services:
  projedata-db:
    image: postgres:13
    ports:
      - 5436:5436
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: 159159
      POSTGRES_DB: projedata
    networks:
      - projedata
networks:
  projedata: 
```

Para iniciar o container:
```docker
docker container start "id_do_container"
```
Com isso você ja poderá usar seu banco de dados. Utilizei o **DBeaver** que é um administrador de banco de dados.

### Script SQL:

```POSTGRESQL
create table product(
id INT not null,
name VARCHAR(30),
value int,
primary key (id)
);

create table rawMaterial(
id INT not null,
name VARCHAR(30),
value int,
quantity int,
primary key (id)
);
```