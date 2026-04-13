# 📚 Library Management Console

Projeto de estudos em Java para gerenciamento de livros no console, com cadastro manual, empréstimo, devolução e integração com a Google Books API.

---

## 🚀 Funcionalidades

- Adicionar livro manualmente
- Listar livros cadastrados
- Emprestar livro
- Devolver livro
- Buscar livro na Google Books API
- Impedir cadastro duplicado pelo título
- Exibir status do livro (Disponível / Emprestado)

---

## 🛠️ Tecnologias utilizadas

- Java
- HttpClient
- Gson
- Google Books API
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
O sistema também permite buscar livros na Google Books API e adicioná-los automaticamente ao catálogo.

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
🚀 Melhorias futuras podem incluir persistência em arquivo ou banco de dados

---

## 👨‍💻 Autor

Leonardo Coelho  
Estudante de Sistemas da Informação
