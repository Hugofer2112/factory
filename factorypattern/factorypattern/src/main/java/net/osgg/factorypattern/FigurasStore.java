package net.osgg.factorypattern;

public abstract class FigurasStore {

    abstract Figuras createFigura(String item);

    public Figuras drawFigura(String type) {
        Figuras figura = createFigura(type);
        System.out.println("--- Dibujando un  " + figura.getName() + " ---");
        figura.prepare();
        figura.dibujar();
        figura.delinear();
        figura.borrar();
        return figura;
    }
}
