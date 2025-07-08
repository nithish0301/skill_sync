# 🎓 SkillSync – Student Course Management Platform

SkillSync is a modular, cloud-ready backend platform for students to **browse**, **buy**, and **track courses**, manage their **learning tasks**, and **upload assignments** — all powered by secure microservices, AWS integration, and scalable architecture.

---

## 🧠 Project Abstract

SkillSync is designed for educational platforms where students can:
- 📚 Browse and buy courses
- ✅ Enroll and track their own course progress
- 📋 Manage assignments, quizzes, and deadlines
- ☁️ Upload and submit assignments (stored in **AWS S3**)
- 🔐 Enjoy secure access with **JWT-based authentication** and **role-based authorization**

Instructors and Admins can:
- ✍️ Create and publish courses
- 👥 View enrolled students
- 📊 Monitor student progress

---

## 🧱 Microservices Overview

| Service          | Responsibility |
|------------------|----------------|
| **Auth Service** | User registration, login, JWT, and roles (`STUDENT`, `INSTRUCTOR`, `ADMIN`, `REVIEWER`) |
| **Course Service** | Manage courses, enrollments, purchases |
| **Task Service** | Assignments, quizzes, and learning to-dos for each course |
| **File Service** | Upload and retrieve files using **AWS S3**, store metadata in MongoDB |
| *(Optional)* Analytics Service | Student progress dashboards, course stats, etc. |

---

## 👥 Roles and Access Levels

| Role | Access |
|------|--------|
| `STUDENT` | View/buy/enroll in courses, track tasks, upload assignments |
| `INSTRUCTOR` | Create/manage courses, view student submissions |
| `ADMIN` | Manage users and system-wide data |
| `REVIEWER` | Read-only access for audits/demos |

---

## 🔑 Key Features

- Secure **JWT-based login**
- Role-based access control
- CRUD APIs for tasks and course data
- Assignment uploads to **AWS S3**
- Microservices connected with **Spring Boot + PostgreSQL**
- Dockerized services and **GitHub Actions CI/CD**
- EC2 deployment-ready with **CloudWatch logging**

---

## 🧰 Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java 17 |
| Backend Framework | Spring Boot 3.x |
| Security | Spring Security + JWT |
| Database | PostgreSQL (relational), MongoDB (file metadata) |
| File Storage | AWS S3 |
| DevOps | Docker, Docker Compose, GitHub Actions |
| Cloud Deployment | AWS EC2, AWS CloudWatch |
| Docs | Swagger/OpenAPI + GitHub Wiki |

---

## 🏁 Getting Started

### Prerequisites
- Java 17
- PostgreSQL and/or MongoDB
- AWS S3 Bucket credentials (for file-service)
- Docker & Docker Compose (for local setup)
- IntelliJ or VSCode (recommended IDE)

### Clone Repository
```bash
git clone https://github.com/your-username/skillsync-backend.git
cd skillsync-backend