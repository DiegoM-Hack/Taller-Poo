public class Persona {
    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;
    private String direccion;

    public Persona(String nombre, String cedula, String correo, String telefono, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    public void mostrarInformacion() {
        System.out.println("========================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);

    }
}
