package estruturaderepetiçao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, soma=0,i=0;

		while(i<=19) {
			i++;
			System.out.println("Insira a idade " + i );
			idade = ler.nextInt();
			
			soma = idade+soma;

		}

		System.out.println("O resultado da soma das idades é " + soma);
		ler.close();

	}

}
