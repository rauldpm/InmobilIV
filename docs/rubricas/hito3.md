## Hito 3

- Rúbrica 1: [Elección y justificación de contenedor base](../contenedorBase.md#id1).
  
- Rúbrica 2: Dockerfile correcto, explicación de cada parte del dockerfile
  - En el fichero [Dockerfile](../../Dockerfile) se puede observar encima de cada linea un comentario explicando la función que realiza dicha linea.
  - Ejecutando la orden: **docker build -t="rauldpm/inmobiliv" .** se puede observar que no ha habido ningún error en la ejecución, por lo que el fichero Dockerfile no contiene errores, esto se puede ver en esta [imagen](../img/DockerHub/docker_build.png).

- Rúbrica 3: Contenedor subido a DockerHub y documentación
  - Se puede ver el contenedor subido en DockerHub [aquí](https://hub.docker.com/r/rauldpm/inmobiliv).
  - Documentación sobre DockerHub [aquí](../dockerhub.md).
  - Comando para descargar imagen: 
    > *docker pull rauldpm/inmobiliv*
  
- Rúbrica 4: Uso de registros alternativos. GitHub Container Registry
  - Documentación del proceso [aquí](../github_registry.md).
  - Comando de descarga: 
    > *docker pull ghcr.io/rauldpm/inmobiliv/inmobiliv:latest*
  
- Rúbrica 5: [Documentación buenas practicas en optimización de tamaño/velocidad de contenedor comparando distintas imágenes](../contenedorBase.md#id2)