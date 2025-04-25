/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooaurora;

/**
 *
 * @author Tecno
 */
class Reptil extends Animal {
    public Reptil(int IdAnimal, String nombre, double consumoDiario) {
        super(IdAnimal, nombre, "Reptil", consumoDiario);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El ID es "+IdAnimal+"Reptil: " + nombre + " | Consumo diario: " + consumoDiario + " libras");
    }
}