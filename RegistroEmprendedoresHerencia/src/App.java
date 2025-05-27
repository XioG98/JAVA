import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qué tipo de persona desea regisitrar? (1: Emprendedor, 2:Mentor)");
        int tipo = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el documento: ");
        String documento = sc.nextLine();
        System.out.print("Ingrese la ciudad: ");
        String ciudad = sc.nextLine();

        if (tipo == 1) {
            System.out.println("Ingrese el sector al que pertenece");
            String sector = sc.nextLine();
            Emprendedor emp = new Emprendedor(nombre, documento, ciudad, sector);
            //Captura de proyecto
            System.out.print("\nIngrese el nombre del Proyecto: ");
            String nombreProyecto = sc.nextLine();
            System.out.print("Ingrese la descripción del Proyecto: ");
            String descripcion = sc.nextLine();

            //Captura de nivel innovacion
            NivelInnovacionProyecto nivelInnovacion = null;
            while (nivelInnovacion == null) {
                try {
                    System.out.println("Ingrese el nivel de innovacion del proyecto (Bajo, Medio, Alto)");
                    String nivelTexto = sc.nextLine().toUpperCase();
                    nivelInnovacion = NivelInnovacionProyecto.valueOf(nivelTexto);
                } catch (IllegalArgumentException e) {
                    System.out.println("\tEl valor del nivel de innovacion ingresado no es válido");
                }
            }
            //Captura de estado
            EstadoProyecto estado = null;
            while (estado == null) {
                try {
                    System.out.println("Ingrese el estado del proyecto (En_disenio, En_marcha, Crecimiento)");
                    String estadoTexto = sc.nextLine().toUpperCase();
                    estado = EstadoProyecto.valueOf(estadoTexto);
                } catch (IllegalArgumentException e) {
                    System.out.println("\tEl valor del estado ingresado no es válido");
                }
            }
            //Creación de objeto para llamar el constructor de la clase Proyecto
            //El orden debe coincidir con el del metodo || Instanciar el objeto proyecto
            Proyecto pry = new Proyecto(nombreProyecto, descripcion, nivelInnovacion, estado, emp);
            pry.setEstado(estado);
            pry.setNivelInnovacion(nivelInnovacion);

            //Mostrar resumen inicial
            System.out.println("\n ----------------------------------------------------");
            // Aqui llamo al objeto pry y el metodo mostrarResumen
            pry.mostrarResumen();

        } else if (tipo == 2) {
            System.out.println("Ingrese el area de experiencia al que pertenece: ");
            String areaExperticia = sc.nextLine();
            Mentor mentor = new Mentor(nombre, documento, ciudad, areaExperticia);
            System.out.println("-----------------------------------------------------");
            System.out.println("Mentor Registrado");
            mentor.mostrarDatosBasicos();
        } else {
            System.out.println("Tipo de persona no es válido");
        }
        sc.close();
    }

//        //Modificacion con setter
//        System.out.println("\nIngrese nuevo estado del Proyecto: ");
//        String nuevoEstado = sc.nextLine();
//        pry.setEstado(nuevoEstado);
//
//        System.out.println("Ingrese nuevo nivel de innovacion: ");
//        String nuevoNivelInnovacion = sc.nextLine();
//        // py es el que defini arriba
//        pry.setNivelInnovacion(nuevoNivelInnovacion);

//        //Modificiacion con el nuevo modo de pedir los datos
//        EstadoProyecto nuevoEstado = null;
//        while (nuevoEstado == null) {
//            try {
//                System.out.println("Ingrese el nuevo estado del proyecto (En_disenio, En_marcha, Crecimiento)");
//                String estadoTexto = sc.nextLine().toUpperCase();
//                nuevoEstado = EstadoProyecto.valueOf(estadoTexto);
//            } catch (IllegalArgumentException e) {
//                System.out.println("\tEl valor del estado ingresado no es válido");
//            }
//        }
//        pry.setEstado(nuevoEstado);
//
//        //Captura de nivel innovacion
//        NivelInnovacionProyecto nuevoNivelInnovacion = null;
//        while (nuevoNivelInnovacion== null) {
//            try {
//                System.out.println("Ingrese nuevo el nivel de innovacion del proyecto (Bajo, Medio, Alto)");
//                String nivelTexto = sc.nextLine().toUpperCase();
//                nuevoNivelInnovacion = NivelInnovacionProyecto.valueOf(nivelTexto);
//            } catch (IllegalArgumentException e) {
//                System.out.println("\tEl valor del nivel de innovacion ingresado no es válido");
//            }
//        }
//        pry.setNivelInnovacion(nuevoNivelInnovacion);
//        // Mostrar resultado actualizado
//        System.out.println("\n ----------------------------------------------------");
//        pry.mostrarResumen();
//
//    }
}
