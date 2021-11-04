# Api-Agenda
Api de agenda de contactos y citas

Indicaciones 
En un gestor base de datos de MySql ejecutar el siguiente script.
```mysql
create database apiagenda;
```

Una vez creada la base de datos realizar los siguientes pasos para importar la API a la herramienta Spring Tools, 
se puede descargar en el siguiente enlace https://spring.io/tools , una vez se descargue e instale la herramienta le solicitara que defina un lugar de trabajo, 
carpeta de su elección  en la cual se guardara los proyectos, en este caso guardar  api-Agenda en esa carpeta
Descomprimir el proyecto api-Agenda en la carpeta de trabajo que se definió en la herramienta Spring Tools,
luego en la herramienta Spring Tools en Files seleccionar import como se muestra en la imagen.

![capturaSpring1 (2)](https://user-images.githubusercontent.com/13261573/140289340-dbda9771-3d26-439d-a7cf-b2c72ae8ea04.png)

Luego en la nueva ventana seleccionar la carpeta Maven y seleccionar Existing Maven Projects,
presionar en el botón Next y en la nueva ventana seleccionamos en Browser para realizar la bus queda del proyecto, en este caso api-Agenda.
![Spring4](https://user-images.githubusercontent.com/13261573/140289337-fce0f640-2284-48f1-b90f-06b6ef70484f.png)


Seleccionar finalizar y esperar a que se descarguen las dependencias utilizadas en el API

![Spring3](https://user-images.githubusercontent.com/13261573/140289339-0fd7fc71-7e0e-432b-be48-a0d462558da8.png)

Luego buscamos en el proyecto api-Agenda la opción JRE System Library, click derecho y seleccionar properties, luego en la nueva ventana seleccionar la version de Java que tenemos instalada en el ordenador para ello seleccionaremos la opción Worksapace Default JRE ; Aplicamos los cambios y cerramos el cuadro de Dialogo

![Spring5 (2)](https://user-images.githubusercontent.com/13261573/140289342-b7ef14e7-34fb-440c-a434-c0af13fc267d.png)
![Spring 6](https://user-images.githubusercontent.com/13261573/140289336-ca08932d-ad73-4b48-820f-04e136fe5ba7.png)

Como se muestra en la siguiente imagen en el archuvo application.properties realizar el cambio en las ultimas lineas seleccionadas en la imagen, 
cambiar el nombre y la contraseña del servidor de base de datos My sql.

![spring 7](https://user-images.githubusercontent.com/13261573/140289332-ac6f2fb6-f95d-4d90-b609-48bbc44ae10b.png)
```java

spring.jpa.database= MYSQL
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/apiagenda?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=root
```

# Endpoint

Se realizaron endpoints con Postman se puede descargar en el siguiente enlace https://www.postman.com/downloads/, 
como podemos observar en las imágenes se realizan funciones de prueba demostrando el funcionamiento de la API.


