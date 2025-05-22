public class Docente extends Persona {
    private String facultad;
    private int horasClase;


    public Docente(String nombre, String cedula, String correo, String telefono, String direccion, String facultad, int horasClase) {
        super(nombre, cedula, correo, telefono, direccion);
        this.facultad = facultad;
        this.horasClase = horasClase;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Facultad: " + facultad);
        System.out.println("Horas asignadas: " + horasClase);
    }
}
