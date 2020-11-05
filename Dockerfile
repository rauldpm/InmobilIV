
# Contenedor base
FROM gradle:6.7-jdk8-hotspot

# Informacion de autor
LABEL autor="Raul Del Pozo Moreno"
LABEL email="rauldpm@correo.ugr.es"


RUN mkdir /home/gradle/tmpa
WORKDIR /home/gradle/tmpa
COPY build.gradle.kts .
RUN gradle assemble
RUN rm build.gradle.kts
RUN chown gradle /home/gradle/tmpa

#RUN chown gradle .
USER gradle



# Establece el directorio de trabajo
WORKDIR /test

# Establece la accion a realizar al ejecutar docker
CMD cp -r /home/gradle/tmpa/* /test && gradle --no-rebuild --no-build-cache test
