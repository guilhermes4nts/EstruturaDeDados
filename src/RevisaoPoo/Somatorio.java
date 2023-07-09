package RevisaoPoo;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		int n = ler.nextInt();
		
		System.out.println("Resultado: " + Soma(n));
		ler.close();
	}
	
	
	public static int Soma(int n ) {
		if(n == 0) {
			return 0;
		}
		return n + (Soma(n - 1));
	}
	
}
