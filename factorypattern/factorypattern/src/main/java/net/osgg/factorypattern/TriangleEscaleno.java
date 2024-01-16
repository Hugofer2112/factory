package net.osgg.factorypattern;

public class TriangleEscaleno extends Figuras {
	public TriangleEscaleno() {
		nombre = "Triangulo Escaleno";
		lados = "3 lados";
		angulos = "3 angulos";
 
		elementos.add("lados diferentes");
		elementos.add("angulos diferentes");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
