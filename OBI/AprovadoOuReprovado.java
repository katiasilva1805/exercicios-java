package OBI;

import java.util.Scanner;

public class AprovadoOuReprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia = new Scanner(System.in);
	float UM,B,soma,media;
	
	UM = leia.nextFloat();
	B = leia.nextFloat();
	soma = (UM+B);
	media = soma/2;
	 if( media>7) {
	 System.out.println("Aprovado");
	}else if (media >=4) {
	 System.out.println("Recuperação");
	}else {
		System.out.println("Reprovado");
	}
		
	}

}
