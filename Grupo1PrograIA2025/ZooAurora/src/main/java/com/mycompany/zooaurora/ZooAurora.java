/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zooaurora;
import java.util.Scanner;
/**
 *
 * @author Tecno
 */
public class ZooAurora {

    public static void main(String[] args) {
                // Definimos credenciales correctas
        String usuarioCorrecto = "admin";
        String claveCorrecta = "1234";
        String usuarioIngresado, claveIngresada;
        //String salir ="";
        int menuzoo;

        // Crear Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar usuario
        System.out.print("Ingrese su usuario: ");
        usuarioIngresado = scanner.nextLine();
        claveIngresada = "";
        // Validar usuario antes de pedir la clave
        if (!usuarioIngresado.equals(usuarioCorrecto)) {
            System.out.println("Acceso denegado.");
        } else {
            // Mientras la clave ingresada sea incorrecta, seguir pidiendo
            while (!claveIngresada.equals(claveCorrecta)) {
                System.out.print("Ingrese su clave: ");
                claveIngresada = scanner.nextLine();

                if (claveIngresada.equals(claveCorrecta)) {
                    do{
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
                    System.out.print("Ingrese su opcion: ");
                    menuzoo = scanner.nextInt();
                    
                     switch (menuzoo){
                        case 1:
                        System.out.println("Bienvenido al detalle de ZOO");
                         
                        
                        
                        
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
                            System.out.println("opcion invalida:");
                           
                            break;
                     }
                    }while (menuzoo !=4);
              
                  scanner.close();
       
                    
                } else {
                    System.out.println("Clave incorrecta. Inténtelo de nuevo.");
                }
            }
        }
        // Cerrar Scanner para evitar fugas de memoria
    scanner.close();    
    }
}

//prueba de esto sirve
