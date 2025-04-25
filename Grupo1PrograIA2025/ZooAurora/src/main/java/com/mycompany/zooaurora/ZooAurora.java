package com.mycompany.zooaurora;
import java.io.*;
import java.util.*;


// Clase principal
public class ZooAurora {
    private static List<Animal> animales = new ArrayList<>();
    private static final String ARCHIVO_CSV = "zoologico.csv";
   
   

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
                    System.out.println("|    2.   Fase I:                               |");
                    System.out.println("|                                               |");
                    System.out.println("|    3.   Fase II Arreglos:                     |");
                    System.out.println("|                                               |");
                    System.out.println("|    4.   Fase III:                             |");
                    System.out.println("|                                               |");
                    System.out.println("|    5.   Salir:                                |");
                    System.out.println("|                                               |");
                    System.out.println("|_______________________________________________|");
            menuzoo = scanner.nextInt();
           
            switch (menuzoo) {
                case 1:
                    System.out.println("       Bienvenido al detalle de ZOO"
                            + "\n Aqui encontraremos detalles importantes para verificar");
                    
                    break;
                   
                case 2:
                    System.out.println("       Bienvenido a la Fase I");
                    menuZoo(scanner);
                    break;
                   
                 case 3:
                    System.out.println("       Bienvenido a la FaseII Arreglos");
                   
                    agregarAnimal(scanner);
                     break; 
                    
                case 4:
                    System.out.println("       Bienvenido a la Fase III");
                                      
                    break;
                    
                case 5:
                    System.out.println("ESTAMOS POR SALIR, GRACIAS POR LA VISITA.");
                    break;
                default:
                    System.out.println("opcion invalida, ingrese una opcino valida");
            }
        } while (menuzoo != 5);
       
        scanner.close();
    }

    private static void menuZoo(Scanner scanner) {
        int opcion;
        do {
            System.out.println("________________________________________________");
            System.out.println("|               Sub Menú Zoo Fase 1:            |");
            System.out.println("|_______________________________________________|");
            System.out.println("|    1. Agregar nuevo animal                    |");
            System.out.println("|                                               |");
            System.out.println("|    2. Ver todos los animales                  |");
            System.out.println("|                                               |");
            System.out.println("|    3. Guardar a CSV                           |");
            System.out.println("|                                               |");
            System.out.println("|    4. Calculo de alimentos                    |");
            System.out.println("|                                               |");
            System.out.println("|    5. Salir:                                  |");
            System.out.println("|_______________________________________________|");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarAnimal(scanner);
                    break;
                case 2:
                   listarAnimales();
                    
                    break;
                case 3:
                    exportarCSV();
                    break;
                case 4:
                    menuAlimentos(scanner);
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

     
   private static void menuAlimentos(Scanner scanner) {
    boolean continuar = true;
    while (continuar) {
        scanner.nextLine(); // Consumir salto de línea previo
        
            System.out.println("________________________________________________");
            System.out.println("|          Sub Menu Calculo Alimentos:          |");
            System.out.println("|_______________________________________________|");
            System.out.println("| Sub menu para calculo de alimentos a futuro   |");
            System.out.println("|                                               |");
            System.out.println("|       Ingrese el nombre del animal            |");
            System.out.println("|_______________________________________________|");
        
        String nombreBuscado = scanner.nextLine();

        Animal encontrado = null;
        for (Animal animal : animales) {
            if (animal.nombre.equalsIgnoreCase(nombreBuscado)) {
                encontrado = animal;
                break;
            }
        }

        if (encontrado != null) {
            System.out.println("________________________________________________");
            System.out.println("|          Sub Menu Calculo Alimentos:          |");
            System.out.println("|_______________________________________________|");
            System.out.println("| Sub menu para calculo de alimentos a futuro   |");
            System.out.println("|                                               |");
            System.out.println("|¿Para cuántos días desea calcular el alimento? |");
            System.out.println("|                                               |");
            int dias = scanner.nextInt();
            System.out.println("|_______________________________________________|");
            double total = dias * encontrado.consumoDiario;
            System.out.println("El animal " + encontrado.nombre + " consumirá un total de " + total + " libras en " + dias + " días.");
        } else {
            System.out.println("No se encontró ningún animal con el nombre: " + nombreBuscado);
        }

        // Submenú
            System.out.println("________________________________________________");
            System.out.println("|          Sub Menu Calculo Alimentos:          |");
            System.out.println("|_______________________________________________|");
            System.out.println("|                                               |");
            System.out.println("|    1. Calcular para otro animal               |");
            System.out.println("|                                               |");
            System.out.println("|    2. Volver                                  |");
            System.out.println("|_______________________________________________|");
        System.out.println("\n¿Qué desea hacer ahora?");
        
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();

        if (opcion != 1) {
            continuar = false; // Sale del bucle y vuelve al menú principal
        }
    }
}
    private static void agregarAnimal(Scanner scanner) {//se dejo en publica por allan
        if (animales.size() >= 10) {
            System.out.println("Ya ha registrado un Mamífero, un Ave y un Reptil. No puede agregar más.");
            return;
        }
       
            System.out.println("________________________________________________");
            System.out.println("|               Sub Menú Zoo Fase 1:            |");
            System.out.println("|_______________________________________________|");
            System.out.println("|    1. Agregar mamifero                        |");
            System.out.println("|                                               |");
            System.out.println("|    2. Agregar Ave                             |");
            System.out.println("|                                               |");
            System.out.println("|    3. Agregar Reptil                          |");
            System.out.println("|                                               |");
            System.out.println("|    4.                     |");
            System.out.println("|                                               |");
            System.out.println("|    5.                     |");
            System.out.println("|                                               |");
            System.out.println("|    6. Salir:                                  |");
            System.out.println("|_______________________________________________|");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
       
        System.out.print("Ingrese el ID Animal: ");
        int IdAnimal = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Ingrese el consumo diario en libras: ");
        double consumo = scanner.nextDouble();
        scanner.nextLine();
        //switch para agregar animales y su consumo
        switch (tipo) {
            case 1:
                animales.add(new Mamifero(IdAnimal, nombre, consumo));
                break;
            case 2:
                animales.add(new Ave(IdAnimal, nombre, consumo));
                break;
            case 3:
                animales.add(new Reptil(IdAnimal, nombre, consumo));
                break;
            case 4:
                    
                break;    
            case 5:
                   
                break;    
            default:
                System.out.println("Tipo inválido.");
        }
    }

    private static void listarAnimales() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales registrados.");
        } else {
            for (Animal animal : animales) {
                animal.mostrarInfo();
            }
        }
    }

   private static void exportarCSV() {
    try (PrintWriter writer = new PrintWriter("animales.csv")) {
        for (Animal animal : animales) {
            writer.println(animal.IdAnimal + animal.nombre + "," + animal.consumoDiario);
        }
        System.out.println("Datos exportados correctamente.");
    } catch (Exception e) {
        System.out.println("Error al exportar: " + e.getMessage());
    }
}
public static List<Animal> getAnimales() {
    return animales;
}
    
//ordenamiento


//recorrido
}
