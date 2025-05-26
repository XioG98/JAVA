public class Proyecto {
    private String nombre;
    private String descripcion;
    private String nivelInnovacion;
    private String estado;
    private Emprendedor emprendedor;

    public Proyecto(String nombre, String descripcion, String nivelInnovacion, String estado, Emprendedor emprendedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelInnovacion = nivelInnovacion;
        this.estado = estado;
        this.emprendedor = emprendedor;
    }

    public void mostrarResumen() {
        System.out.println("Registro exitoso\n");
        System.out.println("   Emprendedor   ");
        System.out.println("\tNombre: " + emprendedor.getNombre());
        System.out.println("\tDocumento: " + emprendedor.getDocumento());
        System.out.println("\tSector: " + emprendedor.getSector());
        System.out.println("\tCiudad: " + emprendedor.getCiudad());
        System.out.println("\t   Proyecto   ");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tDescripción: " + descripcion);
        System.out.println("\tNivel de innovación: " + nivelInnovacion);
        System.out.println("\tEstado: " + estado);
    }
}
