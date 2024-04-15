# 5Tech Colletive

API do Projeto 5Tech Colletive 

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
- Link do GitHub - 10 pts [ok]: https://github.com/brunociccio/5TECH
























## Requisitos

- [ ] CRUD de Categorias
- [ ] CRUD de Movimentações
- [ ] CRUD de Usuários
- [ ] Autenticação
- [ ] Dashboard

## Documentação da API

### Endpoints 

- [Listar Categorias](#listar-categorias)
- [Cadastrar Categoria](#cadastrar-categoria)
- [Detalhar Categoria](#detalhar-categoria)
- [Apagar Categoria](#apagar-categoria)
- [Atualizar Categoria](#atualizar-categoria)


### Listar Categorias

`GET` /categoria

Retorna um array com as categorias do usuário autenticado.

#### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Alimentação",
        "icone": "fast-food"
    }
]
```

#### Códigos de Status

|código|descrição
|------|---------
|200| Lista de categorias retornada com sucesso
|401| Não autenticado. Se autentique em /login

---

### Cadastrar Categoria

`POST` /categoria

Cadastra uma categoria com os dados enviados no corpo da requisição

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|---------
|nome|string|✅|Um nome curto para a categoria
|icone|string|❌|O nome do ícone conforme Material Icons

#### Exemplo de Requisição
```js
// POST /categoria
{
    "nome": "Alimentação"
}
```

#### Exemplo de Resposta
```js
{
    "id": 1
    "nome": "Alimentação",
    "icone": "fast-food"
}
```

#### Códigos de Status

|código|descrição
|------|---------
|201| Categoria criada com sucesso
|400| Validação falhou. Verifique o corpo da requisição
|401| Não autenticado. Se autentique em /login

---

### Detalhar Categoria

`GET` /categoria/`{id}`

Retorna os detalhes da categoria com o `id` informado no path.

#### Exemplo de Resposta
```js
// GET /categoria/1
{
    "id": 1
    "nome": "Alimentação",
    "icone": "fast-food"
}
```

#### Códigos de Status

|código|descrição
|------|---------
|200| Categoria retornada com sucesso
|401| Não autenticado. Se autentique em /login
|403| Não autorizado. Essa categoria não pertence ao usuário autenticado
|404| Não existe categoria com o `id` informado
---

### Apagar Categoria

`DELETE` /categoria/`{id}`

Apaga a categoria com o `id` informado no path

#### Códigos de Status

|código|descrição
|------|---------
|204| Categoria apagado com sucesso
|401| Não autenticado. Se autentique em /login
|403| Não autorizado. Essa categoria não pertence ao usuário autenticado
|404| Não existe categoria com o `id` informado
---

### Atualizar Categoria

`PUT` /categoria/`{id}`

Atualiza os dados da categoria com o `id` informado no path, utilizando as informações do corpo da requisição


#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|---------
|nome|string|✅|O novo nome curto para a categoria
|icone|string|✅|O novo nome do ícone conforme Material Icons

#### Exemplo de Requisição
```js
// PUT /categoria/1
{
    "nome": "Restaurante",
    "icone": "fast-food"
}
```

#### Exemplo de Resposta
```js
{
    "id": 1
    "nome": "Restaurante",
    "icone": "fast-food"
}
```

#### Códigos de Status

|código|descrição
|------|---------
|200| Categoria atualizada com sucesso
|400| Validação falhou. Verifique o corpo da requisição
|401| Não autenticado. Se autentique em /login
|403| Não autorizado. Essa categoria não pertence ao usuário autenticado
|404| Não existe categoria com o `id` informado
---