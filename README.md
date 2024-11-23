# Gestión de Tareas
Aplicación desarrollada en **Java 8** utilizando **Spring Boot MVC** para la gestión de tareas.  
## **Configuración inicial**
1. Crea la base de datos ejecutando el siguiente script en MySQL:  
   ```sql
   CREATE DATABASE tasks;
   USE tasks;

   CREATE TABLE task (
       id BIGINT AUTO_INCREMENT PRIMARY KEY,
       task_name VARCHAR(100) NOT NULL,
       task_description TEXT,
       start_date DATE
   );

2. Configura las credenciales de conexión a la base de datos en el archivo application.properties:
   ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/tasks
     spring.datasource.username=root
     spring.datasource.password=root
     spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
     mybatis.mapper-locations=classpath:mapper/*.xml
     spring.jpa.hibernate.ddl-auto=none

## **Uso**
Accede a http://localhost:8080 para hacer uso de la aplicación.



