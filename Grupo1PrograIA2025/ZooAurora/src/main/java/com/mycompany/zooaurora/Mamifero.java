package com.mycompany.zooaurora;

class Mamifero extends Animal {
    public Mamifero(String idAnimal, String nombre, double consumoDiario) {
        super(idAnimal, nombre, "Mamífero", consumoDiario);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El ID es " + getIdAnimal() + " | Tipo: Mamífero | Nombre: " + getNombre() + " | Consumo diario: " + getConsumoDiario() + " libras");
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

hola esta es una prueba