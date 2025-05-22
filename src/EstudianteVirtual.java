public class EstudianteVirtual extends Estudiante{
    private String plataforma;
    private String tutorVirtual;

    public EstudianteVirtual(String plataforma, String tutorVirtual, String carrera, String nivel, String nombre, String cedula, String correo, String telefono, String direccion) {
        super(nombre, cedula, correo, telefono, direccion, carrera, nivel);
        this.plataforma = plataforma;
        this.tutorVirtual = tutorVirtual;

    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Plataforma Virtual : " + plataforma);
        System.out.println("Tutor Virtual : " + tutorVirtual);

    }
}
