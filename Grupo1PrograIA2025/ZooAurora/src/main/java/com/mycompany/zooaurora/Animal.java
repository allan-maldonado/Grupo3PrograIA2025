/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooaurora;

/**
 *
 * @author Tecno
 */

   abstract class Animal {
    protected String nombre;
    protected String tipo;
    protected double consumoDiario;
    protected int IdAnimal;

    public Animal(int IdAnimal, String nombre, String tipo, double consumoDiario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.consumoDiario = consumoDiario;
        this.IdAnimal = IdAnimal;
    }

    public abstract void mostrarInfo();

    public String toCSV() {
        return IdAnimal +","+ nombre + "," + tipo + "," + consumoDiario;
    }
} 

