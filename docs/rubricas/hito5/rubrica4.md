## En conjunción con la rúbrica 2, se asigna por originalidad, buena integración dentro del proyecto, tener que programarlos en un lenguaje diferente al resto del proyecto (si es que el lenguaje en que está este no está soportado en el sistema serverless), integración con un front-end web/bot de Telegram/webhook de cualquier tipo que funcione en la práctica

---

Como he dicho en la rubrica 2, he realizado un bot de Telegram para integrarlo con el proyecto, de forma que proporcione información rápida sobre los inmuebles.

El bot se puede consultar en este [repositorio](https://github.com/rauldpm/InmobilIV_bot_telegram) y la configuración del bot en este [archivo](https://github.com/rauldpm/InmobilIV_bot_telegram/blob/main/api/index.go).

El bot lo he escrito en Go ya que Kotlin no esta soportado en Vercel.

He utilizado tres structs para almacenar la información leída de un fichero json, que por el momento simula una base de datos (la idea es utilizar la API InmobilIV para gestionar todo y usar el bot de Telegram como un acceso rápido de información para los usuarios). Dicho fichero se puede consultar [aquí](../../../app/src/main/resources/data/data.json).

El bot dispone de tres comandos:

1. /autor: Responde con el autor del bot (yo)
2. /cantidad: Responde la cantidad de inmuebles que hay en el sistema 
3. /todo: Responde con los inmuebles disponibles (dirección y características)

La ejecución de dichas ordenes se puede ver en la siguiente imagen:

![bot](../../img/bot/telegram.png)

El despliegue lo he explicado en la rubrica 2.


