import java.util.Scanner;

public class CuadraticAlternative {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        String resultado;
        double x1 = 0;
        double x2 = 0;


        //Entrada de datos
        System.out.println("Vamos a resolver ax^2 + bx + c");
        System.out.print("Digite un valor para a: ");
        double a = valores.nextDouble();
        System.out.print("Digite un valor para b: ");
        double b = valores.nextDouble();
        System.out.print("Digite un valor para c: ");
        double c = valores.nextDouble();
        //Calculo de variables
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        //Condicionar

        if (discriminante < 0) {
            resultado = "No tiene solución en el conjunto de los reales";
        } else if (a == 0) {
            resultado = "El valor de a debe ser diferente de 0";
        } else {
            resultado = "ok";
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        }

        if (resultado.equals("ok")) {
            System.out.println("El resultado es: " + x1);
            System.out.println("El resultado es: " + x2);
        }
    }
}
