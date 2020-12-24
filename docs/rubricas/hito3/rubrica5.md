## R5 Documentación buenas practicas en optimización de tamaño/velocidad de contenedor comparando distintas imágenes

---

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
