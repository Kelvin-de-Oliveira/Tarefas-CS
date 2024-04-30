# **REST API - Principais conceitos e características**

Neste pequeno artigo, vou tentar trazer de forma resumida e simples os principais conceitos  e características acerca do tema REST API. 

## **O que é uma API?** 🙇

Para melhor compreensão do tópico discutido, vamos primeiro definir resumidamente o que é uma **API**.

API é um acrônimo em inglês para **Application Programming Interface**,  em tradução livre, Interface de Programação de Aplicações. Um definição simples e resumida seria: uma interface que permite a comunicação entre aplicações. 

Vamos utilizar um exemplo simples e fora do mundo da computação para melhor exemplificar: imagine um restaurante no qual o cliente quer realizar pedidos, esse restaurante terá diversos outros clientes, na cozinha temos cozinheiro responsável por gerenciar a cozinha e pela confecções dos pedidos. Não é viável que os clientes façam seus pedidos diretamente com o cozinheiro por motivos de higiente, segurança e gerenciamento, logo o restaurente possui um garçom que organiza os pedidos e repassa para o cozinheiro em uma formatação  que fique mais fácil para ele entender e atender aos pedidos. Os clientes não tem contato com o cozinheiro e vice-versa, todos eles entram em contato com o garçom da forma que é mellhor para cada um. 

No exemplo anterior, temos os clientes sendo aqueles que fazem as requisições, o cozinheiro e cozinha são a aplicação da qual se quer usar as funcionalidades e seu banco de dados, respectivamente, e o garçom nossa API. 



![](https://github.com/Kelvin-de-Oliveira/tarefas-cs/blob/main/atividade01/API.png)

Em síntese, uma API é um cojunto de normas, rotinas e padrões estabelecidos por uma aplicação para que outras aplicações possam acessar suas funcionalidades de forma segura, sem que seja necessário saber detalhes de sua implementação. Ou seja, seu objetivo é possibilitar a comunicação segura entre diferentes aplicações/sistemas. 

## **O que é uma REST API? O que é RESTful?**  👀

Agora que sabemos o que é e para o que serve uma API, podemos partir para o conceito de **REST API**. 
Para começarmos, o que é **REST**? 

REST é o acrônimo em inglês para **Representational State Transfer**, em tradução livre, Transferência de Estado Representacional, que é um conjunto de restrições (_constraints_) arquiteturais que definem como deve ocorrer a transferência de dados entre aplicações utilizando o protocolo HTTP. Assim, **RESTful API** é toda API que se adequa a essas restrições.

### **6 _Constraints_ para cumprir e ser RESTful! 😄**
Como discutido anteriormente, para ser RESTful a API precisa respeitar as restrições arquiteturais REST, que são as seguintes: 


1. **Uniform interface (interface Uniforme)**:
 Independente do dispositivo ou aplicativo que realiza a requisição, a API deve interagir com o servidor que disponiliza o recurso sempre da mesma forma. 
2. **Client-Server (Desacoplamento cliente-servidor)**: Separação total do aplicativo cliente e do servidor. O cliente não deve saber nada sobre o armazenamento dos dados a não ser a URI dos recursos requisitados, assim como o aplicativo servidor deve apenas transferir os dados solicitados via HTTP e não interagir de nehuma outra forma com o cliente. Como essa prática é padrão dentro do desenvolvimento web, possivelmente é a restrição mais fácil e "intuitiva" de se seguir. 

3. **Stateless (Sem estado definido)**: Toda requisição precisa conter toda informação necessária para o servidor atender e responder. Cada requisição conta como uma requisição nova, o servidor não armazena nada sobre a solicitação anterior de um cliente, ou seja, não existe nenhuma sessão do lado do servidor.

4. **Cacheable (armazenamento em cache)**: Visando aumentar o desempenho do cliente e a escalabilidade do servidor, as respostas para uma requisição devem informar se aquele recurso pode ser armazenado em cache e, caso positivo, a resposta deve ser armazenada dessa forma. 

5. **Layered System (Arquitetura de sistema em camadas)**: As restrições REST permitem o uso de uma arquitetura de sistema em camadas, onde as requisições e respostas passam por diferentes camadas até chegarem ao cliente ou servidor final. Possivelmente, haverá inúmeros intermediários. Nem o cliente nem o servidor devem estar cientes da complexidade ou dos passos necessários para que a resposta/requisição chegue até eles; eles não devem ser capazes de distinguir se estão conectados a um aplicativo final ou a um intermediário.

6. **Code on demand (Código sob demanda) - opcional**: Essa _constraint_ é opcional. Portanto, se sua API segue as 5 restrições anteriores, sua API já é RESTful. No entanto, caso seja necessário, o seu aplicativo servidor pode enviar código executável como resposta para ser executado no aplicativo cliente e o código será executado apenas sob demanda. 


Pronto! Agora sabemos o que é uma API, uma REST API (ou API REST) e o que é ser RESTful. 😎 


**Referências Bibliográficas**: 
* GUPTA, Lokesh. REST API Tutorial. **restfulapi**, 2023. Disponível em:  https://restfulapi.net/rest-architectural-constraints. Acesso em: 25/03/2024
* O que é uma API de REST?. **IBM**. Disponível em: https://www.ibm.com/br-pt/topics/rest-apis. Acesso em: 25/03/2024
* ThehungryBrain. REST API Architectural Constraints. **geeksforgeeks**, 2023. Disponível em: https://www.geeksforgeeks.org/rest-api-architectural-constraints. Acesso em: 25/03/2024



