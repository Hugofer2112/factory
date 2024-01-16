package net.osgg.factorypattern;

public class TriangleIsosceles extends Figuras {
	public TriangleIsosceles() {
		nombre = "Triangulo Isosceles";
		lados = "3 lados";
		angulos = "3 angulos";
 
		elementos.add("2 lados iguales");
		
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
