public class Proyecto {
    private String codigo;
    private String ciudadProyecto;
    private double area;
    private double eficiencia;
    private double radiacion;
    private EstadoProyecto estado;
    private  Responsable responsable;
    private double energiaGenerada;
    private String clasificacion;
// Tipo de area: industral o domestico (casa campo, etc)

    public Proyecto(String codigo, String ciudad,double area, double eficiencia, double radiacion, EstadoProyecto estado, Responsable responsable) {
        this.codigo = codigo;
        this.ciudadProyecto = ciudad;
        this.area = area;
        this.eficiencia = eficiencia;
        this.radiacion = radiacion;
        this.estado = estado.PENDIENTE;
        this.responsable = responsable;
    }

    public EstadoProyecto getEstado(){ return estado;}
    //Habilitamos para modificar
    public  void setEstado (EstadoProyecto estado) {
        this.estado = estado;
    }

    public void mostrarResumen() {

        System.out.println("Registro de Proyecto Exitoso\n");
        System.out.println("   Responsable   ");
        if ( responsable instanceof Responsable) {
            responsable.mostrarDatosBasicos(); //Los trae de la supeprclase, emprendedor los heredó de persona
            System.out.println("Cargo: " + ((Responsable) responsable).getCargo());
        }
        System.out.println("\t   Proyecto   ");
        System.out.println("\tCódigo: " + codigo);
        System.out.println("\tCiudadProyecto: " + ciudadProyecto);
        System.out.println("\tEstado: " + estado);
        System.out.println("\t   Características   ");
        System.out.println("\tArea: " + area);
        System.out.println("\tEstado: " + estado);
        System.out.println("\tEficiencia: " + eficiencia);
        System.out.println("\tRadiacion solar: " + radiacion);
        System.out.println("--------------------------------------------");
        System.out.printf("\n\t Energía generada estimada:  %.2f kWh/día \n", energiaGenerada);
        System.out.println("\t Clasificación: " + clasificacion);

    }
}
