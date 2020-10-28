## Elección de contenedor base <a id="id1"></a>

En este fichero se va a explicar la elección de un contenedor base para Docker y la explicación de la elección de una imagen de dicho contenedor mediante una comparación de prestaciones entre las imágenes.

Uno de los requisitos imprescindibles es que el sistema tenga instalado JVM en su version jdk, por lo que voy a testear contenedores que no lo traigan por defecto y que si lo tenga.

**En esta parte cuando hablo de build es un build de la imagen sin realizar ninguna otra acción más que instalar jdk8**.

Contenedores base (sin JVM)
  - Centos
    - Ha tardado 2' 25" en realizar el build instalando jdk8
    - Peso de 434MB
  - Ubuntu
    - Ha tardado 4' 13" en realizar el build instalando jdk8
    - Peso de 531MB

(Solo he encontrado este contenedor base con jdk instalado)

Contenedores base con JVM
  - openJDK (utiliza la última version jdk disponible)
    - Ha tardado 40"
    - Peso de 524MB

Como se puede ver, el tiempo de build del contenedor con jdk es mucho mas rápido que si hay que instalarlo en el dockerfile, aunque el peso es muy similar, por esto, considero que ya que el peso es similar pero el tiempo es mucho mejor, elijo como contenedor base "openJDK".

---
## Elección de imagen <a id="id2"></a>

De este contenedor base voy a comprobar tres imágenes, que son:

|Imagen|Distribución|
|---|---|
|openjdk:16-jdk-buster|Debian|
|openjdk:16-jdk-slim|Debian|
|openjdk:8-jdk-alpine|Alpine|

Para la elección, voy a fijarme en los siguientes datos:

- Peso Base (lo que ocupa la imagen elegida de dicho contenedor solamente, como por ejemplo, sin la herramienta de construcción de tests)
- Peso Total (lo que ocupa la imagen con lo necesario para ejecutar los tests)
- Tiempo Build (el tiempo que tarda en construir la imagen a partir del Dockerfile completo)

En la siguiente tabla se pueden ver las medidas obtenidas:

|Imagen|Peso Base|Peso Total|Tiempo Build|
|---|---|---|---|
|openjdk:16-jdk-buster|677|914|1' 50"|
|openjdk:16-jdk-slim|423|662|2' 00"|
|openjdk:8-jdk-alpine|105|324|1' 20"|


Como se puede ver, la imagen basada en Alpine es la más ligera y rápida, por lo que decido usarla. 
