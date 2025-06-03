import java.nio.DoubleBuffer;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Capturar info del responsable
        System.out.print("\nIngrese el nombre de la persona responsable: ");
        String nombre = sc.nextLine();

        System.out.print("\nIngrese el documento de la persona: ");
        String documento = sc.nextLine();

        System.out.print("\nIngrese la ciudad de la persona: ");
        String ciudad = sc.nextLine();

        System.out.print("\nIngrese el número de celular: ");
        String celular = sc.nextLine();

        System.out.print("\nIngrese el cargo del responsable: ");
        String cargo = sc.nextLine();

        NombreInstitucion nombreInstitucion = null;
        while (nombreInstitucion == null) {
            try {
                System.out.print("\nIngrese el nombre de la institución responsable de la instalación: SOLAR_ENERGIA_SA, PANELES_ECO_SOL, ENERGIA_VERDE_TEC SOLTEC_INSTALACIONES, SUNPOWER_COLOMBIA: ");
                String nombreTexto = sc.nextLine().toUpperCase();
                nombreInstitucion = NombreInstitucion.valueOf(nombreTexto);
            } catch (IllegalArgumentException e) {
                System.out.print("\nNombre de la institución inválido, por favor intente de nuevo.");
            }
        }
        Responsable resp = new Responsable(nombre, documento, ciudad, celular, cargo, nombreInstitucion);

        // Capturas info proyecto

        System.out.print("\nIngrese el código del proyecto: ");
        String codigo = sc.nextLine();

        System.out.print("\nIngrese la ciudad donde se va a realizar el proyecto: ");
        String ciudadProyecto = sc.nextLine();


        double area = 0;
        while (area < 5 || area > 50) {
            try {
                System.out.print("\nIngrese el área en m² (entre 5 y 50):");
                area = sc.nextDouble();
            } catch (Exception e) {
                System.out.print("\nÁrea ingresada fue inválida");
                sc.next();
                area = 0;
            }
        }
        double eficiencia = 0;
        while (eficiencia < 0.10 || eficiencia > 0.25) {
            try {
                System.out.print("\nIngrese el valor de la eficiencia (entre 0.10 y 0.25): ");
                eficiencia = sc.nextDouble();

            } catch (IllegalArgumentException e) {
                System.out.print("\nEficiencia ingresada fue inválida");
            }
        }
        double radiacion = 0;
        while (radiacion < 3.5 || radiacion > 6.5) {
            try {
                System.out.print("\nIngrese el valor de la radiación solar promedio diaria en kWh/m²/día (entre 3.5 y 6.5): ");
                radiacion = sc.nextDouble();
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.print("\nRadiación ingresada fue inválida");
            }
        }

        EstadoProyecto estado = null;

        while (estado == null) {
            try {
                System.out.print("\n Ingrese estado del proyecto: \nPENDIENTE, EN_CURSO, FINALIZADA: ");
                String estadoTexto = sc.nextLine().toUpperCase();


                estado = EstadoProyecto.valueOf(estadoTexto);
            } catch (IllegalArgumentException e) {
                System.out.print("\n\tEl valor del estado ingresado no es válido");
            }
        }

        Proyecto pry = new Proyecto(codigo, ciudadProyecto, area, eficiencia, radiacion, estado, resp);
        //pry.setEstado(estado);
        pry.mostrarResumen();

        int opciones = 1;
        System.out.println("--------------------------------------------");

        //While para modificar datos; Se va a ejecutar siempre que se quiera modificar un dato.
        while (opciones != 0) {
            System.out.println("\nPara modificar datos, ingrese la opción deseada \n1. Estado de la instalación \n2. Área de la instalación  \n3. Eficiencia de la instalación \n0. Ninguna");
            opciones = sc.nextInt();
            sc.nextLine();
            //El if, dependiendo de la opcion, modificamos el dato
            if (opciones == 1) {
                EstadoProyecto nuevoEstado = null;
                while (nuevoEstado == null) {
                    try {
                        System.out.print("\n Ingrese nuevo estado de la instalacion: \nPENDIENTE, EN_CURSO, FINALIZADA: ");
                        String nuevoEstadoTexto = sc.nextLine().toUpperCase();
                        nuevoEstado = EstadoProyecto.valueOf(nuevoEstadoTexto);
                    } catch (IllegalArgumentException e) {
                        System.out.print("\n\tEl valor del estado ingresado no es válido");
                    }
                }
                pry.setEstado(nuevoEstado);

            } else if (opciones == 2) {
                double nuevaArea = 0;
                while (nuevaArea < 5 || nuevaArea > 50) {
                    try {
                        System.out.print("\nIngrese el nuevo área en m² (entre 5 y 50):");
                        nuevaArea = sc.nextDouble();
                        sc.nextLine();
                    } catch (Exception e) {
                        System.out.print("\nÁrea ingresada fue inválida");
                        sc.next();
                        nuevaArea = 0;
                    }
                }
                pry.setArea(nuevaArea);
            } else if (opciones == 3) {
                double nuevaEficiencia = 0;
                while (nuevaEficiencia < 0.10 || nuevaEficiencia > 0.25) {
                    try {
                        System.out.print("\nIngrese el nuevo valor de la eficiencia (entre 0.10 y 0.25): ");
                        nuevaEficiencia = sc.nextDouble();
                        sc.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.print("\nEficiencia ingresada fue inválida");
                    }
                }
                pry.setEficiencia(nuevaEficiencia);
            } else {
                System.out.println("No se ha modificado ningún dato.");
            }
        }
        //Finalmente, mostramos el resumen con los datos que se hayan actualizado
        pry.mostrarResumen();
        sc.close();
    }
}


