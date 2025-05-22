public class DocenteEnLinea extends Docente{
    private String tipoContrato;

    public DocenteEnLinea(String nombre, String cedula, String correo, String telefono, String direccion, String facultad, int horasClase, String tipoContrato) {
        super(nombre, cedula, correo, telefono, direccion, facultad, horasClase);
        this.tipoContrato = tipoContrato;
    }

    public DocenteEnLinea(String nombre, String cedula, String correo, String direccion, String facultad, int horasClase, String tipoContrato) {
        super(nombre, cedula, correo, "",direccion, facultad, horasClase);
        this.tipoContrato = tipoContrato;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Contrato: " + tipoContrato);
    }
}
