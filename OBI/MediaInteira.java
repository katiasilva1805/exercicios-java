package OBI;

import java.util.Scanner;

public class MediaInteira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
	int A,B,soma, media;
	 
	A = leia.nextInt();
	B = leia.nextInt();
	
	soma = A+B;
	media = (A+B)/2;
	
	
	System.out.println(media);
	
	
	}

}
