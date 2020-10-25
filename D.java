package quinta_lista_de_exercicios;

/** Faça um programa que lê um vetor de cinquenta elementos e exibe
 * , ao final, o menor valor lido.
*/


import javax.swing.JOptionPane;

public class D {

	public static void main (String [] args) {
		
		int n = 5;
		int valores [] = new int[5];
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			
			valores [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		}
		
		for (int i = 0; i < n; i++) {
			
			if(n < menor) {
				
				menor = valores[i];
			}
			
			JOptionPane.showMessageDialog(null, "O menor valor é: " +menor);
			
		}
		
	}
	
	
}
