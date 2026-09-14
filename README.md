# Design Patterns em Java

Projeto acadêmico desenvolvido em equipe para a disciplina de Programação Orientada a Objetos (POO), com foco na aplicação prática de padrões de projeto em Java.

## 📌 Sobre o projeto

O projeto simula um sistema simples de produtos e carrinho de compras, permitindo visualizar na prática como diferentes Design Patterns podem ser utilizados para organizar e flexibilizar a estrutura de uma aplicação.

A aplicação trabalha com produtos do tipo camisa, permitindo selecionar diferentes modelos, personalizar características e adicionar opções extras ao produto antes de incluí-lo no carrinho.

## 🧩 Design Patterns utilizados

### Factory

Utilizado para a criação de diferentes tipos de produtos, como camisas sociais e esportivas, centralizando a lógica de instanciação.

Exemplos:
- `CamisaFactory`
- `CamisaSocialFactory`
- `CamisaEsportivaFactory`

### Decorator

Utilizado para adicionar funcionalidades ou características aos produtos de forma dinâmica, sem alterar diretamente sua estrutura original.

Exemplos:
- `ProductDecorator`
- `EstampaDecorator`
- `GolaPoloDecorator`

### Prototype

Utilizado para criar novos produtos a partir da clonagem de objetos existentes, permitindo personalizar uma cópia sem modificar o produto original.

O fluxo principal utiliza `clone()` para criar uma cópia do produto selecionado antes de realizar sua personalização.

## ⚙️ Funcionalidades

- Visualização dos produtos disponíveis;
- Seleção de produtos para o carrinho;
- Personalização de cor e tamanho;
- Adição de extras, como estampa e gola polo;
- Criação de produtos por meio de Factory;
- Clonagem de produtos utilizando Prototype;
- Personalização dinâmica utilizando Decorator;
- Visualização dos produtos adicionados ao carrinho.

## 🛠️ Tecnologias

- Java
- Programação Orientada a Objetos
- Design Patterns

## ▶️ Como executar

### Pré-requisitos

- Java JDK instalado.

### Execução

Clone o repositório:

```bash
git clone https://github.com/Rozane-Raquel/projeto-design-patterns.git
