package br.sp.senai.jandira.calculo_formas.model;

public class Triangulo {
	
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	
	public double getLadoA() {
		return ladoA;
		
	}
	
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	public double getLadoB() {
		return ladoB;
	}
	
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	public double getLadoC() {
		return ladoC;
	}
	
//	public double calcularArea(){
//	}
	
	public void tipoTriangulo() {
		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			if (ladoA == ladoB && ladoB == ladoC) {
				System.out.println("É um triângulo EQUILÁTERO!");
			} else if (ladoA != ladoB && ladoB != ladoC) {
				System.out.println("É um triângulo ESCALENO!");
			} else {
				System.out.println("É um triângulo ISÓSCELES!");
			}
		} else {
			System.out.println("As medidas informadas NÃO formam um triângulo.");
		}
	}
	
	public void mostrarDados(){
//		double area = calcularArea();
		System.out.println("Forma Geométrica - Triângulo");
		System.out.println("-------------------------------");
		System.out.printf("LADO A: %s\n", ladoA);
		System.out.printf("LADO B: %s\n", ladoB);
		System.out.printf("LADO C %s\n", ladoC);
		tipoTriangulo();
//		System.out.printf("ÁREA: %s\n", area);
		System.out.println("-------------------------------");
	}
		
		

}
