## R1 Elección y justificación de contenedor base

---

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