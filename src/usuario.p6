class Usuario {
    has $.dni;
    has $.nombre;
    has $.apellido;
    has $.telefono;
    has $.email;

    # Constructor de clase
    method new ($dni, $nombre, $apellido, $telefono, $email) {
        self.bless( :$dni, :$nombre, :$apellido, :$telefono, :$email );
    }



}