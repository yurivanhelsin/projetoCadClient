package br.com.bootcamp;
import java.util.Scanner;


public class Votacao {

	

	private char voto;
	private int contadorvotocandidato1;
	private int contadorvotocandidato2 ;
	private int contadorvotocandidato3 ;	
	Scanner leitor = new Scanner(System.in);
	
	
	
	public Votacao(int contadorvotocandidato1, int contadorvotocandidato2,int contadorvotocandidato3) {
		this.setContadorvotocandidato1(contadorvotocandidato1);
		this.setContadorvotocandidato2(contadorvotocandidato2);
		this.setContadorvotocandidato3(contadorvotocandidato3);
	}
	
	
	
	
	
	
	
	public void Votar() {
		
		do{
			
			
			
			System.out.println(" Escolha sua opção de voto");
			System.out.println(" 1-Marcelo Bernard");
			System.out.println(" 2-Marília Alves");
			System.out.println(" 3-Adriana Teles");		
			System.out.println(" 4-Sair");			
			voto = leitor.next().charAt(0);	
			
		switch(voto){
			
			case '1':
				
			    System.out.println(" Voçê votou em Marcelo Bernard ");
			    contadorvotocandidato1 =contadorvotocandidato1 + 1;
			    break;
			case '2':
				System.out.println(" Voçê votou em Marília alves ");
				contadorvotocandidato2 = contadorvotocandidato2 + 1;
				break;
			case '3':
				System.out.println(" Voçê votou em Adriana Teles ");
				contadorvotocandidato3 = contadorvotocandidato3 + 1;
				break;
				
			case '4':
				
				System.out.println(" votação encerrada !!!");
				break;
			
				
				default:
					System.out.println(" Voto inválido, escolha uma opção válida");
					
              break;						
		}	
		 
		
		}while(voto !='4');	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public char getVoto() {
		return voto;
	}
	public void setVoto(char voto) {
		this.voto= voto;
	}

	public int getContadorvotocandidato1() {
		return contadorvotocandidato1;
	}

	public void setContadorvotocandidato1(int contadorvotocandidato1) {
		this.contadorvotocandidato1 = contadorvotocandidato1;
	}


	public int getContadorvotocandidato2() {
		return contadorvotocandidato2;
	}


	public void setContadorvotocandidato2(int contadorvotocandidato2) {
		this.contadorvotocandidato2 = contadorvotocandidato2;
	}


	public int getContadorvotocandidato3() {
		return contadorvotocandidato3;
	}


	public void setContadorvotocandidato3(int contadorvotocandidato3) {
		this.contadorvotocandidato3 = contadorvotocandidato3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
