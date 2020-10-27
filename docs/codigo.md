## Código del proyecto

En este fichero se pretende dar una explicación general de los ficheros usados en el proyecto y el porqué de su uso.

### Indice
1. [Ficheros fuente](#id1)
2. [Ficheros configuración](#id2)
---

### 1. Ficheros fuente <a id="id1"></a>

Dichos archivos fuente se pueden encontrar en la carpeta raíz del repositorio.

Dicha carpeta se divide en dos sub carpetas:
- Carpeta [*main*](../main), que contiene las clases principales (clases a testear).
- Carpeta [*tests*](../tests), que contiene las clases que ejecutan los test sobre las clases de la rama *main*.

---
### 2. Ficheros de configuración <a id="id2"></a>

También se pueden encontrar otros ficheros de configuración en la raíz del proyecto como:

- [iv.yaml](../iv.yaml) Este fichero contiene diversos datos del proyecto, como el lenguaje a utilizar, las entidades del proyecto, ficheros de testeo, archivo de tareas...
- [build.gradle.kts](build.gradle.kts) Este fichero se corresponde con el gestor de tareas, en él se especifican las dependencias necesarias para el proyecto como los test a realizar sobre el código.
- [LICENSE](../LICENSE) Este fichero indica la licencia del repositorio (GPL-3.0).
- [.gitignore](../.gitignore) Fichero de configuración de git que contiene los ficheros no necesarios para el repositorio.
- [.gitattributes](../.gitattributes) Fichero de configuración de atributos que contiene información sobre el final de linea de ficheros en Windows.