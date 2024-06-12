package estruturaderepetiçao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, soma=0,media=0;

		for(int i=1; i<=20 ; i++) {
			System.out.println("Insira a idade " + i );
			idade = ler.nextInt();

			soma = idade+soma;

		}
		
		media=soma/20;
		System.out.println("O resultado da soma das idades é " + soma);
		ler.close();

	}

}
