
## Creacion de claves y subida a GitHub <a id="claves"></a>

Mediante esta configuracion se conseguirá que git no pida el correo ni la contraseña cada vez que se quiera gestionar el repositorio, para ello, primero hay que crear una clave en la maquina local mediante el comando:

> ssh-keygen -t rsa -b 4096 -C "email"

Esto generara un par de claves pubica/privada, donde hay que indicar el nombre del fichero que albergara las claves (por defecto: id_rsa) y una contraseña.

![Creacion claves](img/generated_key.png)

En GitHub hay que almacenar la clave publica creada, para ello, hay que ir a "Settings" > "SSH and GPG keys", donde se pulsara sobre "New SSH key" y se pondra un titulo y la clave que se encuentra en el fichero "id_rsa.pub" (o como se haya llamado).

![SSH key GitHub](img/github_key.png)

Una vez hecho esto hay que establecer que el repositorio remoto sea mediante ssh, para ello, se elimina el repositorio mediante:

> git remote rm origin
>
> git remote add origin ssh://git@github.com/usuario/repo.git

Asi, al realizar un push no pedirá el email ni la contraseña:

![git push sin password](img/git_push.png)

## Configuracion del perfil de GitHub <a id="perfil"></a>


Para configurar el perfil simplemente hay que ir a "Settings" y en la pestaña "Profile" rellenar los datos que se pidan.

![profile](img/perfil.png)

## Configuracion del cliente de GitHub <a id="gh"></a>

Mediante este cliente se podrá disponer de un comandos para interactuar con GitHub sin necesidad de la web.

Por ejemplo, permitira crear *issues* con el comando:

> gh issue create --title "titulo" --body "cuerpo"

Para ello, primero he tenido que instalar el paquete *gh-cli* para ArchLinux desde su repositorio AUR.

Primero, hay que autentificarse mediante el comando

> gh auth login

Nos preguntara el tipo de cuenta, que se tiene, elijo la normal (no empresarial): github.com

![Tipo de cuenta](docs/../img/GitCli/gh_log1.png)

Acto seguido preguntara como se quiere identificarse, si mediante un token de autenticacion o mediante la web, esta ultima opcion proporcionara un codigo de un solo uso y abrira una ventana del navegador.

![Tipo de autentificacion](docs/../img/GitCli/gh_log2.png)

![Codigo](docs/../img/GitCli/gh_log3.png)

En el navegador, habra que autenticarse con la cuenta de github y acto seguido introducir dicho codigo de un solo uso.

![Web](docs/../img/GitCli/gh_log4.png)

Si lo acepta, tendremos que autorizar a GitHub CLI como una aplicacion de confianza.

Cuando lo hayamos aceptado, nos preguntara el tipo de protocolo de conexion a usar, elijo SSH.

![SSH](docs/../img/GitCli/gh_log5.png)

Y finalmente se habra logueado.

![SSH](docs/../img/GitCli/gh_log6.png)