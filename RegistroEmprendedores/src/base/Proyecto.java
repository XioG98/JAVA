package base;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private NivelInnovacionProyecto nivelInnovacion;
    private EstadoProyecto estado;
    private Emprendedor emprendedor;

    //Aqui en lugar de poner la tipo String, le pongo el tipo enum base.EstadoProyecto, y NivelInnovacion
    public Proyecto(String nombre, String descripcion, NivelInnovacionProyecto nivelInnovacion, EstadoProyecto estado, Emprendedor emprendedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelInnovacion = nivelInnovacion;
        this.estado = estado;
        this.emprendedor = emprendedor;
    }
    //Nos va a permitir tener acceso al valor del atributo estado que esta encapsulado en proyecto
    public EstadoProyecto getEstado(){ return estado;}

    //Al atributo le estamos habilitando la modificacion
    public  void setEstado (EstadoProyecto estado) {
            this.estado = estado;
    }

    public NivelInnovacionProyecto getNivelInnovacion() {return nivelInnovacion;}
    public void setNivelInnovacion(NivelInnovacionProyecto nivelInnovacion) {
            this.nivelInnovacion = nivelInnovacion;
    }

    public void mostrarResumen() {
        System.out.println("Registro exitoso\n");
        System.out.println("   base.Emprendedor   ");
        System.out.println("\tNombre: " + emprendedor.getNombre());
        System.out.println("\tDocumento: " + emprendedor.getDocumento());
        System.out.println("\tSector: " + emprendedor.getSector());
        System.out.println("\tCiudad: " + emprendedor.getCiudad());
        System.out.println("\t   base.Proyecto   ");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tDescripción: " + descripcion);
        System.out.println("\tNivel de innovación: " + nivelInnovacion);
        System.out.println("\tEstado: " + estado);
    }
}
