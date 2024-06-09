package matrizesevetores;

import java.util.Scanner;

public class matrizesEvetores1 {

	public static void main(String[] args) {
		// Matriz e Vetores 1
		
		Scanner sc = new Scanner(System.in);

		int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6};
		int numIn;
		
		System.out.println("Digite um número que quer pesquisar: ");
		numIn = sc.nextInt();

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			if (numIn == vetorInteiros[indice]) { 
				System.out.printf("O número %d está localizado na posição %d", numIn, indice);
				return;
			}
		}
		
		System.out.println("Sorry, não foi localizado!");

		sc.close();
	}

}
