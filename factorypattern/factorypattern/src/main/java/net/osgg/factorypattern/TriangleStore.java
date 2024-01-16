package net.osgg.factorypattern;

public class TriangleStore extends FigurasStore {

    Figuras createFigura(String item) {
        if (item.equals("lados iguales")) {
            return new TriangleEquilatero();
        } else if (item.equals("2 lados iguales")) {
            return new TriangleIsosceles();
        } else if (item.equals("lados diferentes")) {
            return new TriangleEscaleno();
        } else if (item.equals("angulos diferentes")) {
            return new TriangleEscaleno();
        } else return null;
    }
    }

