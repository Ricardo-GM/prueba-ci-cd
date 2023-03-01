# Framework Base Automatización Web -  Serenity - ScreenPlay

Este es un proyecto de Automatización Web Trabajado con Serenity BDD 3.4.2 e implementando el patrón de diseño ScreenPlay.

## 🟢 Pre-requisitos: 🟢
1. Descargar el [JDK de Java](https://www.oracle.com/pe/java/technologies/downloads/).
2. Instalar [Git](https://git-scm.com).
3. Instalar [Apache Maven](https://maven.apache.org).
4. El archivo POM.xml ya está configurado, sólo es necesario usar la herramienta de Maven para cargar el archivo.

## 🏀 Herramientas Utilizadas:

* [Java 19](https://openjdk.java.net/projects/jdk/1/) como lenguaje de programación.
* [Maven](https://maven.apache.org/) como manejador de dependencias.
* [JUnit](https://junit.org/junit5/) como herramienta para realizar pruebas unitarias.
* [Selenium WebDriver](https://www.selenium.dev/) como framework de automatización web.
* [Hamcrest](https://hamcrest.org/) como librería para controlar assertions.
* [Logback](https://logback.qos.ch/) como librería para control de mensajes por consola.
* [Cucumber BDD]()
* [Serenity BDD](https://serenity-bdd.github.io/) como herramientas para de pruebas basado en BDD (Behavior-Driven Development), así como herramienta de reportería. Esta herramienta implementa a Selenium. Actualmente se utiliza la versión 3.4.2.

### ⚡️Estrategia de Automatización
Este proyecto opta por utilizar las herramientas de Serenity BDD que implementan el patrón de diseño ScreenPlay, por lo que existen carpetas para los componentes que se utilizan en este patrón, además de las carpetas correspondientes a la implementación de Cucumber:
1. Carpeta actions (`src/test/java/actions`): Esta carpeta contiene las distintas interacciones de bajo nivel que puede realizar un usuario (actor) sobre la web. Estas acciones se encuentran divididas por funcionalidad.
2. Carpeta tasks (`src/test/java/tasks`): Esta carpeta contiene las distintas tareas que puede realizar un usuario (actor) dentro del proyecto. Estas tareas se encuentran divididas por funcionalidad.
3. Carpeta questions (`src/test/java/questions`): Esta carpeta contiene las distintas preguntas que puede realizar un usuario (actor) para conocer el estado sobre algún elemento web dentro del proyecto. Estas preguntas se encuentran divididas por funcionalidad.
4. Carpeta abilities (`src/test/java/abilities`): Esta carpeta contiene las distintas habilidades que puede tener un usuario (actor). Estas habilidad se encuentran divididas por funcionalidad.
5. Carpeta stepdefinitions (`src/test/java/stepdefinitions`): Esta carpeta contiene los distintos pasos que puede tener un caso de prueba. Estos archivos se encuentran divididos por archivos .feature.
6. Carpeta userinterface (`src/test/java/userinterface`): Esta carpeta contiene los distintos elementos web con los cuales se interactuarán en el proyecto. Existe un archivo por cada página web que se utilizará.
7. Carpeta assertions (`src/test/java/assertions`): Esta carpeta contiene una clase que brinda métodos para realizar distintos tipos de validaciones en nuestro proyecto.
8. Carpeta exceptions (`src/test/java/exceptions`): Esta carpeta contiene una clase que brinda métodos para controlar las excepciones y errores que pueden aparecer en nuestro proyecto.
9. Carpeta util (`src/test/java/util`): Esta carpeta contiene distintos tipos de clases de apoyo para nuestro proyecto, tales como constantes, enums, lógica de creación de actores y Hooks para inicializar y terminar instancias de drivers.
10. Carpeta features (`src/test/resoruces/features`): Esta carpeta contienen los distintos archivos .feature que contienen a su vez la redacción gherkin de los distintos casos de prueba y funcionalidades a probar en nuestro proyecto. Estos archivos .feature se encuentran divididos por funcionalidad.
11. Archivo logback-test.cml: Este archivo contiene la configuración de los mensajes por consola manejador por la dependencia de logback.
12. Archivo serenity.conf: Este archivo contiene la configuración de el proyecto Serenity, donde se establecen el tipo de driver a utilizar, en que acciones se tomarán capturas de pantalla y url's base según ambiente. Actualmente está configurado para trabajar con los navegadores Chrome Y Microsoft Edge.


## 🛠️ Ejecutar el proyecto:

1. Ejecutar el comando `mvn compile` en la ruta del proyecto.
2. Ejecutar el comando `mvn clean verify` en la ruta del proyecto.
3. El proyecto se ejecutará de manera automática.

## ☎ Reportería

* El comando `mvn clean verify` generará un link html donde se podrá visualizar el reporte una vez finalizada la ejecución de las pruebas.
* Los datos que componen el reporte se podrán encontrar en la ruta `target/site/serenity`.