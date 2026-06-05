package OBI;

import java.util.Scanner;

public class gangorra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
	
	int P1,C1,P2,C2,ladoEsquerdo,ladoDireito;
	P1 = leia.nextInt();
	C1 = leia.nextInt();
	P2 = leia.nextInt();
	C2 = leia.nextInt();
	
	ladoEsquerdo =P1*C1;
	ladoDireito = P2*C2;
	
	if(ladoEsquerdo== ladoDireito) {
	System.out.println("0");
	
	}else if (ladoEsquerdo> ladoDireito){
		System.out.println("-1");
	}else {
		System.out.println("1");
		
	}
	leia.close();
	}


}
