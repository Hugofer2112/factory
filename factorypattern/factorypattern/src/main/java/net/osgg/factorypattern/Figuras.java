package net.osgg.factorypattern;

import java.util.ArrayList;

public abstract class Figuras {
    String nombre; 
    String lados;
    String angulos;
    
	ArrayList<String> elementos = new ArrayList<String>();

    void prepare() {
        System.out.println("Trazando " + nombre);
        System.out.println("Uniendo lados...");
        System.out.println("Añadiendo carateristicas: ");
        for(int i = 0; i < elementos.size(); i++) {
            System.out.println("    " + elementos.get(i));
        }
    }
    
    void dibujar() {
        System.out.println("Dibujar a lapiz");
    }

    void delinear() {
        System.out.println("Repazar con rapidografo");
    }

    void borrar() {
        System.out.println("Borrar restos de lapiz");
    }

    public String getName() {
        return nombre;
    }
}
