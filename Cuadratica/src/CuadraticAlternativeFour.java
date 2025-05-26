import java.util.Scanner;

public class CuadraticAlternativeFour {
    public static void main(String[] args) {

        //Variables
        //Variable de tipo arreglo; para acudir al arreglo es []; se construye con llaves {}
        double[] coeficientes = capturaCoeficientes();
        double a = coeficientes[0];
        double b = coeficientes[1];
        double c = coeficientes[2];

        //Calculo e impresion de resultado
        String resultado = resolverCuadratica(a,b,c);
        System.out.printf(resultado);
    }
    public static double[] capturaCoeficientes() {
        Scanner valores = new Scanner(System.in);
        //Entrada de datos
        System.out.println("Vamos a resolver ax^2 + bx + c");
        System.out.print("Digite un valor para a: ");
        double a = valores.nextDouble();
        System.out.print("Digite un valor para b: ");
        double b = valores.nextDouble();
        System.out.print("Digite un valor para c: ");
        double c = valores.nextDouble();

        return new double[]{a,b,c};
    }

    public static String resolverCuadratica(double a, double b, double c) {
        //Usaremos la clausula de guardia y evitamos condicionales anidados
        if (a == 0) {
            return "El valor de a debe ser diferente de cero";
        }
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante < 0) {
            return "No tiene solución en el conjunto de los reales";
        }
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return "Las soluciones de las expresiones son:\n " +
                "x1= "+ x1 +"\n" +
                "x2= "+ x2;

    }
}
