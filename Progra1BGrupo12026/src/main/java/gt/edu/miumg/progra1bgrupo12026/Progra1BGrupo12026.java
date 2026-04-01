package gt.edu.miumg.progra1bgrupo12026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Progra1BGrupo12026{
 private static Scanner sc= new Scanner(System.in);
 private static List<Animal>animales=new ArrayList<>();
 private static String ARCHIVO_CSV=Progra1BGrupo12026.ARCHIVO_CSV;
    
    public static void main(String[] args) 
            
        {
    boolean salir=false; 
    int opcion;
     
        {
        
            
            
            
            
            
            do{
                
                System.out.println("***************BIENVENIDOS AL ZOOLOGICO GT**************");
                System.out.println("****SISTEMA DE GESTION ZOOLOGICO LA AURORA GUATEMALA****");
                System.out.println("");
                System.out.println("1) ZOO");
                System.out.println("2) Fase II");
                System.out.println("3) Fase III");
                System.out.println("4) Salir");
                System.out.println("   SELECCIONA LA OPCION:  ");
                System.out.println("");
                
                opcion=sc.nextInt();
               
                
                switch(opcion){
                    
                    case 1:
                      menuZoo();
            
                        break;
                    case 2:
                        System.out.println("Opcion 2");
                        
                        break;
                        
                        
                    case 3:
                        System.out.println("Opcion 3");
                        
                        break;
                        
                        
                    case 4:
                        
                        salir=true;
                        System.out.println("");
                        System.out.println("*****REGRESE PRONTO, FUE UN GUSTO PODERLE TENERLE EN NUESTRO ZOOLOGICO****");
                        System.out.println("");
                        break;
                       
                    default:
                        System.out.println("-------Opcion Invalidad--------");
                        System.out.println("");
                }
                
                
            }while(!salir);
            sc.close();
            
        }
    }

    private static int menuZoo() {
        
        Scanner sc = new Scanner(System.in);
            int opcion = 4;
            
            do{
                System.out.println("*****MENUZOO****");
                System.out.println("1) Ingrese nuevo animal");
                System.out.println("2) Ver todos los animales ");
                System.out.println("3) Expotarlos a CVS: ");
                System.out.println("4) salir:");
                
                
                opcion=sc.nextInt();
                
                switch(opcion){ 
                    
                    case 1:
                        
                        agregarAnimal();
                        
                        
                        break;
                        
                    case 2:
                        
                        ListaAnimal();
                        
                        break;
                        
                        
                    case 3:
                        
                        zoo.exportarCVS("animales CVS");
                        
                        break;
                        
                    case 4:
                        
                        System.out.println("Regresando al menu principal");
                        System.out.println("");
                        
                        break;
                        
                    default:
                        System.out.println("Opcion invalidad");
                        System.out.println("");
                }
                
                
            }while(opcion !=4);
        
            
        return 1;
        
        
    }

   
    private static void agregarAnimal() {
        int opcion;
            
            
            
            do
            {
                {
        
        
        Scanner in= new Scanner (System.in);
        System.out.println("Seleccionar el tipo de animal: ");
        System.out.println("1) Mamifero");
        Scanner m= new Scanner (System.in);
        System.out.println("2 Ave ");
        Scanner a= new Scanner (System.in);
        System.out.println("3 Reptil");
        Scanner r= new Scanner (System.in);
        System.out.println("  Opcion: ");
        int tipo =in.nextInt();
        in.nextLine();
        
        System.out.println("Nombre del Animal: ");
        String nombre= in.nextLine(); 
        System.out.println("Ingrese el consumo Diario en LIBRAS: ");
        int libras= in.nextInt();
        in.nextLine();
     
       String Mamifero;
       int consumo = 0;
        switch(opcion=4){
     
         
         
         case 1:
            
            
            break; 
         case 2: 
             
             
             break;
         case 4:
            
             System.out.println("");
             System.out.println(".....REGRESANDO A MENUZOO....");
             System.out.println("");
            
             break; 
             default:
                        System.out.println("Opcion invalidad");
                        
     }
        }
            }
        while (opcion !=4);
       
    }
    private static void ListaAnimal() {
        
        if (animales.isEmpty()) {
            System.out.println("");
            System.out.println("No hay animales registrados.");
            System.out.println("");
        } else {
            for (Animal animal : animales) {
                animal.mostrarInfo();
            }
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    private static double leerDouble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class zoo {

        private static void exportarCVS(String animales_CVS) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static boolean exiteclase(String clase) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

    private static class Animal {

        public Animal() {
        }

        private void mostrarInfo() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class m extends Animal {

        private static m nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public m (String nombre, int consumo) {
        }
    }
    
}
      
    
       
     
    
    