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

- En este [enlace](https://github.com/rauldpm/InmobilIV_bot_telegram) puedes acceder al repositorio que contiene el Bot de Telegram desarrollado para esta API y cumplir con algunas rubricas.

1. [Despliegue correcto y funcionando, con documentación de la conexión entre el repo en GitHub y Netlify/Vercel para despliegue continuo](docs/entrega5/rubrica1.md).

2. [Integración dentro del proyecto general (es decir, como todo el código deberá tener sus issues y/o HU correspondientes). En esta rúbrica se valorará que se haya ido más allá del despliegue de un ejemplo](docs/entrega5/rubrica2.md).

3. Uso (e integración) de varias plataformas de despliegue (es decir, no repetir la misma función en todas las plataformas, sino crear funciones nuevas que también se integren en el proyecto). o uso de plataformas tales como Firebase o Azure functions.
   
  Como ya he explicado en la rubrica 1, he tenido muchísimos problemas para poder hacer el despliegue en otro sitio que no fuera AWS por problemas de incompatibilidad con los plugins disponibles que necesita kotlin para trabajar con serverless y que por tanto, no he podido desplegar en mas sitios, por ello, he desarrollado un bot para que se integre con el proyecto mas adelante como se explica en la rubrica 4.

  He probado en:

  - Firebase: Permite despliegue Kotlin pero en Android (he tenido problemas con las librerías y configuración de taskrunner por plugin serverless para aws)
  - Openfaas: Aunque en algunas documentaciones encontradas hablan de Kotlin, actualmente parece no soportarlo (tiene ejemplos con java11 (el sdk que uso es 8) y necesita de herramientas como kubernetes o en su defecto, k3s (una version minimista de kubernetes) que termina complicando demasiado el proyecto)
  - Vercel: No soporta Kotlin
  - Webiny: No soporta Kotlin
  - Netlify: Lo que he encontrado al respecto de kotlin es para documentar código en Orchid, no para despliegue, ademas en su documentación no hay nada de referencia a Kotlin.
  - Azure: No puedo registrarme ya que no puedo identificarme con mi cuenta de github ni con mis emails personales ya que son de dominio privado, imágenes de error [aquí](docs/img/azure/azure.png) y [aquí](docs/img/azure/azure_1.png).


4. [En conjunción con la rúbrica 2, se asigna por originalidad, buena integración dentro del proyecto, tener que programarlos en un lenguaje diferente al resto del proyecto (si es que el lenguaje en que está este no está soportado en el sistema serverless), integración con un front-end web/bot de Telegram/webhook de cualquier tipo que funcione en la práctica](docs/entrega5/rubrica4.md).

**En este [enlace](docs/rubricas.md) se pueden consultar las rúbricas anteriores**. 

---
## Documentación adicional

- En este [enlace](docs/config.md) se pueden observar las distintas configuraciones realizadas hasta el momento, entre las cuales, por ejemplo, se encuentra la configuración de claves SSH para git y GitHub.
- En este [enlace](docs/codigo.md) se explica la estructura del proyecto, de los archivos principales, de tests y de configuración.
- En este [enlace](docs/uso.md) se puede consultar algunos comandos importantes en el uso de las herramientas.
- En este [enlace](docs/issues.md) se puede observar las issues, historias de usuario y milestones usados.


---
## Bot de Telegram

Si quieres usar el bot desarrollado para su integración con este proyecto, inicia una conversación con el Bot: @rauldpm_bot, después introduce el comando /start y ya estas listo para su uso:

Comandos útiles:

- /autor -> Te dice el autor del bot
- /cantidad -> Te dice la cantidad de viviendas disponibles
- /todo -> Te proporciona información de todas las viviendas 
  
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