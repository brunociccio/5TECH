# 5Tech Colletive

API do Projeto 5Tech Colletive 

## Integrantes do Grupo e Matérias que são responsáveis

BRUNO MATHEWS DE CICICO OLIVEIRA - RM 99097 - Java Advanced e Devops
ISABELLE CORSI - RM 97751 - Mastering Relational and Non-Relationl Database
JOSÉ LUIZ FERREIRA DUARTE - RM 99488 - Mobile Application Development
MARINA DE SOUZA CUCCO - RM 551569 - Complice, Quality Assurance and Tests e Disruptive Architectures
THALITA FACHINETE DE ALENCAR - RM 99292 - Advanced Business Development With .NET e Disruptive Architectures

## Objetivo do Projeto

Desenvolver uma ferramenta capaz de analisar o comportamento de LEADS no setor de varejo, com estudos feitos em datasets tratados no setor financeiro (em porcentagem assertiva) para transformar um interesse em negócios concretos.

## Detalhamento do Objetivo

No cenário altamente competitivo do setor de varejo, a conversão de leads em negócios concretos é crucial para o sucesso das empresas. No entanto, essa transição muitas vezes enfrenta desafios, como a falta de compreensão do comportamento dos leads e a dificuldade em identificar oportunidades promissoras. Para abordar essa questão, desenvolvemos uma ferramenta inovadora que utiliza análises avançadas de dados, com base em estudos do setor financeiro, para compreender e prever o comportamento dos leads com uma precisão notável. Ao aplicar modelos preditivos em datasets tratados do setor financeiro, nossa ferramenta oferece insights valiosos, transformando o interesse inicial em oportunidades de negócio tangíveis. Este projeto visa proporcionar às empresas do setor de varejo uma vantagem competitiva significativa, ao capacitar decisões estratégicas fundamentadas em dados e impulsionar a eficiência na conversão de leads.

## Java Advanced - Aplicação Java e Spring Boot

- Produzir pelo menos um dos domínios da solução tecnologógica utilizando Java e Spring [ok]
- Conter código que respeite a coesão e desacoplamento [ok]
- Respeitar os padrões DTO e utilizar Beans Validation [ok]
- Respeitar os conceitos fundamentais de REST [ok]
- API contendo um modelo com nível de maturidade 1 [ok]: feito com base em tudo o que aplicamos na matéria até o momento
- Utilizamos o Repository [ok]
- Utilizamos o JPA Query Methods [ok]
- O repositório está publicado no GitHub com domínio público[ok]

## Entrega

- Apresentar o cronograma de desenvolvimento e respeitar os prazos {esse item constá nessa documentação do arquivo README} - 5 pts [ok]
- Diagrama de Entidade de Relacionamento (DER) e Diagrama de Classes das Entidades constam em uma pasta nesse projeto chamada "Diagramas" - 10 pts [ok]
- Implementação das classes de Entidade necessárias para solução, atenção devida ao encapsulamento, tipagem dos atributos e ao mapeamento  objeto relacional com JPA - Consta no cronograma - primeiro Diagrama de Classe já implementado no projeto com as classes relacionadas ao Cadastro de usuários em nossa aplicação - 40 pts [ok]
- A aplicação respeita os conceitos fundamentais do REST e de acordo com a maturidade de nível 1 - 15 pts [ok]
- A gestão de configuração dos artefatos de software, o repositório está publicado devidamente no GitHub - 10 pts [ok]
- Link do GitHub - 10 pts [ok]: https://github.com/brunociccio/5TECH
- Link do Pitch no YouTube [versão 1 do Pitch, iremos produzir uma outra]: 

## Cronograma

- [ ] CRUD de Cadastro de Usuários (implementado - sprint 1)
- [ ] CRUD de Login (será implementado até a sprint 2)
- [ ] Dashboard (será implementado conforme a evoluação das telas entregues pelo responsavel de Mobile App - sprints 2, 3 e 4)
- [ ] IA (será implementando conforme o desenvolvimento dos datasets que será tratados com base em IA Generativa junto a nossa aplicação - sprints 2, 3 e 4)
- [ ] Banco de Dados (implementado parcialmente, evoluirá conforme o decorrer do projeto e a implementação das outras classes - sprint 1, 2, 3 e 4)
- [ ] Diagrama de Classes 1 - Login e Cadastro (parte de cadastro implementada / login será implementada com o nível de maturidade 2 - sprint 2)
- [ ] Diagrama de Classes 2 - Funcionalidades da Aplicação (será implementado junto a evoluação das matérias no decorrer da entraga das sprints 2, 3 e 4)
- [ ]

# Documentação da API

### Endpoints relacionados ao Cadastro do Usuário 

- [Login](#login)
- [Login Apple](#apple)
- [Login Google](#google)
- [Esqueceu Senha](#esqueceu-senha)
- [Criar conta](#criar-conta)

## Login

`POST` /login : Realiza a autenticação do usuário tatuador utilizando email e senha.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|---------
|email|string|sim|O email do usuário tatuador
|senha|string|sim|A senha do usuário tatuador

#### Exemplo de Requisição

```js
//POST /login
{
    "email": "exemplo@dominio.com",
    "senha": "senha123"
}
```

#### Exemplo de Resposta

```js
{
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
}
```

#### Códigos de Status [status code]

|código|descrição
|------|---------
|200|Autenticação bem sucedida
|400|Validação falhou. Verifique o corpo da requisição
|401|Credenciais inválidas. Verifique o email e senha fornecidos
|404|Usuário não encontrado

## Login Apple

`POST` /login/apple : Realiza a autenticação do usuário tatuador utilizando a autenticação da Apple.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|---------
|token|string|sim|O token de autenticação Apple

#### Exemplo de Requisição

```js
//POST /login/apple
{
    "token": "apple_token_here"
}
```

#### Exemplo de Resposta

```js
{
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
}
```

#### Códigos de Status [status code]

|código|descrição
|------|---------
|200|Autenticação bem sucedida
|400|Validação falhou. Verifique o corpo da requisição
|401|Credenciais inválidas. Verifique o email e senha fornecidos

## Login Google

`POST` /login/google : Realiza a autenticação do usuário tatuador utilizando a autenticação do Google.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|---------
|token|string|sim|O token de autenticação do Google

#### Exemplo de Requisição

```js
//POST /login/google
{
    "token": "google_token_here"
}
```

#### Exemplo de Resposta

```js
{
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
}
```

#### Códigos de Status [status code]

|código|descrição
|------|---------
|200|Autenticação bem sucedida
|400|Validação falhou. Verifique o corpo da requisição
|401|Credenciais inválidas. Verifique o email e senha fornecidos

## Esqueceu Senha

`POST` /esqueceu-senha : Envia um email de recuperação de senha para o usuário tatuador.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|---------
|email|string|sim|O email do usuário tatuador

#### Exemplo de Requisição

```js
//POST /esqueceu-senha
{
    "email": "exemplo@dominio.com"
}
```

#### Exemplo de Resposta

```js
{
     "message": "Email de recuperação de senha enviado com sucesso"
}
```

#### Códigos de Status [status code]

|código|descrição
|------|---------
|200|Autenticação bem sucedida
|400|Validação falhou. Verifique o corpo da requisição
|404|Usuário não encontrado

## Criar Conta

`POST` /criar-conta : Cria uma nova conta de usuário tatuador.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|---------
|nome|string|sim|O nome do usuário tatuador
|email|string|sim|O email do usuário tatuador
|senha|string|sim|A senha do usuário tatuador

#### Exemplo de Requisição

```js
//POST /criar-conta
{
    "nome": "Exemplo",
    "email": "exemplo@dominio.com",
    "senha": "senha123"
}
```

#### Exemplo de Resposta

```js
{
    "message": "Conta criada com sucesso"
}
```

#### Códigos de Status [status code]

|código|descrição
|------|---------
|200|Autenticação bem sucedida
|400|Validação falhou. Verifique o corpo da requisição
|409|Conflito. O email já está em uso por outra conta
