package com.mycompany.zooaurora;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ZooAurora {
    private static Animal[] animales = new Animal[10];
    private static int indice = 0;

    public static void main(String[] args) {
        String usuarioCorrecto = "admin";
        String claveCorrecta = "1234";
        String usuarioIngresado, claveIngresada;
        int menuzoo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        usuarioIngresado = scanner.nextLine();
       
        if (!usuarioIngresado.equals(usuarioCorrecto)) {
            System.out.println("Acceso denegado.");
            return;
        }
       
        do {
            System.out.print("Ingrese su clave: ");
            claveIngresada = scanner.nextLine();
            if (!claveIngresada.equals(claveCorrecta)) {
                System.out.println("Clave incorrecta. Inténtelo de nuevo.");
            }
        } while (!claveIngresada.equals(claveCorrecta));
       
        do {
            System.out.println("________________________________________________");
            System.out.println("|                                               |");
            System.out.println("|        Bienvenido al menú del Zoológico.      |");
            System.out.println("|_______________________________________________|");
            System.out.println("|                                               |");
            System.out.println("|    1.   ZOO                                   |");
            System.out.println("|                                               |");
            System.out.println("|    2.   Fase II Arreglos                      |");
            System.out.println("|                                               |");
            System.out.println("|    3.   Salir                                 |");
            System.out.println("|_______________________________________________|");
            menuzoo = scanner.nextInt();

            switch (menuzoo) {
                case 1:
                    System.out.println("       Bienvenido al detalle de ZOO"
                            + "\n Aqui encontraremos detalles importantes para verificar");
                    
                    break;

                case 2:
                    System.out.println("       Bienvenido a la Fase II Arreglos");
                    menuArreglos(scanner);
                    break;
                case 3:
                    System.out.println("ESTAMOS POR SALIR, GRACIAS POR LA VISITA.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (menuzoo != 3);

        scanner.close();
    }

    private static void menuArreglos(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("________________________________________________");
            System.out.println("|               Sub Menú Fase II:               |");
            System.out.println("|_______________________________________________|");
            System.out.println("|    a. Agregar Mamífero                        |");
            System.out.println("|    b. Agregar Ave                             |");
            System.out.println("|    c. Agregar Reptil                          |");
            System.out.println("|    d. Ordenar Arreglo                         |");
            System.out.println("|    e. Mostrar Arreglo                         |");
            System.out.println("|    f. Salir                                   |");
            System.out.println("|    g. Guardar en CSV                          |");
            System.out.println("|    h. Cargar desde CSV                        |");
            System.out.println("|_______________________________________________|");

            char opcionSubmenu = scanner.next().charAt(0);
            scanner.nextLine();

            switch (opcionSubmenu) {
                case 'a':
                    agregarAnimal(scanner, "Mamífero");
                    break;
                case 'b':
                    agregarAnimal(scanner, "Ave");
                    break;
                case 'c':
                    agregarAnimal(scanner, "Reptil");
                    break;
                case 'd':
                    ordenarArreglo(scanner);
                    break;
                case 'e':
                    mostrarArreglo();
                    break;
                case 'f':
                    continuar = false;
                    break;
                case 'g':
                    guardarEnCSV();
                    break;
                case 'h':
                    cargarDesdeCSV();
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private static void agregarAnimal(Scanner scanner, String tipo) {
        if (indice >= 10) {
            System.out.println("El array ya está lleno.");
            return;
        }

        String idAnimal;
        boolean idUnico = false;

        while (!idUnico) {
            System.out.print("Ingrese el ID del Animal: ");
            idAnimal = scanner.nextLine();

            boolean idExiste = false;
            for (int i = 0; i < indice; i++) {
                if (animales[i].getIdAnimal().equalsIgnoreCase(idAnimal)) {
                    idExiste = true;
                    break;
                }
            }

            if (idExiste) {
                System.out.println("El identificador es único para cada animal. Por favor, ingrese otro ID.");
            } else {
                idUnico = true;
                System.out.print("Ingrese el nombre del animal: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el consumo diario en libras: ");
                double consumoDiario = scanner.nextDouble();
                scanner.nextLine();

                switch (tipo) {
                    case "Mamífero":
                        animales[indice] = new Mamifero(idAnimal, nombre, consumoDiario);
                        break;
                    case "Ave":
                        animales[indice] = new Ave(idAnimal, nombre, consumoDiario);
                        break;
                    case "Reptil":
                        animales[indice] = new Reptil(idAnimal, nombre, consumoDiario);
                        break;
                }
                indice++;
                System.out.println(tipo + " agregado exitosamente.");
                System.out.print("¿Desea agregar otro animal? (si/no): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("no")) {
                    return;
                }
            }
        }
    }

    private static void ordenarArreglo(Scanner scanner) {
        if (indice == 0) {
            System.out.println("No hay animales para ordenar.");
            return;
        }

        System.out.println("Ordenar por ID Animal:");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        int opcionOrden = scanner.nextInt();
        scanner.nextLine();

        Comparator<Animal> comparador;
        if (opcionOrden == 1) {
            comparador = Comparator.comparing(Animal::getIdAnimal, String.CASE_INSENSITIVE_ORDER);
        } else if (opcionOrden == 2) {
            comparador = Comparator.comparing(Animal::getIdAnimal, String.CASE_INSENSITIVE_ORDER.reversed());
        } else {
            System.out.println("Opción inválida.");
            return;
        }

        Arrays.sort(animales, 0, indice, comparador);
        System.out.println("Arreglo ordenado.");
    }

     private static void mostrarArreglo() {
        if (indice == 0) {
            System.out.println("No hay animales registrados.");
        } else {
            System.out.println("Animales registrados en el arreglo:");
            for (int i = 0; i < indice; i++) {
                Animal a = animales[i];
                String tipo = a instanceof Mamifero ? "Mam\u00edfero" :
                              a instanceof Ave ? "Ave" :
                              a instanceof Reptil ? "Reptil" : "Desconocido";
                System.out.printf("ID: %s | Nombre: %s | Consumo diario: %.2f lbs | Tipo: %s%n",
                                  a.getIdAnimal(), a.getNombre(), a.getConsumoDiario(), tipo);
            }
        }
    }

    private static void guardarEnCSV() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("animales.csv"))) {
            writer.println("ID,Nombre,Consumo Diario,Tipo");

            for (int i = 0; i < indice; i++) {
                Animal a = animales[i];
                if (a != null) {
                    writer.println(a.getIdAnimal() + "," + a.getNombre() + "," +
                                   a.getConsumoDiario() + "," + a.getClass().getSimpleName());
                }
            }

            System.out.println("Animales guardados exitosamente en animales.csv.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    private static void cargarDesdeCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader("animales.csv"))) {
            String linea;
            reader.readLine(); // Saltar encabezado

            while ((linea = reader.readLine()) != null && indice < animales.length) {
                String[] datos = linea.split(",");

                if (datos.length == 4) {
                    String id = datos[0];
                    String nombre = datos[1];
                    double consumo = Double.parseDouble(datos[2]);
                    String tipo = datos[3];

                    // Verificar unicidad del ID
                    boolean idExiste = false;
                    for (int i = 0; i < indice; i++) {
                        if (animales[i].getIdAnimal().equalsIgnoreCase(id)) {
                            idExiste = true;
                            break;
                        }
                    }

                    if (!idExiste) {
                        switch (tipo) {
                            case "Mamifero":
                                animales[indice] = new Mamifero(id, nombre, consumo);
                                break;
                            case "Ave":
                                animales[indice] = new Ave(id, nombre, consumo);
                                break;
                            case "Reptil":
                                animales[indice] = new Reptil(id, nombre, consumo);
                                break;
                            default:
                                System.out.println("Tipo desconocido: " + tipo);
                                continue;
                        }
                        indice++;
                    } else {
                        System.out.println("ID duplicado encontrado: " + id + " (omitido)");
                    }
                }
            }

            System.out.println("Animales cargados desde el archivo.");
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
