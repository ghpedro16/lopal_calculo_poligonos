package br.sp.senai.jandira.calculo_formas.model;

public class Quadrado {
	
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double calcularArea(){
		double area = lado * lado;
		return area;
	}
	
	public double calcularPerimetro(){
		double perimetro = 2 * (lado + lado);
		return perimetro;
	}
	
	public void mostrarDados(){
		double area = calcularArea();
		double perimetro = calcularPerimetro();
		System.out.println("Forma Geométrica - Quadrado");
		System.out.println("-------------------------------");
		System.out.printf("LADO: %s\n", lado);
		System.out.printf("ÁREA: %s\n", area);
		System.out.printf("PERÍMETRO: %s\n", perimetro);
		System.out.println("-------------------------------");
	}


}
