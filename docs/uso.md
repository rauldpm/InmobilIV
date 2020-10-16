## Uso 


### 1. Cómo ejecutar tareas sobre el proyecto 

Sobre el proyecto se pueden ejecutar distintas tareas, tanto propias como integradas.

La herramienta Gradle dispone de algunas tareas integradas que permiten diversas funciones:

- Compilar sin necesidad de construir ni realizar tests
  - Compilar archivos principales
    - gradle compileKotlin
  - Compilar archivos test
    - gradle compileTestKotlin
- Construir el proyecto
  - gradle build
- Ejecutar tests propios
  - gradle "tareas"
    - gradle test -> Ejecuta los test implementados sobre la clase Vivienda
    - gradle compila -> Ejecuta la compilación de la clase Vivienda y la clase testJUnit
    - gradle pregunta -> Hace una pregunta
    - gradle respuesta -> Hace una respuesta (lanza la ejecución previa de la pregunta)

**No hace falta crear una tarea para comprobar dependencias, ya que el mismo gestor de tareas incorpora un campo "dependencies" para especificarlas y las incluye cuando hacen falta**