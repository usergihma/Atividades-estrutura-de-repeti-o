package estruturaderepetiçao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma= 0;

		for(int i=0; i<=15 ; i++) {
			soma = soma+i;
			System.out.println("A soma é: " + soma);

		}

		ler.close();

	}

}
