package quinta_lista_de_exercicios;

/**
 * Faça um programa que lê uma string sem espaços e a exibe ao contrário.
 */

import javax.swing.JOptionPane;

public class I {

	public static void main (String [] args) {
		
		int [] entrada = new int [50];
		String saida = null;
		String saidaFinal = null;
		
		for(int i = 0; i < entrada.length; i++) {
		entrada [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite as letras"));
		}		
		
		for (int i = entrada.length-1; i >= 0; i--) {
			
			saida = saida + "entrada["+i+"] = "+ entrada[i];
			saidaFinal = saida.replaceAll("\s+", "");
		}
		
		JOptionPane.showMessageDialog(null,saidaFinal);
		
		
	}
	
	
}
