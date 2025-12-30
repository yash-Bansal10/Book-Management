# 📚 Book Management System (Spring Boot CRUD)

A Spring Boot–based Book Management application that provides full CRUD (Create, Read, Update, Delete) functionality using RESTful APIs. The project follows a layered architecture and is tested using Postman with JSON-based requests and responses.

---

## 🚀 Features
- Add new books (Title, Author)
- View all books
- Update existing book details
- Delete books by ID
- RESTful API design
- Clean layered architecture

---

## 🛠️ Tech Stack
- **Java**
- **Spring Boot**
- **Spring Web (REST APIs)**
- **Spring Data JPA**
- **H2 / MySQL Database**
- **Postman (API Testing)**
- **HTML, CSS, JavaScript (Frontend)**

---

## 🏗️ Project Architecture
Controller → Service → Repository → Database

yaml
Copy code

- **Controller**: Handles HTTP requests
- **Service**: Contains business logic
- **Repository**: Manages database operations using JPA

---

## 📌 API Endpoints

| Method | Endpoint        | Description            |
|------|-----------------|------------------------|
| POST | `/books`        | Add a new book         |
| GET  | `/books`        | Get all books          |
| PUT  | `/books/{id}`   | Update book by ID      |
| DELETE | `/books/{id}` | Delete book by ID      |

---

## 📥 Sample JSON Request

```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
```
▶️ How to Run the Project
Clone the repository

bash
```
Copy code
git clone https://github.com/yash-Bansal10/Book-Management.git
Open the project in IntelliJ / Eclipse
```
Run the main Spring Boot application

Access APIs via Postman or UI

bash
Copy code
http://localhost:8080/books
🧪 API Testing
Tested using Postman

Supports JSON request and response format

Uses standard HTTP status codes

🔮 Future Enhancements
Input validation

Global exception handling

Pagination and search

Authentication and authorization

UI enhancement using Bootstrap or Thymeleaf

👤 Author
Yash Bansal
B.Tech CSE (AI)
Spring Boot | REST APIs | Java
