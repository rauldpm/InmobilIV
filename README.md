# InmobilIV

## Descripción

En este proyecto quiero gestionar la búsqueda e información de pisos en venta y alquiler en cualquier zona de España según los criterios de un usuario, los cuales van a ser capaces de ver los inmuebles registrados y realizar gestiones sobre ellos.

Con esto pretendo proporcionar una herramienta que facilite la búsqueda de dichos inmuebles, ya que encontrar vivienda puede llegar a ser una tarea tediosa.

---
## Herramientas

- Puedes consultar las herramientas usadas y la justificación de su elección en el siguiente [enlace](docs/tools.md).

---
## Rúbricas

- Rúbrica 1: [Elección y justificación de contenedor base](docs/contenedorBase.md#id1).
  
- Rúbrica 2: Dockerfile correcto, explicación de cada parte del dockerfile
  - En el fichero [Dockerfile](Dockerfile) se puede observar encima de cada linea un comentario explicando la función que realiza dicha linea.
  - Ejecutando la orden: **docker build -t="rauldpm/inmobiliv" .** se puede observar que no ha habido ningún error en la ejecución, por lo que el fichero Dockerfile no contiene errores, esto se puede ver en esta [imagen](docs/img/DockerHub/docker_build.png).

- Rúbrica 3: Contenedor subido a DockerHub y documentación
  - Se puede ver el contenedor subido en DockerHub [aquí](https://hub.docker.com/r/rauldpm/inmobiliv).
  - Documentación sobre DockerHub [aquí](docs/dockerhub.md).
  - Comando para descargar imagen: 
    > *docker pull rauldpm/inmobiliv*
  
- Rúbrica 4: Uso de registros alternativos. GitHub Container Registry
  - Documentación del proceso [aquí](docs/github_registry.md).
  - Comando de descarga: 
    > *docker pull ghcr.io/rauldpm/inmobiliv/inmobiliv:latest*
  
- Rúbrica 5: [Documentación buenas practicas en optimización de tamaño/velocidad de contenedor comparando distintas imágenes](docs/contenedorBase.md#id2)


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