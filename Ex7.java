package estruturaderepetiçao;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma=0;

		for(int i=1; i<=11 ; i++) {
			System.out.println("Insira o " + i + "número: ");
			num = ler.nextInt();
			
			soma = num+soma;

		}

		System.out.println("O resultado da soma é" + soma);
		ler.close();

	}

}
