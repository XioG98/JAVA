import java.util.Scanner;

public class Cuadratica {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Vamos a resolver ax^2 + bx + c");
        System.out.print("Digite un valor para a: ");
        double a = valores.nextDouble();
        System.out.print("Digite un valor para b: ");
        double b = valores.nextDouble();
        System.out.print("Digite un valor para c: ");
        double c = valores.nextDouble();
        //Calculo de variables
        double discriminante = Math.pow(b,2) - 4*a*c;
        //Condicionar
        if (discriminante > 0 ) {
            if (a != 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("El resultado es: " + x1);
                System.out.println("El resultado es: " + x2);
            } else {
                System.out.printf("El valor de a debe ser diferente de 0");
        }
        } else {
            System.out.printf("No tiene solución en el conjunto de los reales");
        }
    }
}
