
## Despliegue en DockerHub

En este fichero se va a explicar los pasos seguidos y la configuración realizada para realizar el despliegue del contenedor en DockerHub y la relación con GitHub.

### Indice

1. [Creación repositorio DockerHub](#id1)
2. [Configuración](#id2)

---
### 1. Creación repositorio DockerHub<a id="id1"></a>

Después de crearme una cuenta con el mismo "nick" que en GitHub en DockerHub, he creado un repositorio.

Para ello, en la pestaña "Repositories", he pulsado "Create Repository", donde he tenido solamente que indicar el nombre de mi repositorio.

Una vez creado se puede observar que ha aparecido el repositorio en la lista:

![Repo creado](../docs/img/DockerHub/dockerhub_1.png)

Al pinchar sobre el repositorio, se puede ver un repositorio inicial vacío y que no tiene nada sincronizado con el repositorio de GitHub:

![Repo inicial](../docs/img/DockerHub/dockerhub_2.png)

---
### 2. Configuración<a id="id2"></a>

Una vez creado el repositorio hay que realizar la configuración para que cuando se realice un "git push" al repositorio de GitHub, se actualice en DockerHub.

El primer paso es enlazar la cuenta de GitHub con DockerHub, para ello, en la pestaña "Build", hay que pulsar sobre el cuadro que pone: "Link to GitHub":

![Linked to GitHub](../docs/img/DockerHub/dockerhub_3.png)

Esto llevara a otra ventana donde hay que indicar el repositorio deseado:

![Seleccionar repo GitHub](../docs/img/DockerHub/dockerhub_4.png)

Que quedaría con los siguientes campos:

![GitHub repo seleccionado](../docs/img/DockerHub/dockerhub_5_1.png)

En esa misma pagina, pero mas abajo, se puede observar una serie de campos donde se indica la localización del archivo Dockerfile en el repositorio.

![Reglas de build](../docs/img/DockerHub/dockerhub_5_2.png)

Una vez terminado de configurarlo, las construcciones automáticas estarán habilitadas como se puede ver en la siguiente imagen, donde indica el estado del ultimo "build realizado", en este caso, marca "success" pero se puede ver debajo que no hay builds recientes.

![Build inicial vacío](../docs/img/DockerHub/dockerhub_6.png)

Una vez hecho esto, en GitHub, se habrá añadido automáticamente el siguiente "Webhook", que como se puede ver, contiene un enlace hacia "hub.docker". 

De esta forma cuando se realice un "push" hacia GitHub, lo enlazará con DockerHub.

![Webhooks GitHub](../docs/img/DockerHub/dockerhub_7.png)

Así, al realizar un push en DockerHub se verá que el estado de builds automáticos, pasará al estado "PENDING".

![Automated Build Pending](../docs/img/DockerHub/dockerhub_8.png)

Unos momentos después, dicho estado cambiará a "IN PROGRESS", que quiere decir que esta realizando el build.

![Automated Build Progress](../docs/img/DockerHub/dockerhub_9.png)

Una vez que termine, si no ha habido errores, el estado cambiará a "SUCCESS".

![Automated Build Success](../docs/img/DockerHub/dockerhub_10.png)

En este punto, al mirar el repositorio de DockerHub, se podrá observar que ya contiene algunos datos mas que antes no estaban, como el README de GitHub.

![Repo después de push](../docs/img/DockerHub/dockerhub_11.png)


  