package br.sp.senai.jandira.calculo_formas.model;

public class Trapezio {
	
	private double baseMenor;
	private double baseMaior;
	private double altura;
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calcularArea(){
		double area = (baseMaior + baseMenor) * altura / 2;
		return area;
	}

	public void mostrarDados(){
		double area = calcularArea();
		System.out.println("Forma Geométrica - Trapézio");
		System.out.println("-------------------------------");
		System.out.printf("BASE MENOR: %s\n", baseMenor);
		System.out.printf("BASE MAIOR: %s\n", baseMaior);
		System.out.printf("ALTURA: %s\n", altura);
		System.out.printf("ÁREA: %s\n", area);
		System.out.println("-------------------------------");
		
	}


}
