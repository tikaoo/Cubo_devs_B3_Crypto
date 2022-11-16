# Cubo_devs_B3_Crypto

# Projeto para apresentar no speed date B3
Este projeto foi criado para a participação no processo seletivo da Empresa B3 no cubo for devs. O desafio consistia em desenvolver uma aplicação em Java que consumisse a API da Alpha Vantage a fim de apresentar os dados de cryptosmoedas. Preferivelmente, a API deveria ser consumida de forma assíncrona e, como bônus, deveria-se ,utilizando MySQL, modelar em banco de dados tabelas de crypos com as cotações mínima e máxima e fornecer para o usuário uma notificação quando o esses valores fossem atingidos além do histórico desses dados por meio de uma página HTML.

---

# Estrutura do projeto

O projeto está dividido em uma arquitetura cliente-servidor. O lado do servidor foi feito em Java e consome, assíncronamente, as API's fornecidas pela Alpha Vantage para fornecer os dados da aplicação. O lado do cliente foi desenvolvido com Angular  e componentes do bootstrap. Existe também uma camada de banco de dados desenvolvida com MySQL para persistência de dados sobre empresas e suas cotações recebidas durante a execução da aplicação.

---

## Dependências utilizadas

Para a aplicação em Java foram usadas, principalmente, as dependências:

+ [Java 17.0](https://www.python.org/)
  
+ [SpringBoot)
  - Um framework web para Java com diversar bibliotecas.

Para a aplicação em Angular foram usadas, principalmente, as dependências:
+ [Angular 14.0](https://angular.io/)
  - Uma das versões mais recentes do Framework Angular para desenvolvimento WEB.
+ [Angular-CLI](https://cli.angular.io/)
  - Ferramenta de linha de comando para gerenciamento de projetos Angular.
+ [NPM](https://www.npmjs.com/)
  - Gerenciador de pacotes NodeJs
+ [Bootstrap](https://getbootstrap.com/)
  - Biblioteca com implementações estilo boostsrap para Angular.
+ [Ngx-datatable](https://github.com/swimlane/ngx-datatable)
  - Componente para criação de tabelas utilizando TypeScript, HTML e CSS.
+ [Highcharts](https://www.highcharts.com/blog/post/highcharts-and-angular-7/)
  - Componente para exibição de dados em formato gráfico.
+ [NGINX](https://www.nginx.com/)
  - Servidor HTTP usado para o deploy da aplicação.

Para a camada de banco de dados foi utilizada a seguinte dependência:
+ [MySQL 10]
  - Workbench 8.0 relacional em uma de suas versões mais atuais.
---

## Execução da aplicação

O projeto foi configurado para execução com Docker Compose. Contudo, é possível fazer a execução manualmente.

### 1 Execução manual

+ 1.1 Configurando o Angular
  - Primeiro faça o download e instalação do [Angular-CLI](https://cli.angular.io/), caso ainda não o tenha instalado em sua máquina. Depois instale o [Node.js](https://nodejs.org/en/). Vá para a pasta /Front-end e execute o comando **npm-install**, que fará o download/instalação das dependências necessárias para subir a aplicação Angular. Execute então **ng serve** ainda na pasta /Front-end, assim a aplicação client será executada na porta 4200(porta padrão do Angular).
  
---

## Testes

Dentro da pasta /tests localizada em /Back-end/modules existe um arquivo feito com pytest para teste unitário de alguns casos dos endpoints da API. Para executar esse script basta usar o comando pytest estando dentro da pasta com o arquivo de teste. O pytest cuida de fazer o processo automaticamente.

---

## Conhecimentos adquiridos e dificuldades encontradas

* Aprender a consumir uma API  em Java.
* Criar uma interface para comunicação do Java com o MySQL.

---

#### Screenshots da aplicação

![image](https://user-images.githubusercontent.com/94652044/202243694-b15f524e-4a28-4be7-b52f-e09f48ccdc39.png)
  
  
###### Considerações finais

+ Todos os dados acerca das cryptos, bem como o seus valores em tempo real pelas API's do [Alpha Vantage](https://www.alphavantage.co/)

