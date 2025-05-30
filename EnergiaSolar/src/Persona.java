public class Persona {
    protected String nombre;
    protected String documento;
    protected String ciudad;
    protected String celular;

    public Persona(String nombre, String documento, String ciudad, String celular) {
        this.nombre = nombre;
        this.documento = documento;
        this.ciudad = ciudad;
        this.celular = celular;
    }

    //Getters
    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public String getCiudad() { return ciudad; }
    public String getCelular() { return celular; }

/*    // Setters
    public void setCiudad(String nombre) {
        if (!ciudad.isEmpty()) {
            this.ciudad = ciudad;
        }
    }
    public void setCelular(String nombre) {
        if (!celular.isEmpty()) {
            this.celular = celular;
        }
    }*/
    //Metodo comun heredable po subclases, acceso publico, no retorna
    public void mostrarDatosBasicos() {
        System.out.println("\tnombre: " + nombre);
        System.out.println("\tdocumento: " + documento);
        System.out.println("\tciudad: " + ciudad);
        System.out.println("\tcelular: " + celular);
    }
}
