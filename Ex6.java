package estruturaderepetiçao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int i= 0;
		
		System.out.println("Informe o nome ");
		nome = ler.next();

		while (i < 15) {
			i++;
			System.out.println("O nome do usuário é: " + nome);
		}

	}

}

