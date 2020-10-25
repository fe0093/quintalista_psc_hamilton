package quinta_lista_de_exercicios;

/** Faça um programa que preenche um vetor com cem inteiros e, ao final, exibe o vetor em ordem
contrária.
**/

import javax.swing.JOptionPane;

public class B {

	public static void main (String [] args) {
		
		
		int [] vetor = new int [100];
		String msg = "";
		
		for(int i = 0; i < vetor.length; i++) {
			
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		}
		
		for (int i = vetor.length-1; i >= 0; i--) {
			
			msg = msg + "vetor["+i+"] = "+ vetor[i]+"\n";
			
		}
		
		JOptionPane.showMessageDialog(null,msg);
		
	}
}
