
public class Main {
    public static void main(String[] args) {


        Estudiante estudiante = new Estudiante("Diego Montaluisa","1732093209","diego@gmail.com","092139123","Cdla. Ibarra","Desarrollo de software","4");
        estudiante.mostrarInformacion();
        estudiante.calcularEdad(2000, 2025);

        Docente docente = new Docente("Camila","1732093209","diego@gmail.com","092139123","Cdla. Ibarra","ESFOT",8);
        docente.mostrarInformacion();

        EstudianteVirtual estudianteVirtual = new EstudianteVirtual("Zoom","Sara lopez","Desarrollo Software","5","Daniel Montaluisa","1732093209","diego@gmail.com","092139123","Cdla. Ibarra");
        estudianteVirtual.mostrarInformacion();

        EstudiantePresencial estudiantePresencial = new EstudiantePresencial(10,"lunes y jueves","Camila Montaluisa","1732093209","diego@gmail.com","092139123","Cdla. Ibarra","Desarrollo de software","4");
        estudiantePresencial.mostrarInformacion();
        estudiante.calcularEdad(2005, 2025);


    }
}