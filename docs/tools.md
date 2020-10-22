
## Herramientas usadas en este proyecto

- Lenguaje de programación: [Kotlin](https://kotlinlang.org/)
- Gestor de versiones de Kotlin y Gradle: [SDKMAN](https://sdkman.io/)
- Herramienta para realización de tests: [JUnit5](https://junit.org/junit5/)
- Gestor de tareas: [Gradle](https://gradle.org/)

La instalación de dichas herramientas y su uso se puede consultar en el siguiente [enlace](instalacion.md)

---
## ¿Por qué este lenguaje?

Para este proyecto he decidido usar Kotlin, ya que considero interesante aprender un nuevo lenguaje que no me han enseñado de forma activa en la universidad.

Asimismo considero que es un lenguaje que me va a ser doblemente útil, ya que dicho lenguaje también se utiliza para programación de dispositivos móviles.

---
## ¿Por qué esta herramienta de construcción?

He elegido Gradle porque me ha parecido una herramienta muy versátil y fácil de usar, ya que permite de una forma muy cómoda la declaración de dependencias (solo hay que indicarlas en un fichero y el mismo te las descarga), la creación de tareas y del proyecto. Además tiene una buena integración con el lenguaje Kotlin ya que tiene tareas internas especificas para dicho lenguaje, permite compilar código fuente en ejecutable...

También permite realizar tareas sin tener que realizar la construcción del proyecto mas de una vez evitando tareas innecesarias en su uso.

---
## ¿Por qué esta herramienta de test?

He elegido JUnit5 ya que permite realizar test unitarios sin tener que ejecutar la aplicación, de esta forma permite que el desarrollo de test sea escalable independientemente de la cantidad de código que haya, de forma que la ejecución de test no se verá afectado por el desarrollo de la aplicación. También permite una integración continua.