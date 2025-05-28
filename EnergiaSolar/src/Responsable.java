public class Responsable extends Persona {
    private String cargo;

    public Responsable(String nombre, String documento, String ciudad, String celular, String cargo) {
        super(nombre, documento, ciudad, celular); // Llama al constructor de la clase Persona
        this.cargo = cargo;
    }

    public String getCargo() {return cargo;}

}