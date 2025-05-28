import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//Capturar info del responsable
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el documento de la persona: ");
        String  documento = sc.nextLine();

        System.out.println("Ingrese la ciudad de la persona: ");
        String ciudad = sc.nextLine();

        System.out.println("Ingrese el número de celular: ");
        String celular = sc.nextLine();

        System.out.println("Ingrese el cargo del responsable: ");
        String cargo = sc.nextLine();

        Responsable resp = new Responsable(nombre, documento, ciudad, celular, cargo);

// Capturas info proyecto

        System.out.println("Ingrese el código del proyecto: ");
        String codigo = sc.nextLine();

        System.out.println("Ingrese la ciudad donde se va a realizar el proyecto: ");
        String  ciudadProyecto = sc.nextLine();

        System.out.println("Ingrese el área en m² ");
        double area = sc.nextLine();

        System.out.println("Ingrese la eficiencia: ");
        double eficiencia = sc.nextLine();

        System.out.println("Ingrese la radiación de la localidad en kWh/m²/día: ");
        double radiacion = sc.nextLine();

        if ((area != 0.0) && (eficiencia != 0.0) && (radiacion != 0.0)) {
            double energiaGenerada = eficiencia * area * radiacion;

        }


        private String clasificacion;
    }
}