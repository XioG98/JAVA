package polimorfismo;

public class Mentor extends Persona {
    private String areaExperticia;

    public Mentor(String nombre, String documento, String ciudad, String sector, String areaExperticia) {
        super(nombre,documento,ciudad, sector);
        this.areaExperticia = areaExperticia;
    }

    @Override
    public void mostrarResumen() {
        System.out.println(nombre + " - Mentor en " + areaExperticia + " del sector " + sector);
    }

    @Override
    public void mostrarDatosBasicos() {
        super.mostrarDatosBasicos();
        System.out.println("areaExperticia = " + areaExperticia);
    }
}


