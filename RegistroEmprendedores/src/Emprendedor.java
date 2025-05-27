public class Emprendedor { //Clase Plantilla
    // se pone private para que solo se muestre si la llamo, no se pue
    private String documento;
    private String nombre;
    private String sector;
    private String ciudad;

    public Emprendedor(String documento, String nombre, String sector, String ciudad) {
        this.documento = documento;
        this.nombre = nombre;
        this.sector = sector;
        this.ciudad = ciudad;
    }

    public String getDocumento() {return documento;}
    public String getNombre() {return nombre;}
    public String getSector() {return sector;}
    public String getCiudad() {return ciudad;}
}
