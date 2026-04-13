# 📚 Library Management Console

Projeto de estudos em Java para gerenciamento de livros no console, com cadastro manual, empréstimo, devolução, integração com a Google Books API e geração de arquivos JSON.

---

## 🚀 Funcionalidades

- Adicionar livro manualmente
- Listar livros cadastrados
- Emprestar livro
- Devolver livro
- Buscar livro na Google Books API
- Gerar arquivo JSON com os dados do livro
- Impedir cadastro duplicado pelo título
- Exibir status do livro (Disponível / Emprestado)

---

## 🛠️ Tecnologias utilizadas

- Java  
- HttpClient  
- Gson  
- Google Books API  
- FileWriter (geração de arquivos)  
- Git e GitHub  

---

## 📂 Estrutura do projeto

```text
src/
 ├── Main.java
 ├── Menu.java
 ├── Book.java
 ├── BookStorage.java
 ├── GoogleBooksQuery.java
 ├── GoogleBooks.java
 ├── GoogleBooksItem.java
 ├── GoogleBooksVolumeInfo.java
 ├── BookFileGenerator.java
 └── BookQueryError.java
```

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar:

- Orientação a objetos  
- Listas e armazenamento em memória  
- Regras de negócio  
- Tratamento de exceções  
- Consumo de APIs  
- Manipulação de JSON  
- Escrita de arquivos  
- Organização em classes  
- Versionamento com Git  

---

## 💡 Funcionalidades principais

### Cadastro manual
O usuário pode cadastrar livros informando:
- título  
- autor  

### Controle de empréstimo
Cada livro possui um estado:
- Disponível  
- Emprestado  

### Integração com API
O sistema permite buscar livros na Google Books API e adicioná-los automaticamente ao catálogo.

### Geração de JSON
Ao buscar um livro na API, o sistema gera automaticamente um arquivo `.json` com os dados do livro.

---

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/LeonardoCoelho-Dev/library-management-console.git
```

2. Abra o projeto em uma IDE Java

3. Execute a classe `Main`

---

## 📌 Status

✅ Projeto finalizado como estudo intermediário em Java  
🚀 Possui integração com API e geração de arquivos JSON  
🚀 Possíveis melhorias futuras: persistência em banco de dados ou leitura de arquivos JSON  

---

## 👨‍💻 Autor

Leonardo Coelho  
Estudante de Sistemas da Informação  
