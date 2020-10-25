package quinta_lista_de_exercicios;

import javax.swing.JOptionPane;

/** Construa um programa que lê um vetor de números reais com quinze elementos 
 * e zera todos os valores negativos. 
 * No final, o programa deve apresentar todos os elementos do vetor.
 */

public class E {

	public static void main (String [] args) {

		double n = 5;
		double valores [] = new double [15];
		
		for (int i = 0; i < n; i++) {
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores"));
			
			if (valores [i] <0) {
				
				valores [i] = 0;
			}
			
			System.out.println("Final: " +valores[i]);
			
		}
		
	}	
}		




/**		
		int valores [] = new int[5];
		String msg = "";
		
		for (int i = 0; i < valores.length; i++) {
			
			valores [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		}
		
		
		for (int i = 0; i < valores.length; i++) {
			
			if (valores [i] < 0) {
			
				valores[i] = valores[i]*0;
				msg = msg + "valores["+i+"] = "+ valores[i]+"\n";
			}
			
			else {
				
				msg = msg + "valores["+i+"] = "+ valores[i]+"\n";
			}
		
			}
	
		JOptionPane.showMessageDialog(null, "Os elementos do vetor são: " +valores);
		
	}	
}
**/
