## Hito 5

- En este [enlace](https://github.com/rauldpm/InmobilIV_bot_telegram) puedes acceder al repositorio que contiene el Bot de Telegram desarrollado para esta API y cumplir con algunas rubricas.

1. [Despliegue correcto y funcionando, con documentación de la conexión entre el repo en GitHub y Netlify/Vercel para despliegue continuo](../entrega5/rubrica1.md).

2. [Integración dentro del proyecto general (es decir, como todo el código deberá tener sus issues y/o HU correspondientes). En esta rúbrica se valorará que se haya ido más allá del despliegue de un ejemplo](../entrega5/rubrica2.md).

3. Uso (e integración) de varias plataformas de despliegue (es decir, no repetir la misma función en todas las plataformas, sino crear funciones nuevas que también se integren en el proyecto). o uso de plataformas tales como Firebase o Azure functions.
   
  Como ya he explicado en la rubrica 1, he tenido muchísimos problemas para poder hacer el despliegue en otro sitio que no fuera AWS por problemas de incompatibilidad con los plugins disponibles que necesita kotlin para trabajar con serverless y que por tanto, no he podido desplegar en mas sitios, por ello, he desarrollado un bot para que se integre con el proyecto mas adelante como se explica en la rubrica 4.

  He probado en:

  - Firebase: Permite despliegue Kotlin pero en Android (he tenido problemas con las librerías y configuración de taskrunner por plugin serverless para aws)
  - Openfaas: Aunque en algunas documentaciones encontradas hablan de Kotlin, actualmente parece no soportarlo (tiene ejemplos con java11 (el sdk que uso es 8) y necesita de herramientas como kubernetes o en su defecto, k3s (una version minimista de kubernetes) que termina complicando demasiado el proyecto)
  - Vercel: No soporta Kotlin
  - Webiny: No soporta Kotlin
  - Netlify: Lo que he encontrado al respecto de kotlin es para documentar código en Orchid, no para despliegue, ademas en su documentación no hay nada de referencia a Kotlin.
  - Azure: Aunque soporta Java (Java y Kotlin son compatibles entre si) no he conseguido hacer un despliegue de prueba en Kotlin, tampoco he podido usar la identificación con GitHub por un problema de pertenencia del dominio del correo como se ve [aquí](../img/azure/azure.png) y he tenido que usar un correo personal.
  
  Debido a todos estos problemas estoy buscando la manera de integrar en mi proyecto otro lenguaje para posibilitar ampliar la cobertura, estoy probando con una integración [Kotlin/JS](https://kotlinlang.org/docs/reference/js-overview.html) pero estoy teniendo algún problema de compatibilidad para integrarlo con la configuración actual del taskrunner Gradle y todo lo que se lleva hecho.

  De esta forma podría utilizar Kotlin como base del proyecto y JS para funcionalidades especificas.


4. [En conjunción con la rúbrica 2, se asigna por originalidad, buena integración dentro del proyecto, tener que programarlos en un lenguaje diferente al resto del proyecto (si es que el lenguaje en que está este no está soportado en el sistema serverless), integración con un front-end web/bot de Telegram/webhook de cualquier tipo que funcione en la práctica](../entrega5/rubrica4.md).
