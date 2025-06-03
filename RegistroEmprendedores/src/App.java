import base.Emprendedor;
import base.EstadoProyecto;
import base.NivelInnovacionProyecto;
import base.Proyecto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del base.Emprendedor: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el documento del base.Emprendedor: ");
        String documento = sc.nextLine();
        System.out.print("Ingrese el sector al que pertenece el base.Emprendedor: ");
        String sector = sc.nextLine();
        System.out.print("Ingrese la ciudad del base.Emprendedor: ");
        String ciudad = sc.nextLine();

        //Creación de objeto para llamar el constructor de la clase emprendedor
        Emprendedor emp = new Emprendedor(nombre, documento, sector, ciudad) ;

        //Captura de proyecto
        System.out.print("\nIngrese el nombre del base.Proyecto: ");
        String nombreProyecto = sc.nextLine();
        System.out.print("Ingrese la descripción del base.Proyecto: ");
        String descripcion = sc.nextLine();

            //Captura de estado
        EstadoProyecto estado = null;
        while (estado== null) {
            try {
                System.out.println("Ingrese el estado del proyecto (En_disenio, En_marcha, Crecimiento)");
                String estadoTexto = sc.nextLine().toUpperCase();
                estado = EstadoProyecto.valueOf(estadoTexto);
            } catch (IllegalArgumentException e) {
                System.out.println("\tEl valor del estado ingresado no es válido");
            }
        }

            //Captura de nivel innovacion
        NivelInnovacionProyecto nivelInnovacion = null;
        while (nivelInnovacion== null) {
            try {
                System.out.println("Ingrese el nivel de innovacion del proyecto (Bajo, Medio, Alto)");
                String nivelTexto = sc.nextLine().toUpperCase();
                nivelInnovacion = NivelInnovacionProyecto.valueOf(nivelTexto);
            } catch (IllegalArgumentException e) {
                System.out.println("\tEl valor del nivel de innovacion ingresado no es válido");
            }
        }
        // Este es el metodo como capturamos estado y nivel antes. Esto lo comento porque no se estará usando
//        System.out.print("Ingrese el nivel de innovación del base.Proyecto (Bajo, Medio, Alto): ");
//        String nivel = sc.nextLine();
//        System.out.print("Ingrese el estado del base.Proyecto: ");
//        String estado = sc.nextLine();

        //Creación de objeto para llamar el constructor de la clase base.Proyecto
        //El orden debe coincidir con el del metodo
        Proyecto pry = new Proyecto(nombreProyecto, descripcion, nivelInnovacion, estado, emp) ;
        pry.setEstado(estado);
        pry.setNivelInnovacion(nivelInnovacion);
        //Mostrar resumen inicial
        System.out.println("\n ----------------------------------------------------");
        // Aqui llamo al objeto pry y el metodo mostrarResumen
        pry.mostrarResumen();

        System.out.println("\n ----------------------------------------------------");

//        //Modificacion con setter
//        System.out.println("\nIngrese nuevo estado del base.Proyecto: ");
//        String nuevoEstado = sc.nextLine();
//        pry.setEstado(nuevoEstado);
//
//        System.out.println("Ingrese nuevo nivel de innovacion: ");
//        String nuevoNivelInnovacion = sc.nextLine();
//        // py es el que defini arriba
//        pry.setNivelInnovacion(nuevoNivelInnovacion);

        //Modificiacion con el nuevo modo de pedir los datos
        EstadoProyecto nuevoEstado = null;
        while (nuevoEstado == null) {
            try {
                System.out.println("Ingrese el nuevo estado del proyecto (En_disenio, En_marcha, Crecimiento)");
                String estadoTexto = sc.nextLine().toUpperCase();
                nuevoEstado = EstadoProyecto.valueOf(estadoTexto);
            } catch (IllegalArgumentException e) {
                System.out.println("\tEl valor del estado ingresado no es válido");
            }
        }
        pry.setEstado(nuevoEstado);

        //Captura de nivel innovacion
        NivelInnovacionProyecto nuevoNivelInnovacion = null;
        while (nuevoNivelInnovacion== null) {
            try {
                System.out.println("Ingrese nuevo el nivel de innovacion del proyecto (Bajo, Medio, Alto)");
                String nivelTexto = sc.nextLine().toUpperCase();
                nuevoNivelInnovacion = NivelInnovacionProyecto.valueOf(nivelTexto);
            } catch (IllegalArgumentException e) {
                System.out.println("\tEl valor del nivel de innovacion ingresado no es válido");
            }
        }
        pry.setNivelInnovacion(nuevoNivelInnovacion);
        // Mostrar resultado actualizado
        System.out.println("\n ----------------------------------------------------");
        pry.mostrarResumen();
        sc.close();
    }
}
