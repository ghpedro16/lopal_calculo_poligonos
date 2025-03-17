package br.sp.senai.jandira.calculo_formas.model;

public class Triangulo {
	
	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
		
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calcularArea(){
		double area = (base * altura) / 2;
		return area;
	}
	
	public void mostrarDados(){
		double area = calcularArea();
		System.out.println("Forma Geométrica - Triângulo");
		System.out.println("-------------------------------");
		System.out.printf("BASE: %s\n", base);
		System.out.printf("ALTURA: %s\n", altura);
		System.out.printf("ÁREA: %s\n", area);
		System.out.println("-------------------------------");
	}
		
		

}
