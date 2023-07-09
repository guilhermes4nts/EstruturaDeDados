package Listas;

import java.util.Scanner;

public class Lista_Encadeada {
	
	private static class LISTA{
		public int num;
		public LISTA proximo;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		LISTA inicio = null;
		LISTA fim = null;
		LISTA aux;
		LISTA anterior;
		
		int op, numero, achou;
		
		do {
			System.out.println("MENU DE OPCOES");
			System.out.println("1- Inserir no inicio da lista");
			System.out.println("2- Inserir no fim da lista");
			System.out.println("3- Consultar toda a lista");
			System.out.println("4- Remover da lista");
			System.out.println("5- Esvaziar da lista");
			System.out.println("6- Sair");
			System.out.println("Entre com a opcao desejada: ");
			op = ler.nextInt();				
			
			if(op < 1 || op >6) {
				System.out.println("OPCAO INVALIDA!!");
			}else {
				switch (op) {
				case 1 ->{
					System.out.println("Digite o numero a ser inserido no inicio lista: ");
					LISTA novo = new LISTA();
					novo.num = ler.nextInt();
					
					if (inicio == null) {
						
						inicio = novo;
						fim = novo;
						novo.proximo = null;
						
					} else {
						novo.proximo = inicio;
						inicio = novo;
					}
				}
				case 2 ->{
					System.out.println("Digite o numero a ser inserido no fim lista: ");
					LISTA novo = new LISTA();
					novo.num = ler.nextInt();
					
					if (inicio == null) {
						inicio = novo;
						fim = novo;
						novo.proximo = null;
					} else {
						fim.proximo = novo;
						fim = novo;
						fim.proximo = null;
					}
					
				}
				case 3 -> {
					if (inicio == null) {
						System.out.println("Lista Vazia");
					} else {
						System.out.println("Consultando a lista");
						aux = inicio;
						while (aux != null) {
							System.out.print(aux.num+"  ");
							aux = aux.proximo;
						}
					}
					System.out.println("");
				}
				case 4 ->{
					if(inicio == null ) {
						System.out.println("Lista Vazia");
					}else {
						System.out.println("Digite o elemento a ser removido: ");
						numero = ler.nextInt();
						
						achou = 0;
						anterior = null;
						aux = inicio;
						
						while (aux != null) {
							if(aux.num == numero) {
								achou++;
								if(aux == inicio){
									inicio = aux.proximo;
									aux = inicio;
								}else if(aux == fim) {
									anterior.proximo = null;
									fim = anterior;
									aux = null;
								}else {
									anterior.proximo = aux.proximo;
									aux = aux.proximo;
								}
								
								
							}else {
								anterior = aux;
								aux = aux.proximo;
							}
							
						}
						
						if(achou == 0) {
							System.out.println("Numero nao encontrado");
						}else if(achou == 1) {
							System.out.println("Numero foi removido 1 vez");
						}else {
							System.out.println("Numero removido "+achou+" vezes");
						}
						
					}
				}
				case 5 ->{
					if( inicio == null) {
						System.out.println("Lista Vazia");
					}else {
						inicio = null;
						System.out.println("Lista esvaziada");
					}
				}
				}
			}
			
		} while (op != 6);
		
		ler.close();
	}

}
