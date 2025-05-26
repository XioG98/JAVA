import java.util.Scanner;

public class BienvenidaConsola {
    public static void main(String[] args) {
        /*Capturar datos de la consola, usamos una clase llamada Scanner.
    Creamos una instancia de clase Scanner
    recibe valores de la consola y almacenarlos */
        Scanner entrada = new Scanner(System.in);

        // Captura de datos
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
//Puedo almacenarlo como int, y la entrada seria nextInt
        System.out.println("Ingrese su codigo de empelado: ");
        String codigo = entrada.nextLine();

        System.out.println(nombre + " su codigo de empleado es: " + codigo);
    }
}
