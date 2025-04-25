/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooaurora;

/**
 *
 * @author Tecno
 */
class Ave extends Animal {
    public Ave(int IdAnimal, String nombre, double consumoDiario) {
        super(IdAnimal, nombre, "Ave", consumoDiario);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El ID es "+IdAnimal+"tipo Ave: " + nombre + " | Consumo diario: " + consumoDiario + " libras");
    }
}

