package estruturaderepetiçao;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num=0, soma=0, i=1;

		while(i<11) {
			System.out.println("Insira o " + i + " número: ");
			num = ler.nextInt();
			i++;
			soma = num+soma;

		}

		System.out.println("A soma dos números é :" + soma);
		ler.close();

	}

}


