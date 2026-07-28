# 🎓 CodeCraftHub Frontend

A lightweight, responsive, single-page frontend application for the **CodeCraftHub - Personalized Learning Platform**.

This project was built using **pure HTML, CSS, and Vanilla JavaScript** without any external libraries or frameworks. It communicates with the Spring Boot backend through REST APIs and provides a complete Course Management interface.

---

## ✨ Features

- 📚 View all courses
- ➕ Add a new course
- ✏️ Edit an existing course
- 🗑️ Delete a course
- ✅ Client-side validation
- 🔄 Automatic table refresh
- ⏳ Loading spinner
- 🔔 Toast notifications
- 📱 Responsive design
- 🎨 Modern purple dashboard UI

---

# 🛠 Technology Stack

- HTML5
- CSS3
- Vanilla JavaScript (ES6+)
- Fetch API
- REST API
- Spring Boot Backend Integration

---

# 📂 Project Structure

```
code-craft-hub-frontend/
│
├── index.html
└── README.md
```

Only **two files** are required.

There are:

- ❌ No CSS file
- ❌ No JavaScript file
- ❌ No Bootstrap
- ❌ No jQuery
- ❌ No React
- ❌ No Angular
- ❌ No Vue
- ❌ No npm
- ❌ No build tools

Everything is contained inside a single **index.html**.

---

# 🚀 Getting Started

## Prerequisites

- Java 21
- Spring Boot Backend running
- Modern Web Browser

Backend API

```
http://localhost:8080/api/courses
```

---

## Run

### Option 1

Simply double-click

```
index.html
```

and open it in your browser.

### Option 2 (Recommended)

Use **Live Server** in Visual Studio Code.

---

# 📌 Development Progress

## ✅ Part 1 — HTML Structure

Built the complete HTML layout.

### Implemented

- HTML Skeleton
- Dashboard Layout
- Header
- Add Course Form
- Course Table
- Loading Container
- Toast Container

---

## ✅ Part 2 — CSS Styling

Designed a modern dashboard interface.

### Implemented

- Purple Theme
- Responsive Layout
- Cards
- Tables
- Buttons
- Forms
- Edit Modal
- Loading Spinner
- Hover Effects
- Animations

---

## ✅ Part 3 — JavaScript Foundation

Implemented frontend initialization.

### Implemented

- API_URL Configuration
- Fetch API
- GET Courses
- Dynamic Table Rendering
- Loading State
- Toast Notification
- Date Formatting
- Empty State

---

## ✅ Part 4 — Create Course

Implemented course creation.

### Features

- POST API
- Form Validation
- JSON Request
- Auto Refresh
- Success Toast
- Error Handling

---

## ✅ Part 5 — Update Course

Implemented course editing.

### Features

- Edit Modal
- GET by ID
- Populate Form
- PUT API
- Save Changes
- Close Modal
- Refresh Table

---

## ✅ Part 6 — Delete Course

Implemented course deletion.

### Features

- Delete Confirmation
- DELETE API
- Refresh Table
- Success Notification
- Error Handling

---

## ✅ Part 7 — UI Polish

Improved user experience.

### Implemented

- Better Loading Spinner
- Improved Error Handling
- Success Messages
- Better Empty State
- Responsive Improvements
- Modal Enhancements
- Button State Management
- Footer
- Smooth Animations

---

# 🌟 REST APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /api/courses | Get all courses |
| GET | /api/courses/{id} | Get course by ID |
| POST | /api/courses | Create course |
| PUT | /api/courses/{id} | Update course |
| DELETE | /api/courses/{id} | Delete course |

---

# 🎨 UI Features

- Responsive Dashboard
- Mobile Friendly
- Purple Theme
- Card Layout
- Modern Table
- Modal Dialog
- Loading Spinner
- Toast Notifications
- Hover Animations
- Smooth Transitions

---

# 📱 Responsive Design

Optimized for

- Desktop
- Laptop
- Tablet
- Mobile

---

# 📖 Learning Objectives

This project demonstrates practical experience with:

- HTML5 Layout
- CSS3 Styling
- Responsive Web Design
- Vanilla JavaScript
- Fetch API
- Async/Await
- REST API Integration
- DOM Manipulation
- CRUD Operations
- Form Validation
- Error Handling
- UI/UX Best Practices

---

# 🎯 Project Highlights

✅ Single HTML file

✅ No external dependencies

✅ No framework

✅ No npm

✅ No build process

✅ Responsive

✅ REST API integration

✅ Production-style CRUD workflow

---

# 📷 Application Workflow

```
User
   │
   ▼
Frontend (index.html)
   │
   ▼
Fetch API
   │
   ▼
Spring Boot Backend
   │
   ▼
courses.json
   │
   ▼
Updated Response
   │
   ▼
Refresh UI
```

---

# 👨‍💻 Author

Developed as the frontend implementation for the **CodeCraftHub – Personalized Learning Platform** final project.

Built with ❤️ using HTML, CSS and Vanilla JavaScript.