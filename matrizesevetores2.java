package matrizesevetores;

import java.util.Scanner;

public class matrizesevetores2 {

	public static void main(String[] args) {
		
		// Matriz - Exercício 3
			
		
		Scanner sc = new Scanner(System.in);

		int matrizInteiros[][] = new int [3][3];
		int primeiraSoma = 0, segundaSoma = 0;
		String diagonalPrincipal = "", diagonalSecundaria = "";
					
		for (int indiceA = 0; indiceA < matrizInteiros.length; indiceA++) { 
		
			for (int indiceB = 0; indiceB < matrizInteiros.length; indiceB++) { 
								
				System.out.println("Digite um número da possição: (" + indiceA + "," + indiceB + "): ");
				matrizInteiros[indiceA][indiceB] = sc.nextInt();
									
				}
		}
		
		for (int indiceA = 0; indiceA < matrizInteiros.length; indiceA++) {
			diagonalPrincipal += matrizInteiros[indiceA][indiceA] + " ";
			primeiraSoma += matrizInteiros[indiceA][indiceA];
		}

		for (int indiceB = 0; indiceB < matrizInteiros.length; indiceB++) {
				diagonalSecundaria += matrizInteiros[indiceB] [matrizInteiros.length - 1 - indiceB] + " ";
				segundaSoma += matrizInteiros[indiceB][matrizInteiros.length -1 - indiceB];
		}
		
		System.out.println("Elementos da diagonal principal: ");
		System.out.println(diagonalPrincipal);
		
		System.out.println("Elementos da diagonal secundária: ");
		System.out.println(diagonalSecundaria);
		
		System.out.println("Soma de todos os elementos da diagonal principal: ");
		System.out.println(primeiraSoma);
		
		System.out.println("Soma de todos os elementos da diagonal secundaria: ");
		System.out.println(segundaSoma);
		
		
		sc.close();
				
				
	}

}
