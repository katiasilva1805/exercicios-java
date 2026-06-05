package OBI;

import java.util.Scanner;

public class teleferico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
	int UM,S,soma;
	UM = leia.nextInt();
	S = leia.nextInt();
	soma = UM + S;
	if (soma<50) {
	System.out.println("S");
		}else {
			System.out.println("N");
		}
	
	}
}
