package net.osgg.factorypattern;

public class CuadrilaterStore extends FigurasStore {

    Figuras createFigura(String item) {
        if (item.equals("lados iguales")) {
            return new CuadrilateroCuadrado();
        } else if (item.equals("diagonales diferentes")) {
            return new CuadrilateroRombo();
        } else if (item.equals("2 lados iguales")) {
            return new CuadrilateroRectangulo();
        } else if (item.equals("angulos rectos")) {
            return new CuadrilateroRectangulo();
        } else return null;
    }
}
