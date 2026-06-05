package OBI;

import java.util.Scanner;

public class nadadeira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		int P,R;
		
		P = leia.nextInt();
		R = leia.nextInt();
		
		if(P==0) {
			System.out.println("C");
			
		}else if (R==0) {
			System.out.println("B");
			
		}else {
			System.out.println("A");
		}
				
	}

}
