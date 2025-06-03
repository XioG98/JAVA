package herencia;

public class Persona {
    //Definir los atributos comunes; será nuestra super clase
    protected String nombre;
    protected String documento;
    protected String ciudad;

    //Constructor(es un metodo) y sus atributos

    public Persona(String nombre, String documento, String ciudad) {
        this.nombre = nombre;
        this.documento = documento;
        this.ciudad = ciudad;
    }

    //Acceso con los getters; es un metodo también
    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public String getCiudad() { return ciudad; }

    // Setters acceso publico, no retorna, valida que no esté empty
//A nombre y documento no los podemos cambiar,
    public void setCiudad(String nombre) {
        if (!ciudad.isEmpty()) {
            this.ciudad = ciudad;
        }
    }

    //Metodo comun heredable po subclases, acceso publico, no retorna
    public void mostrarDatosBasicos() {
        System.out.println("nombre = " + nombre);
        System.out.println("documento = " + documento);
        System.out.println("ciudad = " + ciudad);
    }
}
