package polimorfismo;
//Aquí estamos aplicando el polimorfismo dinamico, dependiendo de los parametros que reciba, ejecuta el metodo
public class RegistroServicio {

    // Registro Básico
    public void registrar(Persona persona) {
        System.out.println("Registro básico: ");
        persona.mostrarResumen();
    }
    // Registro con mensaje adicional
    public void registrar(Persona persona, boolean mostrarMensaje) {
        if (mostrarMensaje) {
            System.out.println("Registro exitoso.");
        }
        persona.mostrarResumen();
    }

    //Registro con mensaje personalidado
    public void registrar(String mensaje, Persona persona) {

        System.out.println(mensaje);
        persona.mostrarResumen();
    }

    //Registro Multiple (sobrecarga con un arreglo)
    //Se crea un arreglo de personas a partir de Persona
    public void registrar(Persona[] personas) {
        System.out.println("Registro en lote: ");
        for (Persona p : personas) {
            p.mostrarResumen();
        }
    }
}
