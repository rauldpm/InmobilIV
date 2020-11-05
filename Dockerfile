
# Contenedor base
FROM openjdk:8-jdk-alpine

# Informacion de autor
LABEL autor="Raul Del Pozo Moreno"
LABEL email="rauldpm@correo.ugr.es"

# Establece la version de gradle a usar
ENV GRADLE_VERSION 6.7

# Establece el directorio de trabajo para la instalacion de Gradle
WORKDIR /opt
# Descarga zip de gradle
RUN wget https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip
# Descomprime la descarga para su uso directo. Mejora tiempo de ejecucion ya que evita copiar despues de descomprimir
RUN unzip gradle-$GRADLE_VERSION-bin.zip
# Elimina el zip de descarga
RUN rm -f gradle-$GRADLE_VERSION-bin.zip

# Establece variables de entorno necesarias para la ejecucion
ENV GRADLE_HOME /opt/gradle-$GRADLE_VERSION
ENV PATH $PATH:/opt/gradle-$GRADLE_VERSION/bin

# Crea usuario normal sin contraseña
RUN adduser -D userIV

# Copia el fichero taskrunner

#USER userIV

RUN mkdir /home/userIV/gradleBuild
COPY build.gradle.kts /home/userIV/gradleBuild
WORKDIR /home/userIV/gradleBuild

RUN gradle assemble
RUN rm build.gradle.kts


WORKDIR /test

# Establece la accion a realizar al ejecutar docker
CMD cp -r /home/userIV/gradleBuild/* /test && gradle --no-build-cache test
