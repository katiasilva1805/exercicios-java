package OBI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exemplo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//Scanner leia = new Scanner(System.in);
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("\nEntre coma a altura do Ogro Alfa:");
		int alturaOgro = Integer.parseInt(br.readLine());
		
		System.out.println("\nQuantos Ogro você encontrou? ");
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("\nEntre com a altura dos ogros: ");
		String linha = br.readLine();
		
		//Lê a linha com a altura dos ogros
		StringTokenizer st = new StringTokenizer(linha);
		int ogrosComidos = 0;

		for (int i=0;i<n;i++) {
			//Lê a altura do próximo ogro da lista
			int alturaOutroOgro = Integer.parseInt(st.nextToken());
			if (alturaOutroOgro <alturaOgro) {
				ogrosComidos++;
				alturaOgro++;
				
			}
		}
	
		System.out.println("\nQuantidade de ogros comidos: "+ogrosComidos);
		
	
	
	}
}

		
	
	
	

