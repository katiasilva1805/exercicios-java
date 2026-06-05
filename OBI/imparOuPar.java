package OBI;

import java.util.Scanner;

public class imparOuPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
	int UM,B,soma;
	
	UM = leia.nextInt();
	B = leia.nextInt();
	
	soma =  UM+B;
	
	if (soma% 2==0) {
	System.out.println("Bino");
	}else {
		System.out.println("Cino");
		
	}
	}
	
	}

