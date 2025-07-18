# Spring Boot API Sandbox (Swagger UI + Redocly YAML)

This is a lightweight Spring Boot sandbox project created to help developers quickly **try out APIs** using **Redocly-generated OpenAPI YAML files**. It integrates **Swagger UI** to provide an interactive developer-friendly interface with support for multiple YAML specs.

## ✅ Features

- Spring Boot 3.4 with Java 21
- Supports multiple Redocly YAML files (`ums.yaml`, `wallet.yaml`, `kyc.yaml`, etc.)
- Swagger UI with “Try it out” enabled per spec
- OpenAPI specs served via `/api-docs/*.yaml`
- CORS enabled for cross-origin testing
- Optional support to download YAML or HTML spec files

## 🧪 How to Use

### 1. Clone the Repository

git clone https://github.com/your-username/springboot-api-sandbox.git
cd springboot-api-sandbox


### 2. Run the Application

./mvnw spring-boot:run

### 3. Access APIs & Swagger UI

| Endpoint                  | Description             |
| ------------------------- | ----------------------- |
| `/api-docs/ums.yaml`      | UMS OpenAPI spec (YAML) |
| `/swagger-ui/ums.html`    | Swagger UI for UMS      |
| `/swagger-ui/wallet.html` | Swagger UI for Wallet   |

## 📂 Project Structure

src/
├── main/
│   ├── java/com/example/sandbox/
│   │   └── controller/AccountController.java
│   └── resources/
│       ├── static/
│       │   ├── swagger-ui/ums.html
│       │   └── api-docs/ums.yaml
│       └── application.properties


## 🔧 Configurations

# application.properties
spring.web.cors.allowed-origins=*
spring.web.cors.allowed-methods=*


## 🙋‍♂️ Contact

Maintained by [Vishal Priyadarshi](mailto:vishal.priyadarshi90@gmail.com)


# About This Project

This sandbox was created as a **POC (Proof of Concept)** to enable developers to explore and test API definitions written using **Redocly-generated OpenAPI YAML files**.

The purpose of this project is to:
- Provide a ready-to-use local Swagger UI interface
- Allow teams to interact with mock or real APIs
- Serve and optionally download OpenAPI specifications
- Support multiple YAMLs in a developer-friendly manner

This is particularly useful for:
- Frontend/backend integration testing
- API contract validation
- Early-stage API design feedback loops

Feel free to fork, extend, or integrate it with other tooling (e.g., Redoc, Docker, CI/CD pipelines).

