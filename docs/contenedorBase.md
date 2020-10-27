## Elección de contenedor base para Docker

En este fichero se va a explicar el porque de la elección de un contenedor base para Docker asi como una comparación de prestaciones entre las imágenes.

En la siguiente [página](https://hub.docker.com/search?q=&type=image&category=base) se puede ver el listado de imágenes base disponibles.

Hay que tener en cuenta que la parte principal es que se disponga de JVM en su version jdk8, por lo que he contemplados estos contenedores base:

Como se puede ver en la tabla, son contenedores pesados ya que incluyen el jdk8.

Se puede observar el peso de cada contenedor sin ejecutar otra orden en el Dockerfile (Peso Base), el peso real del contenedor una vez que ha ejecutado todas las ordenes del Dockerfile (Peso Real) y el tiempo que ha tardado en ejecutar el Dockerfile completo (Tiempo Build), por todo esto, he decidido usar *openjdk:8-jdk-alpine* ya que es el contenedor que menos tarda en hacer el build y el mas liviano.

|Imagen|Peso Base|Peso Real|Tiempo Build|
|---|---|---|---|
|centos:8|215|467|1'50"|
|openjdk:8|514|733|2'|
|openjdk:8-jdk-alpine|105|324|1' 20"|
