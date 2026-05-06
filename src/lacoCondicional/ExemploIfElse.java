package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		
		// entrada dedados
		System.out.println("Digite a primeira nota:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		nota2 = leia.nextFloat();
		
		// processamento
		media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println("Parabéns, você foi aprovado!");
		}else {
			System.out.println("Infelizmente, você foi reprovado!");
			
		}


	}

}
