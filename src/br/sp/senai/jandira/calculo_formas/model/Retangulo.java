package br.sp.senai.jandira.calculo_formas.model;

public class Retangulo {
	
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
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro(){
		double perimetro = 2 * (base + altura);
		return perimetro;
	}
	
	public void mostrarDados(){
		double area = calcularArea();
		double perimetro = calcularPerimetro();
		
	}

}
