## Guía de instalación

Si quieres usar este repositorio para probar o testear debes tener instalado en tu sistema lo siguiente:

**Esto esta descrito para Ubuntu/ArchLinux**

---
### Indice

1. [Gestor de versiones SDKMAN](#id1)
2. [Git](#id2)
3. [Gradle](#id3)
4. [Kotlin](#id4)


---
### 1. Gestor de versiones SDKMAN <a id="id1"></a>

Esto no es necesario pero si lo considero muy necesario, ya que facilita mucho gestionar las versiones de los paquetes instalados.

Para instalarlo solo hay que ejecutar lo siguiente:

> curl -s "https://get.sdkman.io" | bash

En caso de estar usando "zsh" y no "bash", sustituir "bash" por "zsh".

Para ver las versiones disponibles de un paquete basta con ejecutar lo siguiente:

> sdk ls paquete (ex: sdk ls gradle)

Una vez decidida la version a usar, se instala de la siguiente forma:

> sdk install paquete versión (ex: sdk install gradle 6.7-rc-4)

---
### 2. Git <a id="id2"></a>

Esta herramienta servirá para clonar el repositorio en tu ordenador.

Para instalarla, ejecuta el siguiente comando:

> (Ubuntu) sudo apt install git

> (ArchLinux) sudo pacman -S git

Una vez instalado llega el turno de clonar el repositorio:

> git clone https://github.com/rauldpm/InmobilIV.git

Esto te creara una carpeta en tu ordenador con los archivos del repositorio.

---
### 3. Gradle <a id="id3"></a>

Esta herramienta permite gestionar las tareas del proyecto, así como ejecutar test y compilar el proyecto.

Primero busca la versión que quieres instalar:

> sdk ls gradle

Y para instalarlo:

> sdk install gradle versión (ex: sdk install gradle 6.7-rc-4)


---
### 4. Kotlin <a id="id4"></a>

Finalmente es necesario instalar el lenguaje de programación usado en el proyecto, como en el paso anterior, se va a usar SDKMAN para su instalación.

>sdk ls kotlin

>sdk install kotlin versión (ex: sdk install kotlin 1.4.10)
