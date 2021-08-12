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
 
O projeto foi feito para receber as informações passadas em formato json e gravar essa informação no banco de dados, podendo ser alterada e deletada posteriormente. 


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

### DELETE ###
Para operações de DELETE poderá ser enviado um ou mais processo no corpo do json:
````
curl -X DELETE http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '[{"numero":"1524", "reu": "Exemplo"},{"numero":"1458", "reu": "Exemplo Teste"}]'
````

## Notas ##

[¹] - CRUD: Create, Read, Update, Delete. São operações cruciais na operação de banco de dados.   

------
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

This is a simple project to test and learn about CRUD¹ operations.

To better visualize the POST, PUT, and DELETE operations is recommended to use the terminal or Postman, and for the GET operation is better visualized in your preference browser, all the operations must be done with json format.

The project was done to receive data in a json format and save them in the database, being able to be changed and deleted afterwards.


## Start ## 

The project start can be done by executing the following command on the terminal at the project root:
````
mvn spring-boot:run
````

Or start normally if using an IDE.

## Using ## 

### POST ###
For the POST operations use the following command on the terminal:
````
curl -X POST http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '[{"numero":"1524", "reu": "Exemplo"}]'
````
If there isn't a process with the same number you'll see the following message:
````
Processo {numero do processo} inserido com sucesso!
````
If there is already a process with that number the following message will be displayed:
````
Processo de número {numero do processo} ja existe no banco de dados!
````
If you wish to send more than one process, just add them to the json body:
````
curl -X POST http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '[{"numero":"1524", "reu": "Exemplo"},{"numero":"1458", "reu": "Exemplo Teste"}]'
````
### GET ###
For better visualization of the GET operation is recommended to use a browser and go to the link http://localhost:8081/api/processo.
You may use the terminal as well using the following command:
````
curl -X GET http://localhost:8081/api/processo
````

### PUT ###
For the update operations, must be send just one process each time using the following command:
````
curl -X PUT http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '{"numero":"1524", "reu": "Exemplo"}'
````

PS: Only the defendant will be updated, the number and id will remain the same.

### DELETE ###
And for the delete operations you can send more than one process each time with the following command: 
````
curl -X DELETE http://localhost:8081/api/processo -H "Content-Type: application/json" \  -d '{"numero":"1524", "reu": "Exemplo"}'
````

## NOTES ##

[¹] - CRUD: Create, Read, Update, Delete. They are crucial database operations.   