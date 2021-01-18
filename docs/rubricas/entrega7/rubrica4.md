## Rubrica 4

### Buenas prácticas en el diseño del API, incluyendo su correspondencia correcta con diferentes HUs

---

En este hito he creado dos issues para resolver el problema de que los usuarios no tienen acceso a la aplicación de una forma continuada, ya que hasta ahora, la aplicación solo podía funcionar en local.

Ambas issues están relacionadas con la historia de usuario "#37 [HU6] Como usuario, quiero poder gestionar inmuebles":

 - Issue [#38 La aplicación no es accesible por los usuarios, implementar despliegue](https://github.com/rauldpm/InmobilIV/issues/38)
 - Issue [#39 Desplegar Fat Jar de la API](https://github.com/rauldpm/InmobilIV/issues/39)

Para ello, cree la issue 38 que pretende solucionar dicho problema, esta issue contiene commits relacionadas con github actions, la configuración de Heroku, etc...

Siguiendo la documentación que encontraba tanto en Heroku ([aquí](https://devcenter.heroku.com/articles/deploying-gradle-apps-on-heroku)) como en Ktor (framework usado) ([aquí](https://ktor.io/docs/heroku.html#preparing)), todos hacia referencia a un despliegue de un dichero .jar.

Este proceso de configuración para generar el fichero .jar y el taskrunner, se puede encontrar en dicha issue.

Mas tarde, el despliegue cambió para un despliegue de un contenedor que use el taskrunner, esto no supuso mucha diferencia salvo en las GH actions ya hechas, que tuvieron que ser adaptadas para desplegar un contenedor, asi como la creación de un nuevo fichero Dockerfile.web.

Ademas, he actualizado el bot de Telegram para que obtenga los datos de la aplicación desplegada en vez de un fichero de datos.

Se puede ver en este [fichero](https://github.com/rauldpm/InmobilIV_bot_telegram/blob/main/api/index.go), del repositorio que alberga el bot, como he añadido una función "getJson" que obtiene el body de una url especifica (linea 41) y como llamo a dicha función desde la linea 74 y 87.