# InmobilIV

 [![Build Status](https://travis-ci.org/rauldpm/InmobilIV.svg?branch=master)](https://travis-ci.org/rauldpm/InmobilIV)


## Descripción

En este proyecto quiero gestionar la búsqueda e información de pisos en venta y alquiler en cualquier zona de España según los criterios de un usuario, los cuales van a ser capaces de ver los inmuebles registrados y realizar gestiones sobre ellos.

Con esto pretendo proporcionar una herramienta que facilite la búsqueda de dichos inmuebles, ya que encontrar vivienda puede llegar a ser una tarea tediosa.

---
## Herramientas

- Puedes consultar las herramientas usadas y la justificación de su elección en el siguiente [enlace](docs/tools.md).

---
## Rúbricas

- Rúbrica 1: Integración continua funcionando y correcta justificación de la misma.
- Rúbrica 2: Configuración de algún sistema de integración continua adicional (justificado de la misma forma).
- Rúbrica 3: Uso correcto del gestor de tareas en todos los casos anteriores.
- Rúbrica 4: Aprovechamiento del contenedor de Docker generado en el hito anterior en alguno de los sistemas de CI, especialmente si hay un cambio o adaptación del mismo.
- Rúbrica 5: Tests significativos y/o avance del proyecto en sí más allá del hito anterior.

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