package quinta_lista_de_exercicios;

/**
 Fa�a um programa que exibe a m�dia entre o maior e o menor valor de um vetor de inteiros, com
duzentos elementos dados pelo usu�rio, e tamb�m exibe apenas os elementos que s�o maiores que a
m�dia.
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
		
		System.out.println("O menor valor �: " +menor);
		System.out.println("O maior valor �: " +maior);
		
		
		int acum = 0;
		for (int i = 0; i < n; i++) {
			
			acum = maior + menor;
			
		}
		
		int media = acum / n;
		System.out.println("A m�dia entre o maior e o menor �: " +media);
		
		String saida = "Os valores maior que a m�dia s�o: ";
		for (int i = 0; i < n; i++) {
			
			if(valores[i] > media) {
				saida = valores[i] + "";
				
			}
			
			System.out.println(saida);
			
		}
		
		
	}
	
}
