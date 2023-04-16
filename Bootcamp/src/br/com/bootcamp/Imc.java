package br.com.bootcamp;
import java.util.Scanner;
public class Imc {
	
	private float altura;
	private float peso;
	private float imc;
	
	Scanner leitor = new Scanner(System.in);	
	
public Imc() {
	
}

public void InformarAltura() {

  System.out.println(" Informe sua Altura: ");
  altura = leitor.nextFloat();
	
}

public void InformarPeso() {

	System.out.println(" Informe o seu peso: ");
	peso =leitor.nextFloat();
	
	
}


public float calcularImc() {
	
	imc = (peso / (altura * altura));	
	if(imc < 19) {
		System.out.println(" Voçê está abaixo do peso");
	}else if(imc < 24){
		System.out.println(" Peso ideal");
		
	}else {
		
		System.out.println(" Acima do peso ");
	}
	
	return imc;
}





public float getAltura() {
	return altura;
}
public void setAltura(float altura) {
	this.altura = altura;
}


public float getPeso() {
	return peso;
}

public void setPeso(float peso)	{
	this.peso=peso;
}

public float getImc() {
	return imc;
}


public void setImc(float imc) {
	
	
	
	
	
	this.imc=imc;
}





}
