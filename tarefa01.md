# **REST API - Principais conceitos e características**

Neste pequeno artigo, eu tenho o intuito de trazer os principais conceitos e característcas que envolvem o tema Rest API ou API Rest. 

## **O que é uma API?**

Para melhor compreensão do tópico discutido, vamos primeiro definir resumidamente o que é uma **API**.

API é um acrônimo em ingles para **Application Programming Interface**,  em tradução livre, Interface de Programação de Aplicações. Um definição simples e resumida seria: uma interface que permite a comunicação entre aplicações. 

Vamos utilizar um exemplo simples e fora do mundo da computação para melhor exemplificar: imagine um restaurante no qual o cliente quer realizar pedidos, esse restaurante terá diversos outros clientes, na cozinha temos cozinheiro responsavel por gerenciar a cozinha e confecções dos pedidos. Não é viável que os clientes façam seus pedidos diretamente com o cozinheiro por motivos de higiente, segurança e gerenciamento, logo o restaurente possui um garçom que organiza os pedidos e repassa para o cozinheiro em uma formatação  que fique mais fácil para ele entender e atender aos pedidos. Os cliente não tem contato com o cozinheiro e vice-versa, todos eles entram em contato com o garçom da forma que é mellhor para cada um. 

No exemplo anterior, temos os clientes sendo aqueles que fazem as requisições, o cozinheiro e cozinha são a aplicação da qual se quer usar as funcionalidades e seu banco de dados, respectivamente, e o garçom nossa API. 



![](https://github.com/Kelvin-de-Oliveira/tarefas-cs/blob/main/API.png)

Em síntese, uma API é um cojunto de normas, rotinas e padrões estabelecidos por uma aplicação para que outras aplicações possam acessar suas funcionalidades de forma segura, sem que seja necessário saber detalhes de sua implementação. Ou seja, seu objetivo é possibilitar a comunicação segura entre diferentes aplicações/sistemas. 

## **O que é uma REST API? O que é RESTful** 

Agora que sabemos o que é e para o que serve uma API, podemos partir para o conceito de **REST API**. 
Para começarmos, o que é **REST**? 

REST é o acrônimo em ingles para **Representational State Transfer**, em tradução livre, Transferência de Estado Representacional, que é um conjunto de restrições (_constraints_) arquiteturais que definem como deve ocorrer a transferência de dados entre aplicações utilizando o protocolo HTTP. Assim, **RESTful API** é toda API que se adequa a essas restrições.

### **6 Constraints para cumprir e ser RESTful!**
Como discutido anteriormente, para ser RESTful a API precisa respeitar as restrições arquiteturais REST que são as seguintes: 

1. **Uniform interface (interface Uniforme)**
2. **Client-Server (Desacoplamento cliente-servidor)**
3. **Stateless (Sem estado definido)**
4. **Cacheable (armazenamento em cache)**
5. **Layered System (Arquitetura de sistema em camadas)**
6. **Code on demand (Código sob demanda)** - opcional