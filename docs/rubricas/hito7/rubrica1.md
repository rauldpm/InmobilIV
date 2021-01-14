## Rubrica 1

### Descripción y justificación de las herramientas usadas para desplegar la aplicación en en PaaS

---

Para realizar el despliegue he considerado los siguientes PaaS:

- Heroku
- IBM Bluemix
- OpenShift
- platform.sh

Para mi proyecto, Heroku permite el despliegue de contenedores, ademas de ficheros ejecutables como Jar*, ademas dispone de Buildpacks específicos para Gradle. Es gratuito y dispone de un plan de estudiantes mediante la cuenta de GitHub, el problema es que esta cuenta requiere introducir datos bancarios (como AWS).

*La ejecución de un fichero Jar frente a un contenedor es notablemente mas rápida y estable cuando se trabaja con Gradle, pero no permite la gestión del contenedor mediante el taskrunner, cosa que si permite el contenedor.

La cuenta estudiante dispone de las siguientes características:

- La aplicación nunca entra en modo sueño (por inactividad)
- 512MB Ram
- 10 tipos de procesos
- Métrica de la aplicación (para monitoreo)

El plan gratuito dispone de lo siguiente:

- 550-1000 horas de ejecución al mes
- 512MB RAM
- 2 tipos de proceso
- Modo sueño después de 30' de inactividad

Respecto a IBM Bluemix, también permite el despliegue de contenedores y dispone del siguiente plan gratuito:

- Gratis por 30 días
- Almacenamiento de 500MB al mes
- Trafico de 5GB al mes

No he encontrado mas información, pero si otros planes gratuitos para despliegues Docker usando Kubernetes o Terraform

Respecto a OpenShift, ha sido complicado mirar los planes que tiene, no quedan claros cuales son gratuitos y cuales o sin tener que registrarme, ni siquiera información acerca de la infraestructura, asi que lo he descartado.

Platform.sh proporciona una compatibilidad con Java (podría hacer despliegue Jar) pero no parece que utilice Docker, y como el objetivo es desplegar un contenedor que utilice el taskrunner, queda descartado.

Asi las opciones que me quedarían seria Heroku e IBM Bluemix y puesto que Heroku me parece mas intuitivo, he visto mas documentación y no dispone de un periodo de 30 días como Bluemix, he decidido usar Heroku como PaaS.

Ademas, Heroku dispone de una serie de herramientas para instalarlas en local y poder probarla antes de realizar el despliegue, permitiendo también desplegar a Heroku directamente desde linea de comandos.


