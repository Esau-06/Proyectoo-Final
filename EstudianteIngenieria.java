public class EstudianteIngenieria {
    
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int NumeroSemestre;
    private float PromedioAcumulado;
    private String SerialEquipo;
    
    public EstudianteIngenieria() {
    }

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre,
            float promedioAcumulado, String serialEquipo) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        NumeroSemestre = numeroSemestre;
        PromedioAcumulado = promedioAcumulado;
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
    public int getNumeroSemestre() {
        return NumeroSemestre;
    }
    public void setNumeroSemestre(int numeroSemestre) {
        NumeroSemestre = numeroSemestre;
    }
    public float getPromedioAcumulado() {
        return PromedioAcumulado;
    }
    public void setPromedioAcumulado(float promedioAcumulado) {
        PromedioAcumulado = promedioAcumulado;
    }
    public String getSerialEquipo() {
        return SerialEquipo;
    }
    public void setSerialEquipo(String serialEquipo) {
        SerialEquipo = serialEquipo;
    }

}