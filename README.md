## 1. Clone the Repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/saputroandi/portofolio-spring-security-v3
cd portofolio-spring-security-v3
```

## 2. Run Docker Compose

Next, start the services using Docker Compose:

```bash
docker-compose up -d
```

This will spin up all necessary containers in the background.

## 3. Open Keycloak Admin Console

Once the services are running, open the Keycloak Admin Console in your browser:

```
http://localhost:9090/

username: admin
password: admin1234
```

## 4. Import Configuration File

Log in to the Keycloak Admin Console and import the required configuration file:

[keycloak-spring.json](spring-keycloak.json)

## 5. Start The App

Ensure that the app are running:

```bash
mvn clean spring-boot:run
```

You should see logs indicating that all app have started successfully.

## 6. Access the Application

Finally, access your application via the browser:

```
http://localhost:8080/swagger-ui/index.html
```

You should see all available endpoint and method and ready for use.

---

You’re all set! If you encounter any issues, please refer to the project's documentation or reach out for support.
