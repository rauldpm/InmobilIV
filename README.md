# InmobilIV

[![TravisCI](https://travis-ci.com/rauldpm/InmobilIV.svg?branch=master)](https://travis-ci.com/rauldpm/InmobilIV) [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=shield)](https://circleci.com/gh/circleci/circleci-docs) ![Docker image](https://github.com/rauldpm/InmobilIV/workflows/Docker%20image/badge.svg)



## Descripción

En este proyecto quiero gestionar la búsqueda e información de pisos en venta y alquiler en cualquier zona de España según los criterios de un usuario, los cuales van a ser capaces de ver los inmuebles registrados y realizar gestiones sobre ellos.

Con esto pretendo proporcionar una herramienta que facilite la búsqueda de dichos inmuebles, ya que encontrar vivienda puede llegar a ser una tarea tediosa.

---
## Herramientas

- Puedes consultar las herramientas usadas y la justificación de su elección en el siguiente [enlace](docs/tools.md).

---
## Rúbricas




**En este [enlace](docs/rubricas.md) se pueden consultar las rúbricas anteriores**. 

---
## Documentación adicional

- En este [enlace](docs/config.md) se pueden observar las distintas configuraciones realizadas hasta el momento, entre las cuales, por ejemplo, se encuentra la configuración de claves SSH para git y GitHub.
- En este [enlace](docs/codigo.md) se explica la estructura del proyecto, de los archivos principales, de tests y de configuración.
- En este [enlace](docs/uso.md) se puede consultar algunos comandos importantes en el uso de las herramientas.
- En este [enlace](docs/issues.md) se puede observar las issues, historias de usuario y milestones usados.

---
## Desplegar y testear contenedor DockerHub

> docker pull rauldpm/inmobiliv

> docker run -t -v \`pwd\`:/test rauldpm/inmobiliv

---
## Desplegar y testear contenedor GHCR

> docker pull ghcr.io/rauldpm/inmobiliv/inmobiliv-con:latest

> docker run -t -v \`pwd\`:/test ghcr.io/rauldpm/inmobiliv/inmobiliv-con:latest

---
### Autor

Raúl Del Pozo Moreno - [GitHub Pages](https://rauldpm.github.io/InmobilIV/)