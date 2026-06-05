package OBI;

import java.util.Scanner;

public class positivoNegativoNulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
	int x;
	
	x = leia.nextInt();

	if (x>0) {
	System.out.println("positivo");
	
	}else if(x<0) {
		System.out.println("negativo");
		
	}else {
		System.out.println("nulo");
		
		
	}
	}

}
