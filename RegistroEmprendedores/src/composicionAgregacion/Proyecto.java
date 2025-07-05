package abstraccion;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private NivelInnovacionProyecto nivelInnovacion;
    private EstadoProyecto estado;
    private Emprendedor emprendedor;
    private Mentor mentor;

    //Aqui en lugar de poner la tipo String, le pongo el tipo enum EstadoProyecto, y NivelInnovacion
    public Proyecto(String nombre, String descripcion, NivelInnovacionProyecto nivelInnovacion, EstadoProyecto estado, Emprendedor emprendedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelInnovacion = nivelInnovacion;
        this.estado = estado;
        this.emprendedor = emprendedor;
        this.mentor = mentor;
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
        System.out.println("   Emprendedor   ");
        //Si emprendedor es instancia de emprendedor, imprimimos los datos
        if ( emprendedor instanceof Emprendedor) {
            emprendedor.mostrarDatosBasicos(); //Los trae de la supeprclase, emprendedor los heredó de persona
            System.out.println("Sector = " + ((Emprendedor) emprendedor).getSector());
        }
        System.out.println("\t   Proyecto   ");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tDescripción: " + descripcion);
        System.out.println("\tNivel de innovación: " + nivelInnovacion);
        System.out.println("\tEstado: " + estado);
    }
}
