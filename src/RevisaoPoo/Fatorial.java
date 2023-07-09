package RevisaoPoo;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Entre com um número: ");
			int fat = ler.nextInt();
			
			System.out.println("Resultado: " + fator(fat) );
		}
		
	}

	public static int fator(int fat) {
		if(fat == 0) {
			return 1;
		}
		else if(fat == 1) {
			return 1;
		}
			return fat* fator(fat-1);
		
	}
		
}
