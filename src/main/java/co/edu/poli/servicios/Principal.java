package co.edu.poli.servicios;

import co.edu.poli.modelo.*;
import co.edu.poli.vista.Estacion_E_Normal;
import co.edu.poli.vista.Estacion_E_Rapida;
import co.edu.poli.vista.Estacion_E_Ultra;
import co.edu.poli.vista.ImplementacionOperacion;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Principal {

    public static void main(String[] argt) {

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
        while (!exit) {
            System.out.println();
            System.out.println(" Menu de operaciones CRUD");
            System.out.println(" 1. Crear una estacion");
            System.out.println(" 2. Leer una estacion en especifico");
            System.out.println(" 3. Leer todos las estacion");
            System.out.println(" 4. Actualizar un estacion");
            System.out.println(" 5. Eliminar un estacion");
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
            } while (!validar);

            //Opcion a realizar
            switch (opcion) {
                //Realizar registro de la estacion
                //Estacion  ->  Punto de carga [] -> Equipo [] <- Mantenimineto
                case 1:

                    int tipoEstacion = 0;
                    boolean entradaValida = false;
                    do {
                        System.out.println("Que tipo de estacion sera: \n" + "1) Estacion Carga Normal \n" + "2) Estacion Carga Rapida \n" +
                                "3) Estacion Carga Ultra Rapida \n");
                        try {
                            tipoEstacion = ask.nextInt();
                            entradaValida = true; // La entrada fue exitosa, rompe el bucle
                        } catch (InputMismatchException e) {
                            System.out.println("Debe ingresar un número entero.");
                            ask.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
                        }
                    } while (!entradaValida);

                    if (tipoEstacion == 1) {
                        //Creacion obtejo Estacion
                        String nombre = "";
                        do {
                            System.out.println(" Digite el nombre de la estacion");
                            try {
                                nombre = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (nombre.trim().isEmpty());

                        String id_estacion = "";
                        do {
                            System.out.println(" Digite el id de la estacion");
                            try {
                                id_estacion = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (id_estacion.trim().isEmpty());

                        String ubicacion = "";
                        do {
                            System.out.println(" Digite la ubicacion de la estacion");
                            try {
                                ubicacion = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (ubicacion.trim().isEmpty());

                        String estadoEstacion = "";
                        do {
                            System.out.println(" Digite el estado de la estacion");
                            try {
                                estadoEstacion = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (estadoEstacion.trim().isEmpty());


                        int capacidad = 0;
                        entradaValida = false;

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

                        int tiempoDeCargaPromedio = 0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite el tiempo de carga promedio en minutos");
                            try {
                                tiempoDeCargaPromedio = ask.nextInt();
                                entradaValida = true; // La entrada fue exitosa, rompe el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número entero.");
                                ask.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
                            }
                        } while (!entradaValida);

                        double costoPorHora = 0.0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite la potencia del equipo:");
                            try {
                                costoPorHora = ask.nextDouble(); // Intentar leer un double
                                entradaValida = true; // La entrada es válida, romper el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número decimal válido.");
                                ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                            }
                        } while (!entradaValida);

                        double nivelCargaMax = 0.0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite la potencia del equipo:");
                            try {
                                nivelCargaMax = ask.nextDouble(); // Intentar leer un double
                                entradaValida = true; // La entrada es válida, romper el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número decimal válido.");
                                ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                            }
                        } while (!entradaValida);

                        PuntoDeCarga[] asociadoEstacion = new PuntoDeCarga[capacidad];

                        System.out.println(" Datos Punto de Carga ");

                        String idPdC = "";
                        do {
                            System.out.println(" Digite el id del punto de carga");
                            try {
                                idPdC = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (idPdC.trim().isEmpty());


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
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (conector.trim().isEmpty());

                        String estadoEquipo = "";
                        do {
                            System.out.println(" Digite el estado del punto de carga");
                            try {
                                estadoEquipo = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (estadoEquipo.trim().isEmpty());

                        System.out.println(" Datos del Equipo: ");

                        String id_equipo = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                id_equipo = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (id_equipo.trim().isEmpty());

                        String tipo = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                tipo = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (tipo.trim().isEmpty());

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

                        Mantenimiento[] listaMantenimiento = new Mantenimiento[10];

                        Equipo equipoUno = new Equipo(id_equipo, potencia, tipo, listaMantenimiento);

                        PuntoDeCarga PdCUno = new PuntoDeCarga(idPdC, disponible, conector, estadoEquipo, equipoUno);
                        asociadoEstacion[0] = PdCUno;

                        Estacion_E_Normal estacionUno = new Estacion_E_Normal(nombre, id_estacion, ubicacion, estadoEstacion, capacidad, asociadoEstacion,
                                tiempoDeCargaPromedio, costoPorHora, nivelCargaMax);

                    } else if (tipoEstacion == 2) {
                        //Creacion obtejo Estacion
                        String nombre = "";
                        do {
                            System.out.println(" Digite el nombre de la estacion");
                            try {
                                nombre = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (nombre.trim().isEmpty());

                        String id_estacion = "";
                        do {
                            System.out.println(" Digite el id de la estacion");
                            try {
                                id_estacion = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (id_estacion.trim().isEmpty());

                        String ubicacion = "";
                        do {
                            System.out.println(" Digite la ubicacion de la estacion");
                            try {
                                ubicacion = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (ubicacion.trim().isEmpty());

                        String estadoEstacion = "";
                        do {
                            System.out.println(" Digite el estado de la estacion");
                            try {
                                estadoEstacion = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (estadoEstacion.trim().isEmpty());

                        int capacidad = 0;
                        entradaValida = false;

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

                        int tiempoPromedioRapido = 0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite la capacidad de la estación");
                            try {
                                tiempoPromedioRapido = ask.nextInt();
                                entradaValida = true; // La entrada fue exitosa, rompe el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número entero.");
                                ask.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
                            }
                        } while (!entradaValida);

                        double tarifaCargaRapida = 0.0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite la potencia del equipo:");
                            try {
                                tarifaCargaRapida = ask.nextDouble(); // Intentar leer un double
                                entradaValida = true; // La entrada es válida, romper el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número decimal válido.");
                                ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                            }
                        } while (!entradaValida);

                        PuntoDeCarga[] asociadoEstacion = new PuntoDeCarga[capacidad];

                        System.out.println(" Datos Punto de Carga ");

                        String idPdC = "";
                        do {
                            System.out.println(" Digite el id del punto de carga");
                            try {
                                idPdC = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (idPdC.trim().isEmpty());


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
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (conector.trim().isEmpty());

                        String estadoEquipo = "";
                        do {
                            System.out.println(" Digite el estado del punto de carga");
                            try {
                                estadoEquipo = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (estadoEquipo.trim().isEmpty());

                        System.out.println(" Datos del Equipo Rapido: ");

                        String id_equipo = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                id_equipo = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (id_equipo.trim().isEmpty());

                        String tipo = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                tipo = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (tipo.trim().isEmpty());

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

                        int tiempoRapido = 0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite la capacidad de la estación");
                            try {
                                tiempoRapido = ask.nextInt();
                                entradaValida = true; // La entrada fue exitosa, rompe el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número entero.");
                                ask.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
                            }
                        } while (!entradaValida);

                        String tipoConector = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                tipoConector = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (tipoConector.trim().isEmpty());

                        Mantenimiento[] listaMantenimiento = new Mantenimiento[10];

                        EquipoRapido equipoRapidoUno = new EquipoRapido(id_equipo, potencia, tipo, tiempoRapido, tipoConector, listaMantenimiento);

                        PuntoDeCarga PdCUno = new PuntoDeCarga(idPdC, disponible, conector, estadoEquipo, equipoRapidoUno);
                        asociadoEstacion[0] = PdCUno;

                        Estacion_E_Rapida estacionRapidaUno = new Estacion_E_Rapida(nombre, id_estacion, ubicacion, estadoEstacion, capacidad, asociadoEstacion,
                                tiempoPromedioRapido, tarifaCargaRapida);

                    } else if (tipoEstacion == 3) {
                        //Creacion obtejo Estacion
                        String nombre = "";
                        do {
                            System.out.println(" Digite el nombre de la estacion");
                            try {
                                nombre = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (nombre.trim().isEmpty());

                        String id_estacion = "";
                        do {
                            System.out.println(" Digite el id de la estacion");
                            try {
                                id_estacion = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (id_estacion.trim().isEmpty());

                        String ubicacion = "";
                        do {
                            System.out.println(" Digite la ubicacion de la estacion");
                            try {
                                ubicacion = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (ubicacion.trim().isEmpty());

                        String estadoEstacion = "";
                        do {
                            System.out.println(" Digite el estado de la estacion");
                            try {
                                estadoEstacion = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (estadoEstacion.trim().isEmpty());


                        int capacidad = 0;
                        entradaValida = false;

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

                        int tiempoDeCargaUltra = 0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite la capacidad de la estación");
                            try {
                                tiempoDeCargaUltra = ask.nextInt();
                                entradaValida = true; // La entrada fue exitosa, rompe el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número entero.");
                                ask.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
                            }
                        } while (!entradaValida);


                        String compatibilidadVehicular = "";
                        do {
                            System.out.println(" Digite el estado de la estacion");
                            try {
                                compatibilidadVehicular = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (estadoEstacion.trim().isEmpty());

                        double costoUltra = 0.0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite la potencia del equipo:");
                            try {
                                costoUltra = ask.nextDouble(); // Intentar leer un double
                                entradaValida = true; // La entrada es válida, romper el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número decimal válido.");
                                ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                            }
                        } while (!entradaValida);

                        PuntoDeCarga[] asociadoEstacion = new PuntoDeCarga[capacidad];

                        System.out.println(" Datos Punto de Carga ");

                        String idPdC = "";
                        do {
                            System.out.println(" Digite el id del punto de carga");
                            try {
                                idPdC = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (idPdC.trim().isEmpty());

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
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (conector.trim().isEmpty());

                        String estadoEquipo = "";
                        do {
                            System.out.println(" Digite el estado del punto de carga");
                            try {
                                estadoEquipo = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (estadoEquipo.trim().isEmpty());

                        System.out.println(" Datos del Equipo: ");

                        String id_equipo = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                id_equipo = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (id_equipo.trim().isEmpty());

                        String tipo = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                tipo = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (tipo.trim().isEmpty());

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

                        double voltajeMax = 0.0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite la potencia del equipo:");
                            try {
                                voltajeMax = ask.nextDouble(); // Intentar leer un double
                                entradaValida = true; // La entrada es válida, romper el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número decimal válido.");
                                ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                            }
                        } while (!entradaValida);

                        String sistemaEnfriamiento = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                sistemaEnfriamiento = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (sistemaEnfriamiento.trim().isEmpty());

                        double capacidadBateriaMax = 0.0;
                        entradaValida = false;

                        do {
                            System.out.println("Digite la potencia del equipo:");
                            try {
                                capacidadBateriaMax = ask.nextDouble(); // Intentar leer un double
                                entradaValida = true; // La entrada es válida, romper el bucle
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar un número decimal válido.");
                                ask.nextLine(); // Limpiar el buffer para evitar un bucle infinito
                            }
                        } while (!entradaValida);

                        String proteccionSobreCarga = "";
                        do {
                            System.out.println(" Digite el conector del punto de carga");
                            try {
                                proteccionSobreCarga = ask.nextLine();
                            } catch (NullPointerException e) {
                                System.out.println("Mensaje de error: " + e);
                            }
                        } while (proteccionSobreCarga.trim().isEmpty());

                        Mantenimiento[] listaMantenimiento = new Mantenimiento[10];

                        EquipoUltra equipoUltraUno = new EquipoUltra(id_equipo, potencia, tipo, voltajeMax, sistemaEnfriamiento,
                                capacidadBateriaMax, proteccionSobreCarga, listaMantenimiento);

                        PuntoDeCarga PdCUno = new PuntoDeCarga(idPdC, disponible, conector, estadoEquipo, equipoUltraUno);
                        asociadoEstacion[0] = PdCUno;

                        Estacion_E_Ultra estacionUltraUno = new Estacion_E_Ultra(nombre, id_estacion, ubicacion, estadoEstacion, capacidad, asociadoEstacion,
                                tiempoDeCargaUltra, compatibilidadVehicular, costoUltra);
                    }
                    break;

                case 2:
                    //Leer una Estacion
                    System.out.println("============Busqueda de una estacion en especifico =========\n");
                    System.out.println("Digite el Id de la estacion: ");
                    String id_estacion = ask.nextLine();
                    System.out.println(crud.read(id_estacion));
                    System.out.println("____________________________________");
                    break;

                case 3:
                    //Leer todas las estaciones
                    System.out.println("\n===========Todas las estaciones==============\n" + Arrays.toString(crud.readAll()) + "\n");
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
                    op.serializar(crud.readAll(), path, file);
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
                    break;
            }
        }

        ask.close();
        option.close();
    }
}


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------


