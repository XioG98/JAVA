import java.util.Scanner;

public class SimuladorEnergiaSolar {
    public static void main(String[] args) {
        double[] datos = capturarDatos();
        double eficiencia = datos[0];
        double area = datos[1];
        double radiacion = datos[2];
        System.out.println("\nSimulador de Energía Solar Fotovoltaica");
        System.out.println("Evaluación de eficiencia - Transición Energética Justa");
        calcularYMostrarResultados(area,radiacion,eficiencia);
    }
    public static double[] capturarDatos(){
        Scanner datos = new Scanner(System.in);
        //Capturar y validiad datos
        System.out.print("Ingrese el valor de la eficiencia: ");
        double eficiencia = datos.nextDouble();
        if (eficiencia < 0.10 || eficiencia > 0.25){
            System.out.println("Eficiencia fuera del rango válido. Terminando  proceso");
            System.exit(0); // finaliza el proceso
        }
        System.out.print("Ingrese el valor del área en m²: ");
        double area = datos.nextDouble();

        if (area < 5 || area > 50) {
            System.out.println("Área fuera del rango válido. Terminando  proceso");
            System.exit(0); // finaliza el proceso
        }
        System.out.print("Ingrese el valor de la radiación solar promedio diaria en kWh/m²/día: ");
        double radiacion = datos.nextDouble();

        if (radiacion < 3.5 || radiacion > 6.5) {
            System.out.println("Radiación fuera del rango válido. Terminando  proceso");
            System.exit(0); // finaliza el proceso
        }
        return new double[]{eficiencia, radiacion, area};
    }
//El siguiente es un metodo void porque no retorna nada, solo es para imprimir/mostrar la información.
    public static void calcularYMostrarResultados(double eficiencia, double area, double radiacion) {
        double energiaGenerada = eficiencia * area * radiacion;
        String clasificacion;

        if (energiaGenerada < 5 ){
            clasificacion = "Producción baja";
        } else if (energiaGenerada >= 5 && energiaGenerada <= 10) {
            clasificacion = "Producción media ";
        } else  {
            clasificacion = "Producción alta";
        }
        System.out.println("\nResultado de tu instalacion:");
        System.out.println("\tÁrea total: " + area + " m²");
        System.out.println("\tEficiencia del panel: " + eficiencia);
        System.out.println("\tRadiación promedio diaria: " + radiacion + " kWh/m²/día");
        System.out.printf("\n\t Energía generada estimada:  %.2f kWh/día \n", energiaGenerada);
        System.out.println("\t Clasificación: " + clasificacion);
    }
}
