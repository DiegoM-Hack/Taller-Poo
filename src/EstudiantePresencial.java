public class EstudiantePresencial extends Estudiante{

    private int horasPresencial;
    private String horario;

    public EstudiantePresencial(int horasPresencial, String horario, String nombre, String cedula, String correo, String telefono, String direccion, String carrera, String nivel){
        super(nombre, cedula, correo, telefono, direccion, carrera, nivel);
        this.horasPresencial = horasPresencial;
        this.horario = horario;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas presencial: " + horasPresencial);
        System.out.println("Horario: " + horario);

    }

    @Override
    public void calcularEdad(int ano, int anoActual) {}

}
