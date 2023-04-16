package br.com.bootcamp;

public class Main {
	
	public static void main(String[] args) {	
	Exercicios exercicio = new Exercicios();
	exercicio.informarNota1();
	exercicio.informarNota2();
	exercicio.informarNota3();
	System.out.println(" A media do aluno é : "  + exercicio.calcularMedia());


}
}