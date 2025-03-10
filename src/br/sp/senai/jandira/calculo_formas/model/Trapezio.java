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
	
	public void setAltura() {
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
		
	}


}
