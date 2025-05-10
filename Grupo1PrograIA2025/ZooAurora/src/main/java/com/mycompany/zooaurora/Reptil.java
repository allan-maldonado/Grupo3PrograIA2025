package com.mycompany.zooaurora;

public class Reptil extends Animal {
    public Reptil(String idAnimal, String nombre, double consumoDiario) {
        super(idAnimal, nombre, "Reptil", consumoDiario);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El ID es " + getIdAnimal() + " | Tipo: Reptil | Nombre: " + getNombre() + " | Consumo diario: " + getConsumoDiario() + " libras");
    }

    @Override
    public String getIdAnimal() {
        return super.getIdAnimal();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public double getConsumoDiario() {
        return super.getConsumoDiario();
    }
}
