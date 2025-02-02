# NEET Rank Predictor

## 📌 Project Overview
The **NEET Rank Predictor** is a Java Spring Boot application that predicts a student's NEET rank based on quiz performance. It uses past quiz data to analyze weak areas, predict ranks, and suggest possible medical colleges.

## 🚀 Features
- **Student Management**: Register and manage student profiles.
- **Quiz Submission**: Record current and historical quiz performance.
- **Performance Analysis**: Identify weak topics and improvement areas.
- **Rank Prediction**: Estimate NEET rank based on quiz scores.
- **College Prediction**: Suggest possible medical colleges based on predicted rank.

## 🛠️ Tech Stack
- **Backend**: Java, Spring Boot, Spring Data JPA
- **Database**: H2 (for testing), MySQL/PostgreSQL (for production)
- **Build Tool**: Maven
- **API Testing**: Postman

## 📂 Project Structure
```
neet-rank-predictor/
│── src/main/java/com/neet/rank/predictor/demo/
│   ├── controller/        # API Controllers
│   ├── model/             # Data Models (Entities)
│   ├── repository/        # Database Repositories
│   ├── service/           # Business Logic Services
│   ├── DemoApplication.java  # Main Spring Boot Application
│── src/main/resources/
│   ├── application.properties  # Database Configurations
│── pom.xml  # Maven Dependencies
│── README.md  # Project Documentation
```

## 🔧 Setup and Installation
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/your-username/neet-rank-predictor.git
cd neet-rank-predictor
```

### 2️⃣ Configure Database
- **For H2 Database (Testing Mode)**: Modify `src/main/resources/application.properties`:
  ```properties
  spring.datasource.url=jdbc:h2:mem:neetdb
  spring.datasource.driverClassName=org.h2.Driver
  spring.datasource.username=sa
  spring.datasource.password=
  spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
  spring.h2.console.enabled=true
  ```

- **For MySQL (Production Mode)**:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/neetdb
  spring.datasource.username=root
  spring.datasource.password=root
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
  ```

### 3️⃣ Build and Run the Application
```sh
mvn clean install
mvn spring-boot:run
```
The server will start at: `http://localhost:8080`

## 📡 API Endpoints
| **API** | **Method** | **Endpoint** |
|---------|-----------|-------------|
| **Create Student** | `POST` | `/api/students` |
| **Submit Quiz** | `POST` | `/api/students/{studentId}/quiz` |
| **Get Latest Quiz** | `GET` | `/api/students/{studentId}/quiz` |
| **Submit History** | `POST` | `/api/students/{studentId}/history` |
| **Get History** | `GET` | `/api/students/{studentId}/history` |
| **Analyze Performance** | `GET` | `/api/students/{studentId}/performance` |
| **Predict Rank** | `GET` | `/api/students/{studentId}/predict-rank` |
| **Predict College** | `GET` | `/api/students/{studentId}/predict-college` |

## 🧪 Testing APIs in Postman
1. Start the application.
2. Open Postman and test the API endpoints.
3. Use sample JSON payloads for requests.

## 📸 Screenshots

![Image](https://github.com/user-attachments/assets/7b3153fb-3df3-4728-b310-3b1d685fe996)

![Image](https://github.com/user-attachments/assets/1b16c343-bcbf-43af-98e1-a2670a902cd5)

![Image](https://github.com/user-attachments/assets/7c60e2c9-937b-46b7-8335-436007c07a37)

![Image](https://github.com/user-attachments/assets/18cba709-4c97-4ff9-a78b-f1c7b9418222)

![Image](https://github.com/user-attachments/assets/212bf027-97ef-4499-9fca-25d37d9954a7)

![Image](https://github.com/user-attachments/assets/c4c7b936-50a7-4a63-a627-fc5980e41669)

![Image](https://github.com/user-attachments/assets/9bba810c-3d51-411e-a6f0-15f0afc789c5)


![Image](https://github.com/user-attachments/assets/5b07bb76-0f32-424b-b26e-7fe62fe81ebd)


![Image](https://github.com/user-attachments/assets/15e8c5ba-856b-4b7e-8f9a-d24fb61b8f52)



## 📜 License
This project is open-source and available under the [MIT License](LICENSE).

---
💡 **Need Help?** Contact me at `mohammadfaizpathan343@gmail.com`
