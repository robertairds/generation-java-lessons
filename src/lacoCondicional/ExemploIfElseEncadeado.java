package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		// Variaveis
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);

		// entrada dedados
		System.out.println("Digite a primeira nota:");
		nota1 = leia.nextFloat();

		System.out.println("Digite a segunda nota:");
		nota2 = leia.nextFloat();

		// processamento
		media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Parabéns, você foi aprovado!");
			
		} else if(media >= 5) { //intervalo de nota (5 -> 5.9)
			System.out.println("Você está participando!");
			
		} else { // media < 5
			System.out.println("Infelizmente, você foi reprovado!");

		}

	}

}
