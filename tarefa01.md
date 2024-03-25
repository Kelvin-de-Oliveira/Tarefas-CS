# **REST API - Principais conceitos e características**

Neste pequeno artigo, eu tenho o intuito de trazer os principais conceitos e característcas que envolvem o tema Rest API ou API Rest. 

## **O que é uma API?**

Para melhor compreensão do tópico discutido, vamos primeiro definir resumidamente o que é uma **API**.

API é um acrônimo em ingles para **Application Programming Interface**,  em tradução livre, Interface de Programação de Aplicações. Um definição simples e resumida seria: uma interface que permite a comunicação entre aplicações. 

Vamos utilizar um exemplo simples e fora do mundo da computação para melhor exemplificar: imagine um restaurante no qual o cliente quer realizar pedidos, esse restaurante terá diversos outros clientes, na cozinha temos cozinheiro responsavel por gerenciar a cozinha e confecções dos pedidos. Não é viável que os clientes façam seus pedidos diretamente com o cozinheiro por motivos de higiente, segurança e gerenciamento, logo o restaurente possui um garçom que organiza os pedidos e repassa para o cozinheiro em uma formatação  que fique mais fácil para ele entender e atender aos pedidos. Os cliente não tem contato com o cozinheiro e vice-versa, todos eles entram em contato com o garçom da forma que é mellhor para cada um. 

No exemplo anterior, os clientes são nossos client na arquitetura web, o cozinheiro e cozinha é nossa a aplicação da qual se quer fazer requisições e seu banco de dados, o garçom nossa API. 

![Interação Cliente-API-Serivdor](https://github.com/Kelvin-de-Oliveira/tarefas-cs/blob/main/API.png)

Em síntese, uma API é um cojunto de normas estabelecidas por uma aplicação para que outras aplicações possam acessar suas funcionalidades de forma segura, sem que seja necessário saber detalhes de implementação dessa aplicação. Ou seja, seu objetivo é possibilitar a comunicação segura entre diferentes aplicações/sistemas. 

## **O que é REST? O que é RESTful** 

Agora que já temos uma noção do que é uma API, vamos discutir o conceito REST. 

