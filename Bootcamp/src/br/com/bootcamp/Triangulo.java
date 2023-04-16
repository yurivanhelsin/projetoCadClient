package br.com.bootcamp;
import java.util.Scanner;


public class Triangulo {

	private float lado1;
	private float lado2;
	private float lado3;
	
	
	Scanner l= new Scanner(System.in);
	
	
	
	public Triangulo() {
		
	}
	
	
	
	public  float informarPrimeiroLadoTriangulo(){
		
		System.out.println(" Informe o primeiro lado:  ");
		lado1 =l.nextFloat();		
		return lado1;
		
	}
	
	public float informarSegundoLadoTriangulo() {		
		System.out.println(" Informe o segundo lado: ");
		lado2 =l.nextFloat();
		return lado2;
		
	}
	public float informarTerceiroLadoTriangulo() {	
		System.out.println(" Informe o terceiro lado: ");
		lado3 = l.nextFloat();
		return lado3;
		
		
		
	}
	
	
	
	public void verificarTriangulo() {
		
		
		if(lado1 > lado2 +lado3 || lado2 > lado1+lado3 || lado3 > lado1+lado2) {
			System.out.println(" Não é um triângulo ");
		}else if(lado1 == lado2 && lado2 ==lado3) {
			System.out.println(" Este triângulo é equilátero");
		}else if(lado1 ==lado2 || lado2 ==lado3 || lado1==lado3) {
			System.out.println(" Este triângulo é isósceles ");
		}else {
			System.out.println( " Este triângulo é escaleno");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public float getLado1() {
		return lado1;
	}
	
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}
	
	public float getLado2() {
		return lado2;
	}
	
	public void setLado2(float lado2) {
		this.lado2 =lado2;
	}
	
	public float getLado3() {
		return lado3;
	}
	
	public void setLado3(float lado3) {
		this.lado3=lado3;
	}
	
	
	
	
	
}
