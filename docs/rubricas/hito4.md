## Hito 4

Se puede saltar la CI usando en el commit:

|Sistema|Orden Commit|
|:-:|:-:|
|Travis|[skip travis]|
|Jenkins|[skip jenkins]|
|Circle-CI|[skip ci]|

- Rúbrica 1: [Integración continua funcionando y correcta justificación de la misma](../ci_funcionando.md#id1).
  
- Rúbrica 2: [Configuración de algún sistema de integración continua adicional (justificado de la misma forma)](../ci_adicional.md).
  
  - Debido a que Jenkins es un sistema local y hay que estar cambiando el webhook continuamente he decidido integrar también Circle-CI.
  - Para esta rúbrica he usado Jenkins y Circle-CI.
    - Jenkins: Se puede comprobar directamente el correcto funcionamiento [al final de este documento](../jenkins.md#id4).
    - Circle-CI: Se puede comprobar directamente el correcto funcionamiento [al final de este documento](../circle-ci.md#id2).

- Rúbrica 3: Uso correcto del gestor de tareas en todos los casos anteriores.
  - Como se puede ver en las rúbricas 1, 2 y 4, el gestor de tareas se ha utilizado correctamente ya que:
    - Solo se ha especificado la orden del taskrunner en el caso de que no se use Docker, como se puede ver [aquí](https://github.com/rauldpm/InmobilIV/blob/673b1e476373b2f6c44ac3adcc4015f6456c3944/.travis.yml). Ademas se puede ver junto al mensaje de commit que ha pasado Travis.
    - En el caso de que se use Docker, no hace falta especificar nada del taskrunner ya que ya esta todo especificado dentro del contenedor.
      - En el caso de Travis-CI, [aquí](../../.travis.yml).
      - En el caso de Jenkins, [aquí](../../Jenkinsfile)
      - En el caso de Circle-CI, [aquí](../../.circleci/config.yml)
  
- Rúbrica 4: [Aprovechamiento del contenedor de Docker generado en la entrega anterior en alguno de los sistemas de CI, especialmente si hay un cambio o adaptación del mismo](../ci_funcionando.md#id4).
  - Adicionalmente también se ha aprovechado en el sistema de integración continua adicional como se puede comprobar en la rubrica 2.