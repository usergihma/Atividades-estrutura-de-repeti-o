package estruturaderepetiçao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;

		System.out.println("Informe o nome ");
		nome = ler.next();

		for(int i=0; i<=10 ; i++) {
			System.out.println("O nome do usuário é: " + nome);

		}

		ler.close();

	}

}
