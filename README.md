#### Português ####
## Projeto API/REST ##

Projeto desenvolvido para entrevista de emprego e estudo de API's utilizando Spring Boot e banco de dados PostgreSQL.

## Requisitos ##

|Framework      | Versão    |
|:------------: | :-------: |
|Spring Boot    |  2.4.9     |
|PostgreSQL     |  12.7     |
|Java           |  1.8      |
|Maven          |  3.6.3    |

## Como funciona ##

Este é um pejeto simples para aplicação de operações CRUD¹.
Para melhor vizualização recomento utilizar Postman para realizar as operações de  POST, PUT e DELETE, e para a operação GET recomendo utilizar o navegador de sua preferência, todas as operações devem ser feitas utilizando formato json.
 
O projeto foi feito para receber as informações passadas pela url e gravar essa informação no banco de dados, podendo ser alterada e deletada. 


## Início ## 

Para iniciar o projeto, podera ser utilizado o comando na raiz do projeto: 
````
mvn spring-boot:run
````

Ou inciar normalmente caso esteja utilizando alguma IDE.

## Utilizando ## 

### POST ###
Para a operação POST do microserviço utilize o seguinte comando no terminal:
````
curl -X POST http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '[{"numero":"1524", "reu": "Exemplo"}]'
````
Caso não exita um processo com o mesmo número você vera a seguinte mensagem:
````
Processo {numero do processo} inserido com sucesso!
````

Caso ja exista um processo com esse número salvo no banco de dados a seguinte mensagem será exibida:
````
Processo de número {numero do processo} ja existe no banco de dados!
````
Se desejar enviar mais de um processo por vez, apenas adicione os processos dentro do corpo do json:
````
curl -X POST http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '[{"numero":"1524", "reu": "Exemplo"},{"numero":"1458", "reu": "Exemplo Teste"}]'
````
### GET ###
Para operações de get para melhor vizualização recomendo abrir o navegador no link http://localhost:8081/api/processo.
Caso queria solicitar pelo terminal ou Postman:
````
curl -X GET http://localhost:8081/api/processo
````

### PUT ###
Para operações de atualização, deverá ser atualizado apenas um processo por vez utilizando o seguinte comando:
````
curl -X PUT http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '{"numero":"1524", "reu": "Exemplo"}'
````

OBS: Apenas o réu será atualizado, mantendo o número do processo e o id do mesmo no banco.

## Notas ##

[¹] - CRUD: Create, Read, Update, Delete.   

------

#### English ####

## API/REST project ##

This project was developed mainly a take-home assignment and a study project.

## Requirements ##

|Framework      | Version   |
|:------------: | :-------: |
|  Spring Boot  |  2.4.9    |
|  PostgreSQL   |  12.7     |
|  Java         |  1.8      |
|  Maven        |  3.6.3    |

## How it works ##

O objetivo deste projeto é testar uma aplicação API/Rest utilizando operações CRUD¹.
Para melhor vizualização recomento utilizar Postman para realizar as operações de  POST, PUT e DELETE, e para a operação GET recomendo utilizar o navegador de sua preferência, todas as operações devem ser feitas utilizando formato json.

O projeto foi feito para receber as informações passadas pela url e gravar essa informação no banco de dados, podendo ser alterada e deletada.


## Início ## 

Para iniciar o projeto, podera ser utilizado o comando na raiz do projeto:
````
mvn spring-boot:run
````

Ou inciar normalmente caso esteja utilizando alguma IDE.

## Utilizando ## 

### POST ###
Para a operação POST do microserviço utilize o seguinte comando no terminal:
````
curl -X POST http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '[{"numero":"1524", "reu": "Exemplo"}]'
````
Caso não exita um processo com o mesmo número você vera a seguinte mensagem:
````
Processo {numero do processo} inserido com sucesso!
````

Caso ja exista um processo com esse número salvo no banco de dados a seguinte mensagem será exibida:
````
Processo de número {numero do processo} ja existe no banco de dados!
````
Se desejar enviar mais de um processo por vez, apenas adicione os processos dentro do corpo do json:
````
curl -X POST http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '[{"numero":"1524", "reu": "Exemplo"},{"numero":"1458", "reu": "Exemplo Teste"}]'
````
### GET ###
Para operações de get para melhor vizualização recomendo abrir o navegador no link http://localhost:8081/api/processo.
Caso queria solicitar pelo terminal ou Postman:
````
curl -X GET http://localhost:8081/api/processo
````

### PUT ###
Para operações de atualização, deverá ser atualizado apenas um processo por vez utilizando o seguinte comando:
````
curl -X PUT http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '{"numero":"1524", "reu": "Exemplo"}'
````

OBS: Apenas o réu será atualizado, mantendo o número do processo e o id do mesmo no banco.

## Notas ##

[¹] - CRUD: Create, Read, Update, Delete.   