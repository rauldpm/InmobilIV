
# Contenedor base
FROM gradle:6.7-jdk8

# Informacion de autor
LABEL autor="Raul Del Pozo Moreno"
LABEL email="rauldpm@correo.ugr.es"

# Establece el directorio de trabajo
WORKDIR /test

# Establece la accion a realizar al ejecutar docker
CMD gradle test && gradle clean
