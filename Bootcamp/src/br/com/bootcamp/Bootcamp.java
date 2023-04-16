package br.com.bootcamp;

import java.util.Scanner;

public class Bootcamp {
	public static void main(String[] args) {
		
		
		int num1;
		int num2;
		float media = 0;
		
		Scanner x = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		num1 = x.nextInt();
		
		System.out.println("Digite o segundo  número");
		num2 = x.nextInt();
		
		System.out.println("Os números digitados foram "  +  num1 + " e  "  +  num2);
		
		media =( num1 + num2)/2;
		System.out.println("E a média destes números é "  + media);
		
		
		
	}

}
