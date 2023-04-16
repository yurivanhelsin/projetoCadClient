  package br.com.bootcamp;
import java.util.Scanner;
public class Velocidade {
	
	private float velocidadeVeiculo;
	private float velocidadeLeve =0.0f;
	private float velocidadeMedia;
	private float velocidadeGrave;
	private float  velocidadeGravissima;
	
	
	Scanner p = new Scanner(System.in);
	
	
	
	public Velocidade(float velocidadeVeiculo, float velocidadeLeve, float velocidadeMedia, float velocidadeGrave,
			float velocidadeGravissima) {
		super();
		this.velocidadeVeiculo = velocidadeVeiculo;
		this.velocidadeLeve = velocidadeLeve;
		this.velocidadeMedia = velocidadeMedia;
		this.velocidadeGrave = velocidadeGrave;
		this.velocidadeGravissima = velocidadeGravissima;
	}


	//public Velocidade() {
		
	//}
	
	
	public float InformarVelocidadeVeiculo() {
		
		System.out.println(" Informe a velocidade do veículo");
		velocidadeVeiculo = p.nextFloat();			
		
		if(velocidadeVeiculo <= velocidadeLeve) {
			System.out.println(" Voçê está Isento");
		}else
		     if(velocidadeVeiculo <= velocidadeMedia){
			System.out.println(" Voçê acaba de perder três pontos na carteira");
			
		}else if(velocidadeVeiculo <= velocidadeGrave){
			System.out.println(" voçê acaba de perder 5 pontos na carteira");
		}else if(velocidadeVeiculo<= velocidadeGravissima) {
			System.out.println("Voce acaba de perder 7 pontos na carteira ");
		}
		
		return velocidadeVeiculo;
		
		
		
		
		
	}
	
	
	
	
	public float getVelocidadeVeiculo() {
		
		return velocidadeVeiculo;


		}
				
	
	
	
	
	public void setVelocidadeVeiculo(float velocidadeVeiculo) {
		this.velocidadeVeiculo = velocidadeVeiculo;
	}
	
	
	
	
	
	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}
	
	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public float getVelocidadeLeve() {
		return velocidadeLeve;
	}
	public void setVelocidadeLeve(float velocidadeLeve) {
		this.velocidadeLeve = velocidadeLeve;
	}
	
	public float getVelocidadeGrave() {
		return velocidadeGrave;
	}
	
	public void setVelocidadeGrave(float velocidadeGrave) {
	
		this.velocidadeGrave = velocidadeGrave;
	}
	
	public float getVelociddaeGravissima() {
		return velocidadeGravissima;
	}
	public void setVelocidadeGravissima(float velocidadeGravissima) {
		this.velocidadeGravissima = velocidadeGravissima;
	}

}
