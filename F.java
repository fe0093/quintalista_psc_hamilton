package quinta_lista_de_exercicios;

/**
 * Crie um programa que recebe as temperaturas m�ximas de cada dia de um m�s (31 dias) 
e as
*  armazene em um vetor. O programa dever� exibir:
* - A menor e a maior temperatura do m�s;
* - A temperatura m�dia mensal;
* - Os dias com a temperatura m�xima menor do que a temperatura m�dia mensal.
*/


import javax.swing.JOptionPane;

public class F {

	public static void main (String [] args) {
		
		float n = 5;
		float temp;
		float maior = 0;
		float menor = Integer.MAX_VALUE;
		float valores [] = new float [31];
		
		for (int i = 0; i < n; i++) {
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a Temperatura"));
			
			temp = valores[i];
			if(temp < menor) {
				menor = temp;
			}
			
			if(temp > maior) {
				maior = temp;
			}
		}
		
		System.out.println("A menor temperatura �: " +menor);
		System.out.println("A maior temperatura �: " +maior);
		
		float acum = 0;
		
		for(int i = 0; i < n; i++) {
			acum = acum + valores[i];
			
		}
		
		float media = acum / n;
		System.out.println("A m�dia mensal �: " +media);
		
		String saida = "Temperatura m�xima menor que a m�dia mensal: ";
		for (int i = 0; i < n; i++) {
			
			if(valores[i] < media) {
				
				saida = saida + valores[i] + "";
			}
			
			System.out.println(saida);
		}
	}
	
}
