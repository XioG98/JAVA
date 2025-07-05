package abstraccion;

public class Invitado extends Usuario implements Autenticable {
    public Invitado(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public void mostrarPerfil() {
        System.out.println("Invitado: " + nombre + " - Correo: " + correo);
    }

    @Override
    public boolean login (String usuario, String clave) {
        //Para invitados, permitimos cualqier accesocon clave especifica
        return clave.equals("invitado123");
    }
}
