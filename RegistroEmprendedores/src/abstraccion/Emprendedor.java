package polimorfismo;

//se debe usar extends para poder usar la superclase
public class Emprendedor extends Persona {
    // se pone private para que solo se muestre si la llamo, no se pue

    public Emprendedor(String documento, String nombre, String sector, String ciudad) {
        //La expresion super le envia a la clase padrepara que haga la asignacion de los atribuos
        super(nombre,documento,sector, ciudad);
    }

    @Override
    public void mostrarResumen() {
        System.out.println(nombre + " - Emprendedor de " + sector + " en " + ciudad);
    }
}