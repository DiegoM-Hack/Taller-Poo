import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Ingreso para Estudiante
        System.out.println("Ingrese datos del Estudiante:");
        System.out.print("Nombre: ");
        String nombreEst = sc.nextLine();
        System.out.print("Cedula: ");
        String cedulaEst = sc.nextLine();
        System.out.print("Email: ");
        String emailEst = sc.nextLine();
        System.out.print("Telefono: ");
        String telefonoEst = sc.nextLine();
        System.out.print("Dirección: ");
        String direccionEst = sc.nextLine();
        System.out.print("Carrera: ");
        String carreraEst = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelEst = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombreEst, cedulaEst, emailEst, telefonoEst, direccionEst, carreraEst, nivelEst);
        estudiante.mostrarInformacion();
        estudiante.calcularEdad(2000, 2025);

        // Ingreso para Docente
        System.out.println("\nIngrese datos del Docente:");
        System.out.print("Nombre: ");
        String nombreDoc = sc.nextLine();
        System.out.print("Cedula: ");
        String cedulaDoc = sc.nextLine();
        System.out.print("Email: ");
        String emailDoc = sc.nextLine();
        System.out.print("Telefono: ");
        String telefonoDoc = sc.nextLine();
        System.out.print("Dirección: ");
        String direccionDoc = sc.nextLine();
        System.out.print("Facultad: ");
        String facultad = sc.nextLine();
        System.out.print("Años de experiencia: ");
        int experiencia = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Docente docente = new Docente(nombreDoc, cedulaDoc, emailDoc, telefonoDoc, direccionDoc, facultad, experiencia);
        docente.mostrarInformacion();

        // Ingreso para Estudiante Virtual
        System.out.println("\nIngrese datos del Estudiante Virtual:");
        System.out.print("Plataforma: ");
        String plataforma = sc.nextLine();
        System.out.print("Nombre: ");
        String nombreEV = sc.nextLine();
        System.out.print("Carrera: ");
        String carreraEV = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelEV = sc.nextLine();
        System.out.print("Tutor: ");
        String representante = sc.nextLine();
        System.out.print("Cedula: ");
        String cedulaEV = sc.nextLine();
        System.out.print("Email: ");
        String emailEV = sc.nextLine();
        System.out.print("Telefono: ");
        String telefonoEV = sc.nextLine();
        System.out.print("Dirección: ");
        String direccionEV = sc.nextLine();

        EstudianteVirtual estudianteVirtual = new EstudianteVirtual(plataforma, nombreEV, carreraEV, nivelEV, representante, cedulaEV, emailEV, telefonoEV, direccionEV);
        estudianteVirtual.mostrarInformacion();

        // Ingreso para Estudiante Presencial
        System.out.println("\nIngrese datos del Estudiante Presencial:");
        System.out.print("Horas de clase: ");
        int horas = sc.nextInt();
        sc.nextLine();
        System.out.print("Horario: ");
        String horario = sc.nextLine();
        System.out.print("Nombre: ");
        String nombreEP = sc.nextLine();
        System.out.print("Cedula: ");
        String cedulaEP = sc.nextLine();
        System.out.print("Email: ");
        String emailEP = sc.nextLine();
        System.out.print("Telefono: ");
        String telefonoEP = sc.nextLine();
        System.out.print("Dirección: ");
        String direccionEP = sc.nextLine();
        System.out.print("Carrera: ");
        String carreraEP = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelEP = sc.nextLine();

        EstudiantePresencial estudiantePresencial = new EstudiantePresencial(horas, horario, nombreEP, cedulaEP, emailEP, telefonoEP, direccionEP, carreraEP, nivelEP);
        estudiantePresencial.mostrarInformacion();
        estudiante.calcularEdad(2005, 2025);

        // Ingreso para Docente en Línea
        System.out.println("\nIngrese datos del Docente En Línea:");
        System.out.print("Nombre: ");
        String nombreDL = sc.nextLine();
        System.out.print("Cedula: ");
        String cedulaDL = sc.nextLine();
        System.out.print("Email: ");
        String emailDL = sc.nextLine();
        System.out.print("Direccion: ");
        String direccionDL = sc.nextLine();
        System.out.print("Facultad: ");
        String facultadDL = sc.nextLine();
        System.out.print("Años de experiencia: ");
        int expDL = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo de contrato: ");
        String contrato = sc.nextLine();

        DocenteEnLinea docente2 = new DocenteEnLinea(nombreDL, cedulaDL, emailDL, direccionDL, facultadDL, expDL, contrato);
        docente2.mostrarInformacion();

        sc.close();
    }
}