package com.mycompany.zooaurora;

public class Animal {
    private String idAnimal;
    private String nombre;
    private String tipo;
    private double consumoDiario;

    public Animal(String idAnimal, String nombre, String tipo, double consumoDiario) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.tipo = tipo;
        this.consumoDiario = consumoDiario;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + idAnimal + " | Nombre: " + nombre + " | Tipo: " + tipo + " | Consumo diario: " + consumoDiario + " libras");
    }
}
