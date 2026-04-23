package entradaSaida;

import java.util.Scanner; // importanto a classe Scanner para dentro da minha classe

public class AulaScanner {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine(); // lê o texto digitado
		
		System.out.println("Bom dia, " + nome + "!"); // (+) concatenar = juntar 
		
		leia.close();
		
	
		
		
		

	}

}
