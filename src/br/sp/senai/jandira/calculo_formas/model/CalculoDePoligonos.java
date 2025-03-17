package br.sp.senai.jandira.calculo_formas.model;

import java.util.Scanner;

public class CalculoDePoligonos {

	public static void calcularQuadrado() {
		
		Quadrado quadrado = new Quadrado();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Lado do Quadrado: ");
		double lado = leitor.nextDouble();
		
		quadrado.setLado(lado);
		quadrado.mostrarDados();
		
		leitor.close();
	}
	
	public static void calcularRetangulo() {
		
		Retangulo retangulo = new Retangulo();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Base do Retângulo: ");
		double base = leitor.nextDouble();
		
	}
}
