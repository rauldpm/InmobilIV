## R3 Uso correcto del gestor de tareas en todos los casos anteriores

---

Como se puede ver en las rúbricas 1, 2 y 4, el gestor de tareas se ha utilizado correctamente ya que:
    - Solo se ha especificado la orden del taskrunner en el caso de que no se use Docker, como se puede ver [aquí](https://github.com/rauldpm/InmobilIV/blob/673b1e476373b2f6c44ac3adcc4015f6456c3944/.travis.yml). Ademas se puede ver junto al mensaje de commit que ha pasado Travis.
    - En el caso de que se use Docker, no hace falta especificar nada del taskrunner ya que ya esta todo especificado dentro del contenedor.
        - En el caso de Travis-CI, [aquí](../../../.travis.yml).
        - En el caso de Jenkins, [aquí](../../../Jenkinsfile)
        - En el caso de Circle-CI, [aquí](../../../.circleci/config.yml)