package abstraccion;

public class Administrador extends Usuario implements Autenticable {
    public Administrador(String nombre, String correo) {
        super(nombre,correo);
    }

    @Override
    public void mostrarPerfil() {
        System.out.println("Administrador: " + nombre + " - Correo: " + correo);
    }

    @Override
    public boolean login(String usuario, String clave) {
        return usuario.equals("admin") && clave.equals("1234");
    }
}
