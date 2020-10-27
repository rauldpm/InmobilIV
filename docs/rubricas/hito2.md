## Hito 2

- Se ha actualizado el fichero de configuración de test [iv.yaml](../iv.yaml) con los nuevos campos necesarios.
- Se ha configurado el gestor de tareas **Gradle**, como se puede ver en los ficheros:
  - [build.gradle.kts](../app/build.gradle.kts)
  - [settings.gradle.jts](../settings.gradle.kts)
- Este gestor incorpora un sistema de dependencias en el archivo [build.gradle.kts](../app/build.gradle.kts) bajo la etiqueta **dependencies**, por lo cual, no hace falta instalarlas localmente ni realizar ninguna tarea para instalarlas, la justificación de su elección se puede ver [aquí](./tools.md).
- Se ha incluido el framework de test **JUnit5** en las dependencias del archivo [build.gradle.kts](../app/build.gradle.kts), su instalación se realiza automáticamente por el gestor de tareas, la justificación de su elección se puede ver [aquí](./tools.md).
- Gradle trae una serie de tareas por defecto para compilar el código sin tener que hacer un build o ejecutar test, que son:
    - gradle compileKotlin
    - gradle compileTestKotlin
- Se han creado diversas tareas como se puede ver en el fichero:
  - [build.gradle.kts](../app/build.gradle.kts)
  - En concreto se han creado dos tareas para probar la dependencia entre tareas, una tarea principal llamada "test" que ejecuta los tests propios del proyecto, localizados [aquí](../app/src/test/kotlin/InmobilIV/) y una tarea llamada "compila" que ejecuta la compilación de los ficheros del proyecto y los test a la vez.
- Se ha añadido la clase [Inmuebles](../app/src/main/kotlin/InmobilIV/inmuebles.kt) que agrupa un conjunto de objetos [Inmueble](../app/src/main/kotlin/InmobilIV/inmueble.kt).
- La clase [Inmueble](../app/src/main/kotlin/InmobilIV/inmueble.kt) se ha modularizado dividiendo la clase en dos (una de ellas busca emular un struct, ya que en kotlin no hay). 
  - Ahora hay una clase "Vivienda" que hace referencia a los datos de la vivienda (dirección, piso, letra...) y una clase "Inmueble" que referencia la Vivienda con una serie de características (superficie, precio, propietario...)
- Se ha implementado tres clases de testeo:
  - [testVivienda.kt](../app/src/test/kotlin/InmobilIV/testVivienda.kt)
  - [testInmueble.kt](../app/src/test/kotlin/InmobilIV/testInmueble.kt)
  - [testInmuebles.kt](../app/src/test/kotlin/InmobilIV/testInmuebles.kt)
- Se puede ver en la siguiente imagen los test realizados al ejecutar el comando **gradle test**:
![tests_funcionando](../docs/img/test_funcionando.png)
- No se han cerrado issues debido a que están aun en desarrollo.
- Se han abierto una nueva historia de usuario:
  - [#13 [HU4] Como usuario, quiero ser capaz de ver los inmuebles disponibles](https://github.com/rauldpm/InmobilIV/issues/13)
- Se ha abierto un nuevo issue que se relaciona con las Historias de Usuario 2 y 4:
  - [#12 Como desarrollador, quiero ser capaz de poder testear las clases relacionadas con Inmuebles](https://github.com/rauldpm/InmobilIV/issues/12)

