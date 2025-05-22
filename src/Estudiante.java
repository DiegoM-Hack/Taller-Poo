public class Estudiante extends Persona {

    private String carrera;
    private String nivel;

    public Estudiante(String nombre, String cedula, String correo, String telefono, String direccion, String carrera, String nivel) {
        super(nombre, cedula, correo, telefono, direccion);
        this.carrera = carrera;
        this.nivel = nivel;
    }

    public void calcularEdad(int ano, int anoActual) {
        int edad = anoActual - ano;
        System.out.println("Edad: " + edad);
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel: " + nivel);
    }


}
