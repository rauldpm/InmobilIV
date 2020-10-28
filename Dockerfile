
# Contenedor base
FROM openjdk:8-jdk-alpine

# Informacion de autor
LABEL autor="Raul Del Pozo Moreno"
LABEL email="rauldpm@correo.ugr.es"

# Establece la version de gradle a usar
ENV GRADLE_VERSION 6.7

# Descarga zip de gradle
RUN wget  https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip
# Descomprime la descarga en /opt para su uso directo
RUN unzip gradle-$GRADLE_VERSION-bin.zip -d /opt
# Elimina el zip de descarga
RUN rm -f gradle-$GRADLE_VERSION-bin.zip

# Establece variables de entorno necesarias para la ejecucion
ENV GRADLE_HOME /opt/gradle-$GRADLE_VERSION
ENV PATH $PATH:/opt/gradle-$GRADLE_VERSION/bin

# Copia el taskrunner
COPY build.gradle.kts /

# Comandos de creacion de usuario comentados debido a un problema con la ejecucion 
# en el repositorio de evaluacion.
# El problema es de permisos ya que necesita sobrescribir el fichero build.gradle.kts 
# que ya existe al montarlo y da error.

# Crea usuario normal sin contraseña
#RUN adduser -D userIV
# Indica que a partir de ahora se ejecutara como usuario non-root
#USER userIV

# Establece el directorio de trabajo
WORKDIR /test

# Establece la accion a realizar al ejecutar docker
CMD cp /build.gradle.kts /test && gradle test

