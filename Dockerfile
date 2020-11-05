
# Contenedor base
#FROM openjdk:8-jdk-alpine
FROM gradle:6.7-jdk8-hotspot

# Informacion de autor
LABEL autor="Raul Del Pozo Moreno"
LABEL email="rauldpm@correo.ugr.es"

# Especifica el usuario no root
USER gradle

# Establece el directorio de trabajo
WORKDIR /test

# Establece la accion a realizar al ejecutar docker
CMD gradle test
