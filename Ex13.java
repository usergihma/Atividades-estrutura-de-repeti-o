package estruturaderepetiçao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, maior=0;

		
		for(int i=1; i<=20 ; i++) {
			System.out.println("Insira a idade " + i );
			idade = ler.nextInt();
			if (idade >=18) {
				maior++;
			}
		
		}
		System.out.println(maior + " pessoas são maior de idade");
		
	}

}


