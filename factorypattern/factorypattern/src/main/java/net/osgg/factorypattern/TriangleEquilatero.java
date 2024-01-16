package net.osgg.factorypattern;

public class TriangleEquilatero extends Figuras {
    public TriangleEquilatero() {
        nombre = "Triangulo Equilatero";
        lados = "3 lados";
        angulos = "3 angulos";

        elementos.add("lados iguales");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
