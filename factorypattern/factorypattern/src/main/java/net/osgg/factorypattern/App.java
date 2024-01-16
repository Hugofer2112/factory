package net.osgg.factorypattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FigurasStore cuaStore = new CuadrilaterStore();
        FigurasStore triaStore = new TriangleStore();

        Figuras figura = cuaStore.drawFigura("lados iguales");
        System.out.println("Jorge dibujo un " + figura.getName() + "\n");

        Figuras sec_figura= triaStore.drawFigura("angulos diferentes");
        System.out.println("Alex dibujo un " + sec_figura.getName() + "\n");
    }
}
