
FROM openjdk:8-jdk-alpine

LABEL autor="Raul Del Pozo Moreno"
LABEL email="rauldpm@correo.ugr.es"

# Establece la version de gradle a usar
ENV GRADLE_VERSION 6.7

# Descarga gradle
RUN wget  https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip
# Descomprime la descarga en /opt
RUN unzip gradle-$GRADLE_VERSION-bin.zip -d /opt
# Elimina la descarga
RUN rm -f gradle-$GRADLE_VERSION-bin.zip

# Establece variables de entorno necesarias para la ejecucion
ENV GRADLE_HOME /opt/gradle-$GRADLE_VERSION
ENV PATH $PATH:/opt/gradle-$GRADLE_VERSION/bin

# Crea carpeta de trabajo en contenedor
RUN mkdir /app
# Copia el contenido a la carpeta de trabajo
COPY . /app
# Establece el directorio de trabajo
WORKDIR /app

# Establee la accion a realizar al ejecutar docker
CMD ["gradle", "--no-daemon", "test"]
