package OBI;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o número de candidatos: ");
		 int n= leia.nextInt();
		 System.out.println("\nEntre com número de vagas: ");
		 int m= leia.nextInt();
		 
		 int[] notas = new int[n];
		 for (int i =0;i<n;i++) {
			 System.out.println("\nEntre com a nota do candidato: ");
			 notas [i] =leia.nextInt();
		 }
		 //Criar uma copia do array original para ordenar sem sobrescrever o original
		 int [] notasOrdenadas = new int [n];
		 
		 for (int i =0;i<n;i++) {
			 notasOrdenadas [i] = notas[i];
			 
		 }
		 Arrays.sort(notasOrdenadas);
		 int notaCorte = notasOrdenadas[n-m];
		 int classificados=0;
		 
		 for (int i =0;i<n;i++) {
			 if (notas[i]>=notaCorte) {
				 classificados++;
			 }
		 }
		 
		 System.out.println("\nClassificados: "+classificados);
		 
		 leia.close();
		

	}

}
