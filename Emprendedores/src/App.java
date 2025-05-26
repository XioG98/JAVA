import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del Emprendedor: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el documento del Emprendedor: ");
        String documento = sc.nextLine();
        System.out.print("Ingrese el sector al que pertenece el Emprendedor: ");
        String sector = sc.nextLine();
        System.out.print("Ingrese la ciudad del Emprendedor: ");
        String ciudad = sc.nextLine();

        //Creación de objeto para llamar el constructor de la clase emprendedor
        Emprendedor emp = new Emprendedor(nombre, documento, sector, ciudad) ;

        System.out.print("\nIngrese el nombre del Proyecto: ");
        String nombreProyecto = sc.nextLine();
        System.out.print("Ingrese la descripción del Proyecto: ");
        String descripcion = sc.nextLine();
        System.out.print("Ingrese el nivel de innovación del Proyecto (Bajo, Medio, Alto): ");
        String nivel = sc.nextLine();
        System.out.print("Ingrese el estado del Proyecto: ");
        String estado = sc.nextLine();

        //Creación de objeto para llamar el constructor de la clase Proyecto
        Proyecto pry = new Proyecto(nombreProyecto, descripcion, nivel, estado, emp) ;

        System.out.println("\n ----------------------------------------------------");

        // Aqui llamo al objeto pry y el metodo mostrarResumen
        pry.mostrarResumen();
        sc.close();
    }
}
