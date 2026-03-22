package gt.edu.miumg.progra1bgrupo12026;

import java.util.Scanner;

public class Progra1BGrupo12026 {

    public static void main(String[] args) {
        
        
        System.out.println("****************************************");
        System.out.println("***    Bienvenido a Zoo La Aurora   ****");
        System.out.println("**************************************** \n");

        Scanner in = new Scanner(System.in);
        String datos; String nombre; int edad; int repetir, opcion = 0;
        
        System.out.println("Sea bievenido al Zoo la Aurora \n"
                + "por favor seleccione una opcion del menu: \n");
       
        do{
        
        System.out.println("Menu: \n" + 
                "1. Nuevo Registro \n" +
                "2. Lista de animales \n" + 
                "3. Horario Alimentacion \n" + 
                "4. Salir \n");
        opcion = in.nextInt();
        
        switch (opcion){
        
            case 1: System.out.println("Usted acaba de seleccionar Nuevo Ingreso: ");
            
            
            break;
            
            case 2: System.out.println("Usted seleeciono Lista de Animales: ");
            
            
            break;
            
            case 3: System.out.println("Usted selecciono Horario de Alimentacion: ");
            
            
            break;
            
            case 4: System.out.println("Usted selecciono Salir: ");
            
            
            break;
            
            default:
                System.out.println("Opcion invalida, por favor ingrese nuevamente: ");
                
                break;
        }
        
        
            System.out.println("Si desea continuar presione 1 0 2 para salir.");
            repetir = in.nextInt();
        
            
        } while (repetir == 1);
        System.out.println("Gracias por su atencion y cuidado de los animales \n"
                + "del Zoologico la Aurora de la Ciudad de Gautemala.");
    
    
    }
}

    