package Ordenacao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		
		Integer[] arr = new Integer[10];
		
		System.out.println("Vetor Gerado para Ordenacao: ");
		
		for (int i = 0; i < 10; i++) {
			arr[i] = gerador.nextInt(50);
			System.out.print(arr[i] +" | ");
		}
		System.out.println("");
		System.out.println("\nEscolha um modo de Ordenação: \n"
				+ "1- Select sort \n"
				+ "2- Insertion sort \n");
		int opc = ler.nextInt();
		
		IOrdenacao op = null;
		
		switch (opc) {
		case 1:
			op = new Select();
			break;
		case 2:
			op = new Insertion();
			break;
		default:
			System.out.println("Opcao invalida!!");
			break;
		}
		
		op.ordenar(arr);
		
		System.out.println("Vetor Ordenado");
		System.out.println(Arrays.toString(arr));
		
		ler.close();
	}

}
