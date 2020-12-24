
## Intregación continua con Circle-CI


## Indice
1. [Configuración](#id1)
2. [Funcionamiento correcto](#id2)

---
## 1. Configuración <a id="id1"></a>

Primero hay que identificarse en la [Web](https://circleci.com/integrations/github/) con las credenciales de GitHub.

Cuando entre, se podrán ver los repositorios en propiedad, en el que habrá que pulsar "Set Up Project" del repositorio deseado.

![circle_1](../../img/Circle/circle_1.png)

Al pulsar mostrará una configuración inicial preguntando si se desea pushear al repositorio el archivo configuración predeterminado, esto no es lo deseado, ya que he creado una configuración propia para ejecutar docker, se puede consultar [aquí](../../../.circleci/config.yml)

![circle_2](../../img/Circle/circle_2.png)

Por tanto, se pulsa sobre "Use existing config" y mostrara otra ventana indicando que hay que iniciar la construcción.

![circle_3](../../img/Circle/circle_3.png)

Esto habrá añadido un nuevo webhook al repositorio:

![circle_4](../../img/Circle/circle_4.png)

---
## 2. Funcionamiento correcto <a id="id2"></a>

Ahora, cada vez que se realiza un push o PR, se lanzara el trabajo en Circle-CI, y si es correcto, lo indicara:

![circle_5](../../img/Circle/circle_5.png)

Si se entra en el trabajo, se puede ver con mas detalle:

![circle_6](../../img/Circle/circle_6.png)

Y si se va a la ejecución de docker, se puede ver en el log que los test han pasado:

![circle_7](../../img/Circle/circle_7.png)

También en GitHub se puede observar el estado:

![circle_8](../../img/Circle/circle_8.png)

Y mediante el status badge en el README del repositorio:

![circle_9](../../img/Circle/circle_9.png)