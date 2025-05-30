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
        this.estado = estado;
        this.responsable = responsable;
    }

    public EstadoProyecto getEstado(){ return estado;}
    //Habilitamos para modificar
//    public  void setEstado (EstadoProyecto estado) {
//        this.estado = estado;
//    }

    public void mostrarResumen() {

        System.out.println("\nRegistro de Proyecto Exitoso\n");
        System.out.println("\t   Responsable   ");
        if ( responsable instanceof Responsable) {
            responsable.mostrarDatosBasicos(); //Los trae de la supeprclase, emprendedor los heredó de persona
            System.out.println("Cargo: " + ((Responsable) responsable).getCargo());
        }
        //Le calculamos la energia generada al proyecto y su clasificacion
        double energiaGenerada = 0;
        String clasificacion = null;
        if ((area != 0.0) && (eficiencia != 0.0) && (radiacion != 0.0)) {
            energiaGenerada = eficiencia * area * radiacion;

            if (energiaGenerada < 5) {
                clasificacion = "Producción baja";
            } else if (energiaGenerada >= 5 && energiaGenerada <= 10) {
                clasificacion = "Producción media ";
            } else {
                clasificacion = "Producción alta";
            }
        }

        System.out.println("\t   Proyecto   ");
        System.out.println("\tCódigo: " + codigo);
        System.out.println("\tCiudadProyecto: " + ciudadProyecto);
        System.out.println("\tEstado: " + estado);
        System.out.println("\t   Características   ");
        System.out.println("\tArea: " + area);
        System.out.println("\tEficiencia: " + eficiencia);
        System.out.println("\tRadiacion solar: " + radiacion);
        System.out.println("--------------------------------------------");
        System.out.printf("\n\t Energía generada estimada:  %.2f kWh/día \n", energiaGenerada);
        System.out.println("\t Clasificación: " + clasificacion);

    }
}
