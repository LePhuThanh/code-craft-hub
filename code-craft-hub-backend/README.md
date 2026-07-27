# CodeCraftHub Backend

A Spring Boot REST API for managing courses with CRUD operations using JSON file storage.

## Technology Stack

- Java 21
- Spring Boot
- Gradle 8.14.3
- Jackson
- JSON File Storage
- Lombok

---

## Features

- Create a course
- Get all courses
- Get course by ID
- Update a course
- Delete a course
- JSON file storage (`courses.json`)
- Bean Validation
- Global Exception Handling
- CORS Configuration
- Course Statistics Endpoint

---

## Project Structure

```
src
├── advice
│   └── GlobalExceptionHandler.java
├── config
│   └── CorsConfig.java
├── controller
│   └── CourseController.java
├── exception
│   ├── BadRequestException.java
│   └── ResourceNotFoundException.java
├── model
│   ├── Course.java
│   ├── CourseStatus.java
│   └── CourseStats.java
├── service
│   └── CourseService.java
└── CodeCraftHubBackendApplication.java
```

---

## API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/api/courses` | Create a course |
| GET | `/api/courses` | Get all courses |
| GET | `/api/courses/{id}` | Get course by ID |
| PUT | `/api/courses/{id}` | Update a course |
| DELETE | `/api/courses/{id}` | Delete a course |
| GET | `/api/courses/stats` | Get course statistics |

---

## Sample Request

### POST `/api/courses`

```json
{
  "name": "Spring Boot",
  "description": "REST API Development",
  "target_date": "2026-08-01",
  "status": "Not Started"
}
```

---

## Sample Response

```json
{
  "id": 1,
  "name": "Spring Boot",
  "description": "REST API Development",
  "target_date": "2026-08-01",
  "status": "Not Started",
  "created_at": "2026-07-27T22:30:15.123456"
}
```

---

## Statistics Endpoint

### GET `/api/courses/stats`

Example response:

```json
{
  "totalCourses": 3,
  "notStarted": 1,
  "inProgress": 1,
  "completed": 1
}
```

---

## Running the Application

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project:

```bash
cd code-craft-hub-backend
```

Run the application:

```bash
./gradlew bootRun
```

The API will start at:

```
http://localhost:8080
```

---

## Data Storage

All course data is stored in:

```
courses.json
```

The file is automatically created if it does not exist.

---

## HTTP Status Codes

| Code | Description |
|------|-------------|
| 200 | OK |
| 201 | Created |
| 204 | No Content |
| 400 | Bad Request |
| 404 | Not Found |
| 500 | Internal Server Error |

---

## Author

**Phelim**