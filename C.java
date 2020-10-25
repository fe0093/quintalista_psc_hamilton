package quinta_lista_de_exercicios;

/** Faça um programa que preenche um vetor com cinquenta elementos inteiros e altera todo valor
negativo para seu oposto positivo, ao final o programa deve exibir o vetor já modificado.
**/


import javax.swing.JOptionPane;

public class C {

	public static void main (String [] args) {
	
		int [] vetor = new int [50];
		String msg = "";
		
		for(int i = 0; i < vetor.length; i++) {
		
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor Inteiro"));
			
		}
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i]<0) {
				
				vetor[i] = vetor[i]*-1;
				msg = msg + "vetor["+i+"] = "+ vetor[i]+"\n";
			}
			
			else {
				
				msg = msg + "vetor["+i+"] = "+ vetor[i]+"\n";
			}
		}
		
		JOptionPane.showMessageDialog(null,msg);
		
	}
	
}


/** Outra Resolução mais simples

		int n = 5;
		int valores [] = new int [50];
		
		for (int i = 0; i < n; i++) {
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores"));
			
			if (valores [i] <0) {
				
				valores [i] = valores[i]*-1;
			}
			
			System.out.println("Final: " +valores[i]);
			
		}
		

**/