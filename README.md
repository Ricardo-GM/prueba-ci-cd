# Framework Base Automatizaci贸n Web -  Serenity - ScreenPlay

Este es un proyecto de Automatizaci贸n Web Trabajado con Serenity BDD 3.4.2 e implementando el patr贸n de dise帽o ScreenPlay.

## 馃煝 Pre-requisitos: 馃煝
1. Descargar el [JDK de Java](https://www.oracle.com/pe/java/technologies/downloads/).
2. Instalar [Git](https://git-scm.com).
3. Instalar [Apache Maven](https://maven.apache.org).
4. El archivo POM.xml ya est谩 configurado, s贸lo es necesario usar la herramienta de Maven para cargar el archivo.

## 馃弨 Herramientas Utilizadas:

* [Java 19](https://openjdk.java.net/projects/jdk/1/) como lenguaje de programaci贸n.
* [Maven](https://maven.apache.org/) como manejador de dependencias.
* [JUnit](https://junit.org/junit5/) como herramienta para realizar pruebas unitarias.
* [Selenium WebDriver](https://www.selenium.dev/) como framework de automatizaci贸n web.
* [Hamcrest](https://hamcrest.org/) como librer铆a para controlar assertions.
* [Logback](https://logback.qos.ch/) como librer铆a para control de mensajes por consola.
* [Cucumber BDD]()
* [Serenity BDD](https://serenity-bdd.github.io/) como herramientas para de pruebas basado en BDD (Behavior-Driven Development), as铆 como herramienta de reporter铆a. Esta herramienta implementa a Selenium. Actualmente se utiliza la versi贸n 3.4.2.

### 鈿★笍Estrategia de Automatizaci贸n
Este proyecto opta por utilizar las herramientas de Serenity BDD que implementan el patr贸n de dise帽o ScreenPlay, por lo que existen carpetas para los componentes que se utilizan en este patr贸n, adem谩s de las carpetas correspondientes a la implementaci贸n de Cucumber:
1. Carpeta actions (`src/test/java/actions`): Esta carpeta contiene las distintas interacciones de bajo nivel que puede realizar un usuario (actor) sobre la web. Estas acciones se encuentran divididas por funcionalidad.
2. Carpeta tasks (`src/test/java/tasks`): Esta carpeta contiene las distintas tareas que puede realizar un usuario (actor) dentro del proyecto. Estas tareas se encuentran divididas por funcionalidad.
3. Carpeta questions (`src/test/java/questions`): Esta carpeta contiene las distintas preguntas que puede realizar un usuario (actor) para conocer el estado sobre alg煤n elemento web dentro del proyecto. Estas preguntas se encuentran divididas por funcionalidad.
4. Carpeta abilities (`src/test/java/abilities`): Esta carpeta contiene las distintas habilidades que puede tener un usuario (actor). Estas habilidad se encuentran divididas por funcionalidad.
5. Carpeta stepdefinitions (`src/test/java/stepdefinitions`): Esta carpeta contiene los distintos pasos que puede tener un caso de prueba. Estos archivos se encuentran divididos por archivos .feature.
6. Carpeta userinterface (`src/test/java/userinterface`): Esta carpeta contiene los distintos elementos web con los cuales se interactuar谩n en el proyecto. Existe un archivo por cada p谩gina web que se utilizar谩.
7. Carpeta assertions (`src/test/java/assertions`): Esta carpeta contiene una clase que brinda m茅todos para realizar distintos tipos de validaciones en nuestro proyecto.
8. Carpeta exceptions (`src/test/java/exceptions`): Esta carpeta contiene una clase que brinda m茅todos para controlar las excepciones y errores que pueden aparecer en nuestro proyecto.
9. Carpeta util (`src/test/java/util`): Esta carpeta contiene distintos tipos de clases de apoyo para nuestro proyecto, tales como constantes, enums, l贸gica de creaci贸n de actores y Hooks para inicializar y terminar instancias de drivers.
10. Carpeta features (`src/test/resoruces/features`): Esta carpeta contienen los distintos archivos .feature que contienen a su vez la redacci贸n gherkin de los distintos casos de prueba y funcionalidades a probar en nuestro proyecto. Estos archivos .feature se encuentran divididos por funcionalidad.
11. Archivo logback-test.xml: Este archivo contiene la configuraci贸n de los mensajes por consola manejador por la dependencia de logback.
12. Archivo serenity.conf: Este archivo contiene la configuraci贸n de el proyecto Serenity, donde se establecen el tipo de driver a utilizar, en que acciones se tomar谩n capturas de pantalla y url's base seg煤n ambiente. Actualmente est谩 configurado para trabajar con los navegadores Chrome Y Microsoft Edge.


## 馃洜锔? Ejecutar el proyecto:

1. Ejecutar el comando `mvn compile` en la ruta del proyecto.
2. Ejecutar el comando `mvn clean verify` en la ruta del proyecto.
3. El proyecto se ejecutar谩 de manera autom谩tica.

## 鈽? Reporter铆a

* El comando `mvn clean verify` generar谩 un link html donde se podr谩 visualizar el reporte una vez finalizada la ejecuci贸n de las pruebas.
* Los datos que componen el reporte se podr谩n encontrar en la ruta `target/site/serenity`.