package br.sp.senai.jandira.calculo_formas.model;

public class Circunferencia {
	
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double calcularArea(){
		double area = Math.PI * (raio * raio);
		return area;
	}
	
	public void mostrarDados(){
		double area = calcularArea();
		System.out.println("Forma Geométrica - Circulo");
		System.out.println("-------------------------------");
		System.out.printf("RAIO: %s\n", raio);
		System.out.printf("CIRCUNFERÊNCIA: %s\n", area);
		System.out.println("-------------------------------");
	}
	

}
