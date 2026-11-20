package pe.saludpublica.model;

public class Paciente {
    private String documento;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;

    public Paciente(String documento, String nombres, String apellidos,
                    String telefono, String correo) {
        // Aún no asignamos los valores: la prueba debe mostrar el fallo.
    }

    public String getDocumento() { return documento; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
}
