package co.edu.poli.vista;

import co.edu.poli.modelo.Equipo;
import co.edu.poli.modelo.Estacion;
import co.edu.poli.modelo.Mantenimiento;
import co.edu.poli.modelo.PuntoDeCarga;
import co.edu.poli.servicios.EquipoCargaRapida;
import co.edu.poli.servicios.EquipoCargaUltraRapida;
import co.edu.poli.servicios.ImplementacionOperacion;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Principal {

    public static void main(String [ ] argt) {

        String path = " ";
        String file = "TextNoBinary.txt";
        ImplementacionOperacion op = new ImplementacionOperacion();
        ImplementacionOperacion crud = new ImplementacionOperacion();

        //Menu del sistema
        Scanner option = new Scanner(System.in);
        Scanner ask = new Scanner(System.in);
        boolean exit = false;

        //Titulo del Programa
        System.out.println("===========PROGRAMA PARA REGISTRAR Y CREAR ESTACIONES DE CARGA=====================");
        while(!exit) {
            System.out.println();
            System.out.println(" Menu de operaciones CRUD");
            System.out.println(" 1. Crear un registro");
            System.out.println(" 2. Leer un registro en especifico");
            System.out.println(" 3. Leer todos los registros");
            System.out.println(" 4. Actualizar un registro");
            System.out.println(" 5. Eliminar un registro");
            System.out.println(" 6. Guardar en archivo");
            System.out.println(" 7. Leer el archivo");
            System.out.println(" 8. Salir");

            int opcion = 0;
            boolean validar = false;

            do {
                try {

                    opcion = option.nextInt();
                    option.nextLine();
                    validar = true;
                    break;

                } catch (InputMismatchException e) {

                    System.out.println("Error: entrada no válida. Por favor, ingresa un número entero.");
                    ask.next(); // Limpiamos el buffer del scanner
                }
            } while(!validar);

            //Opcion a realizar
            switch (opcion) {
                //Realizar registro de la estacion
                //Estacion  ->  Punto de carga [] -> Equipo [] <- Mantenimineto
                case 1:
                    //Datos ya definidos
                    // Definir ya los arrays de punto de carga y equipo?

                    //Creacion obtejo Estacion
                    String nombre = "";
                    do {
                        System.out.println(" Digite el nombre de la estacion");
                        try {
                            nombre = ask.nextLine();
                        } catch(NullPointerException e){
                            System.out.println("Mensaje de error: " + e);
                        }
                    } while(nombre.trim().isEmpty());

                    String id_estacion = "";
                    do {
                        System.out.println(" Digite el id de la estacion");
                        try {
                            id_estacion = ask.nextLine();
                        } catch(NullPointerException e){
                            System.out.println("Mensaje de error: " + e);
                        }
                    } while(id_estacion.trim().isEmpty());

                    String ubicacion = "";
                    do {
                        System.out.println(" Digite la ubicacion de la estacion");
                        try {
                            ubicacion = ask.nextLine();
                        } catch(NullPointerException e){
                            System.out.println("Mensaje de error: " + e);
                        }
                    } while(ubicacion.trim().isEmpty());

                    String estadoEstacion = "";
                    do {
                        System.out.println(" Digite el estado de la estacion");
                        try {
                            estadoEstacion = ask.nextLine();
                        } catch(NullPointerException e){
                            System.out.println("Mensaje de error: " + e);
                        }
                    } while(estadoEstacion.trim().isEmpty());


                    int capacidad = 0;
                    boolean entradaValida = false;

                    do {
                        System.out.println("Digite la capacidad de la estación");
                        try {
                            capacidad = ask.nextInt();
                            entradaValida = true; // La entrada fue exitosa, rompe el bucle
                        } catch (InputMismatchException e) {
                            System.out.println("Debe ingresar un número entero.");
                            ask.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
                        }
                    } while (!entradaValida);

                    PuntoDeCarga[] asociadoEstacion = new PuntoDeCarga[capacidad];
                    int repe = 0;

                    do {

                        String idPdC = "";
                        do {
                            System.out.println(" Digite el id del punto de carga");
                            try {
                                idPdC = ask.nextLine();
                            } catch(NullPointerException e){
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while(idPdC.trim().isEmpty());


                        boolean disponible = false;
                        entradaValida = false;

                        do {
                            System.out.println("¿Está disponible el punto de carga? (true/false):");
                            try {
                                String entrada = ask.nextLine().toLowerCase(); // Leer entrada y convertir a minúsculas
                                if (entrada.equals("true") || entrada.equals("false")) {
                                    disponible = Boolean.parseBoolean(entrada);
                                    entradaValida = true; // La entrada es válida, rompe el bucle
                                } else {
                                    System.out.println("Debe ingresar 'true' o 'false'.");
                                }
                            } catch (Exception e) {
                                System.out.println("Error inesperado: " + e.getMessage());
                            }
                        } while (!entradaValida);

                        String conector = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                conector = ask.nextLine();
                            } catch(NullPointerException e){
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while(conector.trim().isEmpty());

                        String estadoEquipo = "";
                        do {
                            System.out.println(" Digite el estado del punto de carga");
                            try {
                                estadoEquipo = ask.nextLine();
                            } catch(NullPointerException e){
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while(estadoEquipo.trim().isEmpty());


                        System.out.println(
                                "¿Que tipo de quipo tendra este punto de carga?\n" +
                                "1) Equipo Carga Rapida\n" +
                                "2) Equipo Carga Ultra Rapida"
                        );

                        int opcionesEquipo = 0;
                        validar = false;

                        do {
                            try {

                                opcionesEquipo = option.nextInt();
                                option.nextLine();
                                validar = true;
                                break;

                            } catch (InputMismatchException e) {

                                System.out.println("Error: entrada no válida. Por favor, ingresa un número entero.");
                                ask.next(); // Limpiamos el buffer del scanner
                            }
                        } while(!validar);

                        switch (opcionesEquipo){
                            case 1:
                                String id_equipo = "";
                                do {
                                    System.out.println(" Digite el id del equipo");
                                    try {
                                        id_equipo = ask.nextLine();
                                    } catch(NullPointerException e){
                                        System.out.println("Mensaje de error: " + e);
                                    }
                                } while(id_equipo.trim().isEmpty());


                                double potencia = 0.0;
                                entradaValida = false;

                                do {
                                    System.out.println("Digite la potencia del equipo:");
                                    try {
                                        potencia = ask.nextDouble(); // Intentar leer un double
                                        entradaValida = true; // La entrada es válida, romper el bucle
                                    } catch (InputMismatchException e) {
                                        System.out.println("Debe ingresar un número decimal válido.");
                                        ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                                    }
                                } while (!entradaValida);

                                String tipoEquipo = "";
                                do {
                                    System.out.println(" Digite el tipo del equipo");
                                    try {
                                        tipoEquipo = ask.nextLine();
                                    } catch(NullPointerException e){
                                        System.out.println("Mensaje de error: " + e);
                                    }
                                } while(tipoEquipo.trim().isEmpty());

                                Mantenimiento[] asociadoEquipo = new Mantenimiento[10];

                                int tiempo_carga = 0;
                                entradaValida = false;

                                do {
                                    System.out.println(" Digite el tiempo de carga Minimos");
                                    try {
                                        tiempo_carga = ask.nextInt(); // Intentar leer un entero
                                        entradaValida = true; // La entrada es válida, romper el bucle
                                    } catch (InputMismatchException e) {
                                        System.out.println("Debe ingresar un número entero válido.");
                                        ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                                    }
                                } while (!entradaValida);

                                String tipoConector = "";
                                do {
                                    System.out.println(" Digite el tipo de conector");
                                    try {
                                        tipoConector = ask.nextLine();
                                    } catch(NullPointerException e){
                                        System.out.println("Mensaje de error: " + e);
                                    }
                                } while(tipoConector.trim().isEmpty());

                                String nivel_de_carga = "";
                                do {
                                    System.out.println(" Digite el nivel de carga");
                                    try {
                                        nivel_de_carga = ask.nextLine();
                                    } catch(NullPointerException e){
                                        System.out.println("Mensaje de error: " + e);
                                    }
                                } while(nivel_de_carga.trim().isEmpty());

                                EquipoCargaRapida asociado = new EquipoCargaRapida(id_equipo, potencia, tipoEquipo,asociadoEquipo,
                                        tiempo_carga, tipoConector,nivel_de_carga);

                                PuntoDeCarga puntoDeCarga = new PuntoDeCarga(idPdC, disponible, asociado, conector, estadoEquipo);
                                asociadoEstacion[repe] = puntoDeCarga;

                                repe++;

                                break;

                            case 2:
                                String id_equipo_ultra = "";
                                do {
                                    System.out.println(" Digite el id del equipo");
                                    try {
                                        id_equipo_ultra = ask.nextLine();
                                    } catch(NullPointerException e){
                                        System.out.println("Mensaje de error: " + e);
                                    }
                                } while(id_equipo_ultra.trim().isEmpty());

                                double potencia_ultra = 0.0;
                                entradaValida = false;

                                do {
                                    System.out.println(" Digite la potencia del equipo");
                                    try {
                                        potencia_ultra = ask.nextDouble(); // Intentar leer un double
                                        entradaValida = true; // La entrada es válida, romper el bucle
                                    } catch (InputMismatchException e) {
                                        System.out.println("Debe ingresar un número decimal válido.");
                                        ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                                    }
                                } while (!entradaValida);

                                String tipoEquipo_ultra = "";
                                do {
                                    System.out.println(" Digite el tipo del equipo");
                                    try {
                                        tipoEquipo_ultra = ask.nextLine();
                                    } catch(NullPointerException e){
                                        System.out.println("Mensaje de error: " + e);
                                    }
                                } while(tipoEquipo_ultra.trim().isEmpty());

                                Mantenimiento[] asociadoEquipo_ultra = new Mantenimiento[10];


                                int tiempo_carga_ultra = 0;
                                entradaValida = false;

                                do {
                                    System.out.println(" Digite el tiempo de carga Minimos");
                                    try {
                                        tiempo_carga_ultra = ask.nextInt(); // Intentar leer un entero
                                        entradaValida = true; // La entrada es válida, romper el bucle
                                    } catch (InputMismatchException e) {
                                        System.out.println("Debe ingresar un número entero válido.");
                                        ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                                    }
                                } while (!entradaValida);

                                String tipoConector_ultra = "";
                                do {
                                    System.out.println(" Digite el tipo de conector");
                                    try {
                                        tipoConector_ultra = ask.nextLine();
                                    } catch(NullPointerException e){
                                        System.out.println("Mensaje de error: " + e);
                                    }
                                } while(tipoConector_ultra.trim().isEmpty());

                                String nivel_de_carga_ultra = "";
                                do {
                                    System.out.println(" Digite el nivel de carga");
                                    try {
                                        nivel_de_carga_ultra = ask.nextLine();
                                    } catch(NullPointerException e){
                                        System.out.println("Mensaje de error: " + e);
                                    }
                                } while(tipoConector_ultra.trim().isEmpty());

                                int sistema_enfriamiento_ultra = 0;
                                entradaValida = false;

                                do {
                                    System.out.println("Digite el sistema de enfriamiento:");
                                    try {
                                        sistema_enfriamiento_ultra = ask.nextInt(); // Intentar leer un entero
                                        entradaValida = true; // La entrada es válida, romper el bucle
                                    } catch (InputMismatchException e) {
                                        System.out.println("Debe ingresar un número entero válido.");
                                        ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                                    }
                                } while (!entradaValida);

                                double capacidad_max = 0.0;
                                entradaValida = false;

                                do {
                                    System.out.println(" Digite la capacidad de la bateria maxima");
                                    try {
                                        capacidad_max = ask.nextDouble(); // Intentar leer un double
                                        entradaValida = true; // La entrada es válida, romper el bucle
                                    } catch (InputMismatchException e) {
                                        System.out.println("Debe ingresar un número decimal válido.");
                                        ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                                    }
                                } while (!entradaValida);

                                double voltaje_max = 0.0;
                                entradaValida = false;

                                do {
                                    System.out.println(" Digite el voltaje maximo");
                                    try {
                                        voltaje_max = ask.nextDouble(); // Intentar leer un double
                                        entradaValida = true; // La entrada es válida, romper el bucle
                                    } catch (InputMismatchException e) {
                                        System.out.println("Debe ingresar un número decimal válido.");
                                        ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                                    }
                                } while (!entradaValida);

                                boolean proteccion_sobreCarga = false;
                                entradaValida = false;

                                do {
                                    System.out.println("¿Tiene proteccion por sobrecarga? (true/false):");
                                    try {
                                        String entrada = ask.nextLine().toLowerCase(); // Leer entrada y convertir a minúsculas
                                        if (entrada.equals("true") || entrada.equals("false")) {
                                            proteccion_sobreCarga = Boolean.parseBoolean(entrada);
                                            entradaValida = true; // La entrada es válida, rompe el bucle
                                        } else {
                                            System.out.println("Debe ingresar 'true' o 'false'.");
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Error inesperado: " + e.getMessage());
                                    }
                                } while (!entradaValida);

                                EquipoCargaUltraRapida asociado_ultra = new EquipoCargaUltraRapida(id_equipo_ultra, potencia_ultra, tipoEquipo_ultra,
                                        asociadoEquipo_ultra, tiempo_carga_ultra, tipoConector_ultra, nivel_de_carga_ultra, sistema_enfriamiento_ultra,
                                        capacidad_max, voltaje_max, proteccion_sobreCarga, tiempo_carga_ultra);

                                PuntoDeCarga puntoDeCarga_ultra = new PuntoDeCarga(idPdC, disponible, asociado_ultra, conector, estadoEquipo);
                                asociadoEstacion[repe] = puntoDeCarga_ultra;

                                repe++;

                                break;

                        }

                    } while(repe == capacidad - 1);

                    Estacion estacion0001 = new Estacion(nombre, id_estacion, ubicacion, estadoEstacion, capacidad, asociadoEstacion);
                    System.out.println(crud.create(estacion0001));
                    break;

                case 2:
                    //Leer una Estacion
                    System.out.println("============Busqueda de una estacion en especifico =========\n");
                    System.out.println("Digite el Id de la estacion: ");
                    id_estacion = ask.nextLine();
                    System.out.println(crud.read(id_estacion));
                    System.out.println("____________________________________");
                    break;

                case 3:
                    //Leer todas las estaciones
                    System.out.println("\n===========Todas las estaciones==============\n" + Arrays.toString(crud.readall()) + "\n");
                    System.out.println("________________________________________________");
                    break;

                case 4:

                    break;

                case 5:
                    //Eliminar Estacion
                    System.out.println("============Eliminar el resgidtro de la estacion=======================");
                    System.out.println("Digite el id de la estacion a eliminar: ");
                    id_estacion = ask.nextLine();

                    //Buscar la estacion


                case 6:
                    //Guardar archivo

                    System.out.println("=======================Guardar los registros en un archivo ==============");
                    op.serializar(crud.readall(), path, file);
                    System.out.println(" Datos guardados con exito en el archivo");
                    System.out.println("________________________________________");
                    break;

                case 7:
                    //Leer archivo y mostrar su contenido
                    System.out.println("======== Cargar estaciones desde el archivo =========");
                    //crud.setestacio(op.deserializar(path, file));
                    System.out.println("1. Lectura de archivo: " + Arrays.toString(op.deserializar(path, file)));
                    break;

                case 8:
                    //salir
                    System.out.println(" Fin del programa ");
                    exit = true;
                    break;

                default:
                    System.out.println("Opcion no válida");

            }
        }

        ask.close();
        option.close();
    }

}