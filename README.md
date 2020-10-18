# InmobilIV

## Descripción

En este proyecto quiero gestionar la búsqueda e información de pisos en venta y alquiler en cualquier zona de España según los criterios de un usuario, los cuales van a ser capaces de ver los inmuebles registrados y realizar gestiones sobre ellos.

Con esto pretendo proporcionar una herramienta que facilite la búsqueda de dichos inmuebles, ya que encontrar vivienda puede llegar a ser una tarea tediosa.

---
## Herramientas

- Puedes consultar las herramientas usadas en el siguiente [enlace](docs/tools.md).
- Puedes consultar la forma de instalar dichas herramientas en el siguiente [enlace](docs/instalacion.md).

---
## Uso

Sobre el proyecto se pueden ejecutar distintas tareas, tanto propias como integradas. Se recomienda seguir este [enlace](docs/instalacion.md) antes de usar dichas tareas.

La herramienta Gradle dispone de algunas tareas integradas que permiten diversas funciones:

- Compilar sin necesidad de construir ni realizar tests
  - Compilar archivos principales
    > gradle compileKotlin
  - Compilar archivos test
    > gradle compileTestKotlin
- Construir el proyecto (también ejecuta los test)
  > gradle build
- Limpiar el proyecto
  > gradle clean
- Ejecutar tests propios
  - gradle "tarea"
    > gradle test -> Ejecuta los test implementados, una vez que pasa los test no los realiza de nuevo hasta que no haya cambios en el código o no pase algún test

    > gradle compila -> Ejecuta la compilación del proyecto

    > gradle pregunta -> Hace una pregunta

    > gradle respuesta -> Hace una respuesta (lanza la ejecución previa de la pregunta)

---
## Documentación

- En este [enlace](docs/config.md) se pueden observar las distintas configuraciones realizadas hasta el momento, entre las cuales, por ejemplo, se encuentra la configuración de claves SSH para git y GitHub.
- En este [enlace](docs/codigo.md) se explica la estructura del proyecto, de los archivos principales, de tests y de configuracón.
- **En este [enlace](docs/rubricas.md) se pueden observar los pasos realizados hasta el momento en la realización del proyecto**. 

---
### Autor

Raúl Del Pozo Moreno - [GitHub Pages](https://rauldpm.github.io/InmobilIV/)