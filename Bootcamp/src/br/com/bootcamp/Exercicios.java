package br.com.bootcamp;
import java.util.Scanner;
public class Exercicios {
	
	

	private	float nota1;
	private	float nota2;
	private	float nota3;
	private	float media = 0;
	
	Scanner leitor = new Scanner(System.in);
		;
	public Exercicios(){	
		
	}
	
	
	public float informarNota1(){
	
	
	System.out.println(" Informa a primeira nota: ");
	nota1 = leitor.nextInt();
	if(nota1 >= 0) {
		return nota1;	
	
	}else {
		
		System.out.println( " Valor negativo, será atribuída a nota 0");
		nota1=0;
		return nota1;	
	}
	
	
	
}	

	public float informarNota2() {				
		System.out.println(" Informe a segunda nota: ");
		nota2 = leitor.nextInt();	
		if(nota2>=0 ) {
			return nota2;
		}else {
			System.out.println( " Valor negativo,será atribuída a nota 0 ");
			nota2 =0;
			return nota2;	
		}
		
		
		
	}	
		
		
		
		
		
		
		
	
	
	public float informarNota3() {

	System.out.println(" Informe  a terceira nota: ");
	nota3 = leitor.nextInt();
	
	if(nota1>= 0) {
		return nota3;
	
	}else {
		System.out.println( "Valor negativo,será atribuída a nota 0 ");
        nota3 =0;
		return nota3;
	
}	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	public float calcularMedia(){
	media=(nota1+ nota2 + nota3)/3;
	
	
	if(media > 0 && media >= 7) {
		System.out.println(" Este aluno está aprovado");
	
	return media;
	}else  if(media > 0 && media >=5){
		System.out.println(" Este aluno em Recuperação");
		return media;
	}else if(media > 0 && media < 5){	
		System.out.println(" Este aluno está reprovado");
		return media;
	}else {
	System.out.println(" Valor inválido , Notas não podem ser negativas ");	
	 return 0;
	}	
		
	}

	
	
	
	
	
	
	
	
	
	public void setNota1(float nota1) {
	 this.nota1 =nota1;
		}
		
		
	
	public float getNota1() {
		return nota1;
	}
	
	public void setNota2(float nota2) {
		this.nota2 =nota2;
	}
	public float getNota2() {
		return nota2;
	}
    
	public void setNota3(float nota3){
		this.nota3 =nota3;
	}
	
	public void setMedia(float media){
		this.media = media;
		
	}
	
	public float getMedia() {
		return media;
	}
	
	
}
