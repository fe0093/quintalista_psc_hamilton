package quinta_lista_de_exercicios;

/**
 * Fa�a um programa que mostre: 
 * todos os valores pares de um vetor de quinze posi��es que ser� preenchido pelo usu�rio. 
Lembre-se: o vetor estar� completamente preenchido e apenas com n�meros naturais.
 */

import javax.swing.JOptionPane;

public class H {

	public static void main (String [] args) {
		
		int n = 5;
		int valores [] = new int[15];
		
		for (int i = 0; i < n; i++) {
			
			valores [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores:"));
			
			if (valores[i] >= 0 && valores[i]%2 == 0) {
				
				System.out.println("Os n�meros pares s�o: "+ valores[i]);
				
			}
			
		}
		
	}
	
}
