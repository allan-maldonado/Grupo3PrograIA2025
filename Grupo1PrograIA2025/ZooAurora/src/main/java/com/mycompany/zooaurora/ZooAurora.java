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
                    System.out.println("|    3.   Fase II:                              |");
                    System.out.println("|                                               |");
                    System.out.println("|    4.   Salir:                                |");
                    System.out.println("|                                               |");
                    System.out.println("|_______________________________________________|");
            menuzoo = scanner.nextInt();
            
            switch (menuzoo) {
                case 1:
                    System.out.println("Bienvenido al detalle de ZOO");
                    menuZoo(scanner);
                    break;
                    
                case 2:
                    System.out.println("Bienvenido a la Fase I");
                    
                    break;
                    
                    
                case 3:
                    System.out.println("Bienvenido a la FaseII");
                    
                    
                    break;
                case 4:
                    System.out.println("Estamos por salir");
                    break;
                default:
                    System.out.println("Opción no implementada aún.");
            }
        } while (menuzoo != 4);
        
        scanner.close();
    }

    private static void menuZoo(Scanner scanner) {
        int opcion;
        do {
             System.out.println("________________________________________________");
            System.out.println("|                  Menú Zoo:                    |");
            System.out.println("|_______________________________________________|");
            System.out.println("|    1. Agregar nuevo animal                    |");
            System.out.println("|                                               |");
            System.out.println("|    2. Ver todos los animales                  |");
            System.out.println("|                                               |");
            System.out.println("|    3. Exportar datos a CSV                    |");
            System.out.println("|                                               |");
            System.out.println("|    4. Volver                                  |");
            System.out.println("|                                               |");
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
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void agregarAnimal(Scanner scanner) {
        if (animales.size() >= 3) {
            System.out.println("Ya ha registrado un Mamífero, un Ave y un Reptil. No puede agregar más.");
            return;
        }
        
        System.out.println("Seleccione el tipo de animal (1. Mamífero, 2. Ave, 3. Reptil): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el consumo diario en libras: ");
        double consumo = scanner.nextDouble();
        
        switch (tipo) {
            case 1:
                animales.add(new Mamifero(nombre, consumo));
                break;
            case 2:
                animales.add(new Ave(nombre, consumo));
                break;
            case 3:
                animales.add(new Reptil(nombre, consumo));
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
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_CSV))) {
            for (Animal animal : animales) {
                writer.println(animal.toCSV());
            }
            System.out.println("Datos exportados correctamente a " + ARCHIVO_CSV);
        } catch (IOException e) {
            System.out.println("Error al exportar datos: " + e.getMessage());
        }
    }
}


// Clase base Animal
abstract class Animal {
    protected String nombre;
    protected String tipo;
    protected double consumoDiario;

    public Animal(String nombre, String tipo, double consumoDiario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.consumoDiario = consumoDiario;
    }

    public abstract void mostrarInfo();

    public String toCSV() {
        return nombre + "," + tipo + "," + consumoDiario;
    }
}

// Subclases de Animal
class Mamifero extends Animal {
    public Mamifero(String nombre, double consumoDiario) {
        super(nombre, "Mamífero", consumoDiario);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mamífero: " + nombre + " | Consumo diario: " + consumoDiario + " libras");
    }
}

class Ave extends Animal {
    public Ave(String nombre, double consumoDiario) {
        super(nombre, "Ave", consumoDiario);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Ave: " + nombre + " | Consumo diario: " + consumoDiario + " libras");
    }
}

class Reptil extends Animal {
    public Reptil(String nombre, double consumoDiario) {
        super(nombre, "Reptil", consumoDiario);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Reptil: " + nombre + " | Consumo diario: " + consumoDiario + " libras");
    }
}

//parte para oscar








//rango alcanzado
//parte para bryan 



//rango para bryan




