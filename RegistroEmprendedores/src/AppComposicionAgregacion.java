import abstraccion.*;

public class AppAbstraccion {
    public static void main(String[] args) {
        // Instancias de subclases concretas de Persona
        Emprendedor laura = new Emprendedor("123", "Laura", "Tecnología", "Medellín");
        Mentor andres = new Mentor("Andrés", "456", "Educación", "Bogotá", "Fortalecimiento");
        Evaluador carlos = new Evaluador("Carlos", "789", "Finanzas", "Cali");

        // Instancias de subclases concretas de Usuario
        Administrador ana = new Administrador("Ana", "admin001");
        Invitado visitante = new Invitado("Visitante", "visitante@email.com");

        // Polimorfismo dinámico: mostrarResumen() desde clase abstracta Persona
        Persona[] personas = {laura, andres, carlos};
        System.out.println("=== Participantes del sistema ===");
        for (Persona p : personas) {
            p.mostrarResumen();
            System.out.println("---");
        }

        // Polimorfismo estático: sobrecarga de métodos registrar(...)
        RegistroServicio servicio = new RegistroServicio();
        servicio.registrar(laura);
        servicio.registrar("Registro Mentor", andres);
        servicio.registrar(carlos, true);

        // Interfaz Autenticable: autenticación de usuarios
        System.out.println("=== Autenticación de usuarios ===");
        autenticar(ana, "admin", "1234");
        autenticar(visitante, "cualquier_usuario", "invitado123");
    }
    public static void autenticar(Autenticable user, String usuario, String clave) {
        boolean acceso = user.login(usuario, clave);
        System.out.println("Resultado: " + (acceso ? "Acceso permitido" : "Acceso denegado"));
        System.out.println("---");
    }
}