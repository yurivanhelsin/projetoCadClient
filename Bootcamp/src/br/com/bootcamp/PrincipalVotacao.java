package br.com.bootcamp;

public class PrincipalVotacao {
	public static void main(String[] args) {
		
		
		Votacao votacao = new Votacao(0,0,0);
		
	
		votacao.Votar();
		System.out.println(" O candidato Marcelo Bernard obteve  " + votacao.getContadorvotocandidato1()+ " votos ");
		System.out.println(" A candidata Marília alves  obteve  " + votacao.getContadorvotocandidato2()+ " votos ");
		System.out.println(" A candidata Adriana Teles obteve  " + votacao.getContadorvotocandidato3()+ " votos ");
		


		
		
		
		
		
		
	}

}
