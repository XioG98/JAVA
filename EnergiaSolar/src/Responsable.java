public class Responsable extends Persona {
    private String cargo;
    private NombreInstitucion nombreInstitucion;
    public Responsable(String nombre, String documento, String ciudad, String celular, String cargo, NombreInstitucion nombreInstitucion) {
        super(nombre, documento, ciudad, celular); // Llama al constructor de la clase Persona
        this.cargo = cargo;
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getCargo() {return cargo;}
    public NombreInstitucion getNombreInstitucion() { return nombreInstitucion;}
}