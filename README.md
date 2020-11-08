# InmobilIV

[![TravisCI](https://travis-ci.com/rauldpm/InmobilIV.svg?branch=master)](https://travis-ci.com/rauldpm/InmobilIV) [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=shield)](https://circleci.com/gh/circleci/circleci-docs)



## Descripción

En este proyecto quiero gestionar la búsqueda e información de pisos en venta y alquiler en cualquier zona de España según los criterios de un usuario, los cuales van a ser capaces de ver los inmuebles registrados y realizar gestiones sobre ellos.

Con esto pretendo proporcionar una herramienta que facilite la búsqueda de dichos inmuebles, ya que encontrar vivienda puede llegar a ser una tarea tediosa.

---
## Herramientas

- Puedes consultar las herramientas usadas y la justificación de su elección en el siguiente [enlace](docs/tools.md).

---
## Rúbricas

**Importante**

Debido al tiempo excesivo que tarda DockerHub en construir la imagen automáticamente, he tenido que realizar un build de la imagen local en la CI, ya que si utilizo pull para descargar la imagen, descarga la ultima terminada, que como se puede ver en la imagen enlazada a continuación, no termina por el tiempo excesivo.

Los tiempos normales de construcción suelen rondar de 3 a 4 minutos y en algunos casos hasta 200 minutos, todo este tiempo extra es en cola, ya que el "build time" promedio es de 1 minuto.

Imagen de tiempos [aquí](docs/img/tiempos_dockerhub.png).

Se puede saltar la CI usando en el commit:

|Sistema|Orden Commit|
|:-:|:-:|
|Travis|[skip travis]|
|Jenkins|[skip jenkins]|
|Circle-CI|[skip ci]|

- Rúbrica 1: [Integración continua funcionando y correcta justificación de la misma](docs/ci_funcionando.md#id1).
  
- Rúbrica 2: [Configuración de algún sistema de integración continua adicional (justificado de la misma forma)](docs/ci_adicional.md).
  
  - Debido a que Jenkins es un sistema local y hay que estar cambiando el webhook continuamente he decidido integrar también Circle-CI.
  - Para esta rúbrica he usado Jenkins y Circle-CI.
    - Jenkins: Se puede comprobar directamente el correcto funcionamiento [al final de este documento](docs/jenkins.md#id4).
    - Circle-CI: Se puede comprobar directamente el correcto funcionamiento [al final de este documento](docs/circle-ci.md#id2).

  
- Rúbrica 3: Uso correcto del gestor de tareas en todos los casos anteriores.
  - Como se puede ver en las rúbricas 1, 2 y 4, el gestor de tareas se ha utilizado correctamente ya que:
    - Solo se ha especificado la orden del taskrunner en el caso de que no se use Docker, como se puede ver [aquí](https://github.com/rauldpm/InmobilIV/blob/673b1e476373b2f6c44ac3adcc4015f6456c3944/.travis.yml). Ademas se puede ver junto al mensaje de commit que ha pasado Travis.
    - En el caso de que se use Docker, no hace falta especificar nada del taskrunner ya que ya esta todo especificado dentro del contenedor.
      - En el caso de Travis-CI, [aquí](./.travis.yml).
      - En el caso de Jenkins, [aquí](./Jenkinsfile)
      - En el caso de Circle-CI, [aquí](./.circleci/config.yml)
  
- Rúbrica 4: [Aprovechamiento del contenedor de Docker generado en la entrega anterior en alguno de los sistemas de CI, especialmente si hay un cambio o adaptación del mismo](docs/ci_funcionando.md#id4).
  - Adicionalmente también se ha aprovechado en el sistema de integración continua adicional como se puede comprobar en la rubrica 2.


**En este [enlace](docs/rubricas.md) se pueden consultar las rúbricas anteriores**. 

---
## Documentación adicional

- En este [enlace](docs/config.md) se pueden observar las distintas configuraciones realizadas hasta el momento, entre las cuales, por ejemplo, se encuentra la configuración de claves SSH para git y GitHub.
- En este [enlace](docs/codigo.md) se explica la estructura del proyecto, de los archivos principales, de tests y de configuración.
- En este [enlace](docs/uso.md) se puede consultar algunos comandos importantes en el uso de las herramientas.
- En este [enlace](docs/issues.md) se puede observar las issues, historias de usuario y milestones usados.

---
## Desplegar y testear contenedor docker

> docker pull rauldpm/inmobiliv

> docker run --rm -t -v \`pwd\`:/test rauldpm/inmobiliv

---
## Descargar imagen GHCR

> docker pull ghcr.io/rauldpm/inmobiliv/inmobiliv:latest

---
### Autor

Raúl Del Pozo Moreno - [GitHub Pages](https://rauldpm.github.io/InmobilIV/)