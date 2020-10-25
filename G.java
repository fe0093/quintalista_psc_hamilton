package quinta_lista_de_exercicios;

/**
 Faça um programa que exibe a média entre o maior e o menor valor de um vetor de inteiros, com
duzentos elementos dados pelo usuário, e também exibe apenas os elementos que são maiores que a
média.
 */


import javax.swing.JOptionPane;

public class G {

	public static void main (String [] args) {
		
		int n = 5;
		int valor;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int valores [] = new int [200];
		
		for (int i = 0; i< n; i++) {
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os Valores"));
			
			valor = valores[i];
			
			if (valor < menor) {
				
				menor = valor;
			}
			
			if (valor > maior) {
				
				maior = valor;
			}
		}
		
		System.out.println("O menor valor é: " +menor);
		System.out.println("O maior valor é: " +maior);
		
		
		int acum = 0;
		for (int i = 0; i < n; i++) {
			
			acum = maior + menor;
			
		}
		
		int media = acum / n;
		System.out.println("A média entre o maior e o menor é: " +media);
		
		String saida = "Os valores maior que a média são: ";
		for (int i = 0; i < n; i++) {
			
			if(valores[i] > media) {
				saida = valores[i] + "";
				
			}
			
			System.out.println(saida);
			
		}
		
		
	}
	
}
