# LEARN.md

# 🚀 Java Full Stack Journey — From Basics to Advanced

Welcome! This document explains, step by step, how I built the `java-fullstack-journey` repo. It includes setup instructions, how to run examples, how I organized code and notes, and where I kept screenshots and demo media. Use this as a guide to reproduce, extend, or learn along with me.

---

## Table of contents

1. About this repo
2. Goals
3. Prerequisites
4. Folder structure overview
5. Quick start: clone and run examples
6. Core Java: how I learn and test code
7. Advanced Java and web basics: JDBC, Servlets, JSP
8. Spring Boot: building REST APIs
9. Databases: MySQL and MongoDB setup and sample commands
10. Frontend: running HTML/JS/React examples
11. Full stack projects: wiring backend and frontend
12. Docker, testing, and deployment notes
13. Media, screenshots and where to put them
14. How to contribute or add a module
15. Troubleshooting
16. Contact and credits

---

## 1. About this repo

This is my learning log for Java Full Stack development. Every folder contains:

- Code examples with comments
- A `README.md` that explains that module
- Optional `media/` folder with screenshots or short recordings

I aim to move from Java basics to real full stack apps using Spring Boot and React.

---

## 2. Goals

- Build a strong foundation in core Java concepts
- Learn server-side Java with Servlets, JDBC and Spring Boot
- Learn client-side basics and React
- Make at least 3 end-to-end full stack projects
- Keep everything reproducible with clear steps and sample data

---

## 3. Prerequisites

Install these tools before you start:

- Java JDK 17 or later. Check with `java -version`.
- Maven or Gradle. I use Maven for most projects. Check with `mvn -v`.
- Node.js (v16+) and npm or yarn for frontend work. Check `node -v`.
- Docker (optional but recommended for DB and deployment testing).
- An IDE: IntelliJ IDEA Community or VS Code with Java extensions.
- Git and GitHub account.
- Postman for testing APIs.

---

## 4. Folder structure (planned)

```
java-fullstack-journey/
 ┣ 00-Questions-With-Answers/
 ┣ 01-JavaBasics/
 ┣ 02-Java-If-Else/
 ┣ 03-Java-SwitchCase/
 ┣ 04-Java-Loops/
 ┣ 05-Java-Strings/
 ┣ advanced-java/           # JDBC, Servlets, JSP
 ┣ spring-boot-examples/    # small apps and REST API tutorials
 ┣ databases/               # SQL scripts, seed data, Docker compose for DBs
 ┣ frontend/                # static HTML/JS and React demos
 ┣ projects/                # full stack sample applications
 ┗ media/                   # screenshots, architecture diagrams, videos
```

Each code folder should have its own `README.md` explaining how to build and run examples inside it.

---

## 5. Quick start: clone and run examples

1. Clone the repo:

```bash
git clone https://github.com/mrsouvick/Java-Full-Stack-A-Z-.git
cd Java-Full-Stack-A-Z-
```

2. Open an example in your IDE. For a simple Java class run, open `01-JavaBasics` and run the `Main` class.

3. For Maven projects (for example `spring-boot-examples/simple-api`):

```bash
cd spring-boot-examples/simple-api
mvn clean package
mvn spring-boot:run
```

4. For frontend React apps:

```bash
cd frontend/react-example
npm install
npm start
```

5. For connecting to databases, follow the database setup in section 9.

---

## 6. Core Java: how I learn and test code

I follow a learn-by-doing approach. For each topic I create:

- Short notes explaining the concept (in `00-Questions-With-Answers`) with code snippets
- Small exercises inside folder for that topic
- Unit tests where appropriate (JUnit 5)

Example: To run a Collections exercise in `01-JavaBasics/collections`:

```bash
cd 01-JavaBasics/collections
mvn test
```

Include a short `README.md` in each exercise folder explaining the exercise and expected output.

---

## 7. Advanced Java and web basics (JDBC, Servlets, JSP)

- Put JDBC utilities in `advanced-java/jdbc`.
- Keep SQL schema and seed scripts in `databases/mysql/schema.sql`.
- For Servlets and JSP use a small Maven webapp template under `advanced-java/servlets-demo`. Build with `mvn package` and run with an embedded server or deploy to Tomcat.

Sample JDBC run pattern (pom contains dependencies):

```java
String url = "jdbc:mysql://localhost:3306/dbname";
Connection conn = DriverManager.getConnection(url, user, pass);
```

Document where to configure the DB connection string in `application.properties` or a `.env` file.

---

## 8. Spring Boot: building REST APIs

I keep small step-by-step Spring Boot examples. Each example includes:

- `README.md` with purpose and endpoints
- `src/main/resources/application.properties` for configuration
- `Dockerfile` (optional) and `docker-compose.yml` to run app with DB

Typical commands:

```bash
mvn clean package
java -jar target/app-name.jar
# or
mvn spring-boot:run
```

Test endpoints with Postman or `curl`:

```bash
curl -X GET http://localhost:8080/api/hello
```

Add `spring-boot-starter-test` to run unit and integration tests.

---

## 9. Databases: MySQL and MongoDB setup

I use Docker for consistent DB environments. Example `docker-compose.yml` snippet for MySQL:

```yaml
version: '3.8'
services:
  mysql:
    image: mysql:8
    environment:
      MYSQL_ROOT_PASSWORD: rootpass
      MYSQL_DATABASE: javajourney
      MYSQL_USER: user
      MYSQL_PASSWORD: pass
    ports:
      - "3306:3306"
    volumes:
      - db_data:/var/lib/mysql

volumes:
  db_data:
```

For MongoDB:

```bash
docker run -d -p 27017:27017 --name mongo mongo:6
```

Place SQL schema files in `databases/mysql/schema.sql` and a README that explains how to import them:

```bash
mysql -u user -p javajourney < schema.sql
```

Also include sample seed data and a small `db/seed` script for inserting test rows.

---

## 10. Frontend: HTML, JS, React

- Put static examples under `frontend/static`.
- Put React projects under `frontend/react-<name>`.

Recommended steps to create a React app:

```bash
npx create-react-app frontend/react-example
cd frontend/react-example
npm start
```

Document how the frontend calls the backend. For development, use a proxy in `package.json` or set CORS in Spring Boot.

---

## 11. Full stack projects

Each full stack project goes into `projects/<project-name>` and contains:

- `/backend` (Spring Boot app)
- `/frontend` (React app)
- `docker-compose.yml` to run both and DB
- `README.md` with architecture diagram and step-by-step run instructions

Example `docker-compose.yml` runs the backend, frontend (as static build) and database on one command.

---

## 12. Docker, testing, CI and deployment

- Add `Dockerfile` for backend and frontend where relevant.
- Use `docker-compose` for local full stack tests.
- Tests: JUnit for backend, and Jest for frontend. Run tests before commits.

Deployment options I plan to use:

- Frontend: Vercel or Netlify
- Backend: Railway, Render, or a small VPS; containerize the app for portability
- Database: managed DB or a separate container for demos

Include a `deploy/` folder with notes and commands used for any deployment done.

---

## 13. Media, screenshots and where to put them

Put images and short screencasts under `media/` organized by module, for example `media/spring-boot/`.

Naming convention:

```
media/<module>/01-architecture.png
media/<module>/02-api-sample-response.png
media/<module>/demo-01.mp4
```

In `README.md` files, reference these images using relative links so they render on GitHub.

---

## 14. How to contribute or add a module

If you want to add a new topic or example, follow these rules:

1. Create a folder with a clear name. Example `06-Java-Streams`.
2. Add a `README.md` that explains the learning objective, how to build and run code, and expected output.
3. Add a `media/` folder if you include screenshots or videos.
4. Add unit tests where applicable.
5. Follow commit message style: `topic: short description` e.g. `java: add stream examples`
6. Open a PR and describe what you added and what the reviewer should test.

---

## 15. Troubleshooting

Common issues and fixes:

- Java version mismatch: Ensure `JAVA_HOME` points to JDK 17+. Check `java -version`.
- Port conflicts: Spring Boot defaults to 8080. Change `server.port` in `application.properties`.
- Database connection errors: Verify Docker container is up and credentials match those in `application.properties`.
- CORS errors: Enable CORS in Spring Boot controller or use a proxy in React dev server.

If you still face issues, open an issue in the repo with logs and error messages.

---

## 16. Contact and credits

If you find this useful, star the repo, fork, or reach out.

- Email: reach.souvick@gmail.com
- LinkedIn: Souvick Kumar Halder
- YouTube: Vickify

---

## Next steps I plan to add

- CI setup with GitHub Actions to run tests and build images
- More full stack projects with authentication and security
- Short video walkthroughs for each project placed in `media/` and linked from `README.md`

---

Thank you for checking this out. Follow along and build with me. #souvick

