# InmobilIV

[![TravisCI](https://travis-ci.com/rauldpm/InmobilIV.svg?branch=master)](https://travis-ci.com/rauldpm/InmobilIV) [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=shield)](https://circleci.com/gh/circleci/circleci-docs) ![Docker image](https://github.com/rauldpm/InmobilIV/workflows/Docker%20image/badge.svg)


## Descripción

En este proyecto quiero gestionar la búsqueda e información de pisos en venta y alquiler en cualquier zona de España según los criterios de un usuario, los cuales van a ser capaces de ver los inmuebles registrados y realizar gestiones sobre ellos.

Con esto pretendo proporcionar una herramienta que facilite la búsqueda de dichos inmuebles, ya que encontrar vivienda puede llegar a ser una tarea tediosa.

---
## Herramientas

- Puedes consultar las herramientas usadas y la justificación de su elección en el siguiente [enlace](docs/rubricas/entrega2/tools.md).

---
## Rúbricas

1. [Descripción y justificación de las herramientas usadas para desplegar la aplicación en en PaaS](docs/rubricas/entrega7/rubrica1.md).
   
2. [Descripción correcta de la configuración para despliegue automático, desde el repositorio o desde el sistema de integración continua](docs/rubricas/entrega7/rubrica2.md).
   
3. Funcionamiento correcto del despliegue en el PaaS (no sólo el status). Es decir, no se puede devolver ningún status 500
   - Mostrado en la rubrica 2 (final del punto 3)
   
4. [Buenas prácticas en el diseño del API, incluyendo su correspondencia correcta con diferentes HUs](docs/rubricas/entrega7/rubrica4.md).



**En este [enlace](docs/rubricas.md) se pueden consultar las rúbricas anteriores**. 

---
## Documentación adicional

- En este [enlace](docs/rubricas/entrega0/config.md) se pueden observar las distintas configuraciones realizadas hasta el momento, entre las cuales, por ejemplo, se encuentra la configuración de claves SSH para git y GitHub.
- En este [enlace](docs/codigo.md) se explica la estructura del proyecto, de los archivos principales, de tests y de configuración.
- En este [enlace](docs/issues.md) se puede observar las issues, historias de usuario y milestones usados.


---
## Bot de Telegram

Si quieres usar el bot desarrollado para su integración con este proyecto, inicia una conversación con el Bot: @rauldpm_bot, después introduce el comando /start y ya estas listo para su uso.

- En este [enlace](https://github.com/rauldpm/InmobilIV_bot_telegram) puedes acceder al repositorio que contiene el Bot de Telegram desarrollado para esta API.

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

## Despliegue de la aplicación

Puedes acceder a la api en el siguiente enlace:

- https://inmobiliv.herokuapp.com

---
### Autor

Raúl Del Pozo Moreno - [GitHub Pages](https://rauldpm.github.io/InmobilIV/)