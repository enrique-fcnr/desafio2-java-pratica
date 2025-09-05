# 🛒 Sistema de Cadastro de Produtos  

## 📌 Descrição do Projeto  
Este projeto foi desenvolvido como parte de um desafio de **Java Orientado a Objetos**.  

O objetivo era criar uma aplicação que:  
- Permitisse o cadastro de diferentes tipos de produtos: **comum, usado e importado**.  
- Utilizasse **herança e polimorfismo** para tratar as peculiaridades de cada tipo de produto.  
- Formatasse corretamente a saída das informações, destacando preços, taxas alfandegárias e datas de fabricação.  

Dessa forma, o programa exibe ao final uma lista com o *price tag* de todos os produtos cadastrados.  

---

## 🚀 O que foi entregue  
A entrega consiste em uma aplicação console (`Program.java`) que:  
- Pergunta ao usuário quantos produtos deseja cadastrar.  
- Para cada produto, solicita:  
  - Tipo (comum, usado ou importado).  
  - Nome.  
  - Preço.  
  - Data de fabricação (caso seja usado).  
  - Taxa alfandegária (caso seja importado).  
- Cria os objetos correspondentes (`Product`, `UsedProduct`, `ImportedProduct`).  
- Armazena os produtos em uma lista e, ao final, imprime o preço de cada um formatado com suas informações específicas.  

---

## 📂 Estrutura do Projeto  

src/
├── application/
│ └── Program.java
└── entities/
├── Product.java
├── UsedProduct.java
└── ImportedProduct.java


---

## 🛠️ Tecnologias e Conceitos Utilizados  

**Java SE** (linguagem principal)  
**Paradigma de Orientação a Objetos:**  
- **Encapsulamento** → atributos privados com getters e setters.  
- **Herança** → `Product` como classe base e `UsedProduct`/`ImportedProduct` como subclasses.  
- **Polimorfismo** → método sobrescrito `priceTag()` em cada subclasse para personalizar a saída.  

**Outros conceitos:**  
- **Coleções:** uso de `List<Product>` para armazenar produtos.  
- **Formatação de datas:** `SimpleDateFormat` para exibir datas no padrão `dd/MM/yyyy`.  
- **Formatação monetária:** `Locale.setDefault(Locale.US)` para garantir padrão de ponto flutuante.  
- **Entrada de dados via console:** `Scanner`.  

O código foi estruturado de forma **enxuta e limpa**, evitando duplicações desnecessárias e utilizando **boas práticas de OOP** para organizar a lógica.  

---

## 📖 Exemplo de Interação  

Enter number of products: 3
Product #1 data:
Common, used or imported (c/u/i): c
Name: Laptop
Price: 1100.00

Product #2 data:
Common, used or imported (c/u/i): u
Name: iPhone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2017

Product #3 data:
Common, used or imported (c/u/i): i
Name: Tablet
Price: 700.00
Customs fee: 20.00

➡️ Saída esperada:

PRICE TAGS:
Laptop $1100.00
iPhone (used) $400.00 (Manufacture date: 15/03/2017)
Tablet $720.00 (Customs fee: $20.00)

