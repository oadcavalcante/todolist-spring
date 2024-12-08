# Todo API

Uma API RESTful para gerenciamento de tarefas (todos), com funcionalidades de criação, listagem, atualização e exclusão de tarefas.

---

## Endpoints

### Base URL: /todos

---

### 1. Criar Tarefa

**Endpoint:** POST /todos

**Descrição:** Cria uma nova tarefa.

Requisição
- Headers:
  - Content-Type: application/json
- Body:
  {
    "title": "Título da tarefa",
    "description": "Descrição da tarefa"
  }

Resposta
- Status Code: 201 Created
- Body:
  [
    {
      "id": 1,
      "title": "Título da tarefa",
      "description": "Descrição da tarefa"
    }
  ]

---

### 2. Listar Tarefas

**Endpoint:** GET /todos

**Descrição:** Retorna uma lista de todas as tarefas.

Resposta
- Status Code: 200 OK
- Body:
  [
    {
      "id": 1,
      "title": "Título da tarefa",
      "description": "Descrição da tarefa"
    },
    {
      "id": 2,
      "title": "Outra tarefa",
      "description": "Outra descrição"
    }
  ]

---

### 3. Atualizar Tarefa

**Endpoint:** PUT /todos/{id}

**Descrição:** Atualiza uma tarefa existente com o ID especificado.

Requisição
- Headers:
  - Content-Type: application/json
- Path Parameters:
  - id (Long): ID da tarefa a ser atualizada.
- Body:
  {
    "title": "Título atualizado",
    "description": "Descrição atualizada"
  }

Resposta
- Status Code: 200 OK
- Body:
  [
    {
      "id": 1,
      "title": "Título atualizado",
      "description": "Descrição atualizada"
    }
  ]

---

### 4. Deletar Tarefa

**Endpoint:** DELETE /todos/{id}

**Descrição:** Remove uma tarefa existente com o ID especificado.

Requisição
- Path Parameters:
  - id (Long): ID da tarefa a ser excluída.

Resposta
- Status Code: 200 OK
- Body:
  [
    {
      "id": 2,
      "title": "Outra tarefa",
      "description": "Outra descrição"
    }
  ]

---

## Estrutura de Dados

### Todo
| Campo        | Tipo   | Descrição                 |
|--------------|--------|---------------------------|
| id           | Long   | Identificador único.      |
| nome         | String | Nome da tarefa.           |
| descricao    | String | Descrição da tarefa.      |
| realizado    | boolean| Se foi realizado ou não   |
| prioridade   | int    | Grau de prioridade        |

---

## Requisitos

- Java 17+
- Spring Boot 3+
- Banco de dados ou armazenamento persistente (opcional, dependendo do TodoService).

---

## Como Executar

1. Clone o repositório.
   git clone <url-do-repositorio>
   cd <nome-do-repositorio>

2. Configure o arquivo de propriedades do Spring Boot (ex: application.yml ou application.properties), caso necessário.

3. Compile e execute o projeto.
   ./mvnw spring-boot:run

4. Acesse os endpoints via cliente HTTP (ex: Postman, curl).

---

## Observações

- O comportamento dos métodos depende da implementação do serviço TodoService.
- Certifique-se de validar entradas para evitar problemas de dados inválidos.
- Para persistência, configure o TodoService para interagir com um banco de dados ou outro repositório.
