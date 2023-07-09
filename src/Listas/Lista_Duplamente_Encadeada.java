package Listas;

import java.util.Scanner;

public class Lista_Duplamente_Encadeada {
	
	private static class Lista{
		public int num;
		public Lista proximo;
		public Lista anterior;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Lista inicio = null;
		Lista anterior = null;
		Lista fim = null;
		
		int op, num;
		
		
		do {
			getmenu();
			op = ler.nextInt();	
			
			switch (op) {
				case 1 ->{
					System.out.println("Entre com o numero que deseja inserir no inicio da lista: ");
					Lista novo = new Lista();
					novo.num = ler.nextInt();
					
					if(inicio == null) {
						inicio = novo;
						fim = novo;
						fim.proximo = null;
						inicio.anterior = null;
						
					}else {
						
					}
				}
				case 2 ->{
					System.out.println("Entre com o numero que deseja inserir no fim da lista: ");
					num = ler.nextInt();
					
					if(inicio == null) {
						
						
					}else {
						
					}
				}
				case 3 ->{
					
				}
				case 4 ->{
					
				}
				case 5 ->{
					
				}
			
				default ->{
					if(op == 6) {
						System.out.println("PROGRAMA ENCERRADO!!");
						break;
					}else {
						System.out.println("Opcao Invalida!");
					}
				}
				 
			}
			
			
		} while (op != 6);
		
	}

	public static void getmenu() {
		System.out.println("MENU DE OPCOES");
		System.out.println("1- Inserir no inicio da lista");
		System.out.println("2- Inserir no fim da lista");
		System.out.println("3- Consultar toda a lista");
		System.out.println("4- Remover da lista");
		System.out.println("5- Esvaziar da lista");
		System.out.println("6- Sair");
		System.out.println("Entre com a opcao desejada: ");
	}
	
}
