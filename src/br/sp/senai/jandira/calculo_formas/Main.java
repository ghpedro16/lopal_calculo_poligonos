package br.sp.senai.jandira.calculo_formas;

import br.sp.senai.jandira.calculo_formas.model.Circunferencia;
import br.sp.senai.jandira.calculo_formas.model.Quadrado;
import br.sp.senai.jandira.calculo_formas.model.Retangulo;
import br.sp.senai.jandira.calculo_formas.model.Trapezio;
import br.sp.senai.jandira.calculo_formas.model.Triangulo;

public class Main {
	
	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();
		Trapezio trapezio = new Trapezio();
		Circunferencia raio = new Circunferencia();
		
		quadrado.setLado(4);
		quadrado.mostrarDados();
	}

}
