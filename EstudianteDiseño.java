public class EstudianteDiseño {

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String ModalidadEstudio;
    private int CantidadAsignaturas;
    private int SerialEquipo;
    
    public EstudianteDiseño() {
    }

    public EstudianteDiseño(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio,
            int cantidadAsignaturas, int serialEquipo) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        ModalidadEstudio = modalidadEstudio;
        CantidadAsignaturas = cantidadAsignaturas;
        SerialEquipo = serialEquipo;
    }
    
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public String getModalidadEstudio() {
        return ModalidadEstudio;
    }
    public void setModalidadEstudio(String modalidadEstudio) {
        ModalidadEstudio = modalidadEstudio;
    }
    public int getCantidadAsignaturas() {
        return CantidadAsignaturas;
    }
    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        CantidadAsignaturas = cantidadAsignaturas;
    }
    public int getSerialEquipo() {
        return SerialEquipo;
    }
    public void setSerialEquipo(int serialEquipo) {
        SerialEquipo = serialEquipo;
    }

}