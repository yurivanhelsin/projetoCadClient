package br.com.bootcamp;

public class PrincipalTriângulo {
	public static void main(String[] args) {
		
		Triangulo tri1 = new Triangulo();		
		tri1.informarPrimeiroLadoTriangulo();		
		tri1.informarSegundoLadoTriangulo();
		tri1.informarTerceiroLadoTriangulo();
		tri1.verificarTriangulo();
		System.out.println(" Os lados Informados foram : "+   tri1.getLado1() + " " + tri1.getLado2()+" "+ tri1.getLado3());
	
}
}
