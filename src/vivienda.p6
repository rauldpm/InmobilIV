class Vivienda {
    has $.superficie;
    has $.habitaciones;
    has $.precio;
    has $.direccion;
    has $.propietario;

    # Constructor de clase
    method new ($superficie, $habitaciones, $precio, $direccion, $propietario) {
        self.bless( :$superficie, :$habitaciones, :$precio, :$direccion, :$propietario );
    }
}