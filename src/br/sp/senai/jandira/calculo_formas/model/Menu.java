package br.sp.senai.jandira.calculo_formas.model;

import java.util.Scanner;

public class Menu {
	
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("---------------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÂNGULO");
		System.out.println("3 - TRAPÉZIO");
		System.out.println("4 - TRIÂNGULO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("---------------------------------");
		System.out.print("Escolha um polígono (1-5): ");
		int escolha = leitor.nextInt();
		
		if (escolha == 1) {
			CalculoDePoligonos.calcularQuadrado();
		}
		
	}

}
