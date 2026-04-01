package gt.edu.miumg.progra1bgrupo12026;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PGutierrez
 */
public class Animal {
    
    private String nombre;
    private int edad;
    private double peso;
    private double consumo_Diario;
    private String tipo_Dieta;
   
    public Animal(String nombre, int edad, double peso, double consumo_Diario, String tipo_Dieta) {

    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.consumo_Diario = consumo_Diario;
    this.tipo_Dieta = tipo_Dieta;

}  

public String mostrarDatos() {
    return "Nombre: " + nombre + "Edad: " + edad + "Peso: " + peso + "Consumo_Diario: "
            + consumo_Diario + "Tipo de Dieta: " + tipo_Dieta;
    
    
    
    
}

}
