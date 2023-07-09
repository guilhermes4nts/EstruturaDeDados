package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista_Sequencial1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int[] vetorn = new int[10];
		ArrayList<Integer> locs = new ArrayList<Integer>(); 
		String elemento = null;
		int num;
		int opc;
		int aux;
		int contEl = 0;
		int contLoc = 0;
		int indice = 0;
		int loc;
		int delet;
		boolean teste = true;
		
		do {
			Menu();
			opc = ler.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("Obs: O tamano máximo da lista é 10 elementos");
				System.out.println("Obs2: Caso deseje sair antes de preencher"
								+ " completamente a lista digite 'sair'");
				for (int i = 0; i < vetor.length; i++) {
					System.out.println("Entre com o "+(1+i)+"º Elemento da lista");
					elemento = ler.next();
					if(elemento.equalsIgnoreCase("sair")) {
						break;
					}else {
						 vetor[i] = Integer.parseInt(elemento);
						 contEl++;
					}
					
				}
				System.out.println(contEl+" | "+vetor.length);
				break;
			case 2: 
				System.out.println("Obs: Caso a Lista esteja cheia o primeiro"
						+ " elemento será substituido!");
				System.out.println("Entre com número que deseja adicionar: ");
				num = ler.nextInt();
				if(contEl == vetor.length) {
					vetor[0] = num;
				}else {
					aux = vetor[0];
					vetor[contEl] = aux;
					vetor[0] = num;
					contEl++;
				}
				break;
			case 3: 
				System.out.println("Obs: Caso a lista esteja cheia o ultimo"
						+ " elemento será substituido!");
				System.out.println("Entre com número que deseja adicionar: ");
				num = ler.nextInt();
				if(contEl == vetor.length) {
					vetor[9] = num;
				}else {
					vetor[contEl] = num;
					contEl++;
				}
				break;
			case 4: 
				if(contEl > 0) {
					System.out.println("Digite o elemento que deseja localizar na lista: ");
					loc = ler.nextInt();
					for (int i = 0; i < contEl; i++) {
						if(vetor[i] == loc) {
							locs.add(i);
							contLoc++;
						}
					}
					if (contLoc > 0) {
						System.out.print("Posicao(oes) do elemento "+loc+" na lista: ");
						for (int i = 0; i < locs.size(); i++) {
							System.out.print(locs.get(i)+ " | ");
						}
						System.out.println(" ");
						contLoc = 0;
						locs.clear();
					} else {
						System.out.println("Nao existe nenhum elemento "+loc+" na lista");
					}
				}else {
					System.out.println("Lista Vazia!");
				}
				break;
				
			case 5: 
				if(contEl > 0){
					System.out.println("Entre com o elemento que deseja excluir da lista: ");
					delet = ler.nextInt();
					if(teste == true) {
						for (int i = 0; i < contEl; i++) {
							if(vetor[i] != delet) {
								vetorn[indice] = vetor[i];
								indice++;
							}
						}
						teste = false;
						contEl = indice;
						indice = 0;
					}else {
						for (int i = 0; i < contEl; i++) {
							if(vetorn[i] != delet) {
								vetor[indice] = vetorn[i];
								indice++;
							}
						}
						teste = true;
						contEl = indice;
						indice = 0;
					}
					
				}else {
					System.out.println("Lista Vazia!");
				}
				break;
			case 6:
				if(contEl >0) {
					if(teste) {
						for (int i = 0; i < contEl; i++) {
							System.out.print(vetor[i]+" | ");
						}
						System.out.println(" ");
					}else {
						for (int i = 0; i < contEl; i++) {
							System.out.print(vetorn[i]+" | ");
						}
						System.out.println(" ");
					}
				}else {
					System.out.println("Lista Vazia!");
				}
				
				break;
				
			default:
				if(opc ==7) {
					System.out.println("Programa Encerrado");
				}else {
					System.out.println("Opcao Invalida!");
				}
				break;
			}
			
		} while (opc != 7);
		
							
		ler.close();
	}
	
	public static void Menu() {
		System.out.println("Menu de Opcoes");
		System.out.println("1- Inicializar lista");
		System.out.println("2- Incluir um elemento no inicio");
		System.out.println("3- Incluir um elemento no fim");
		System.out.println("4- Localizar um elemento da Lista");
		System.out.println("5- Excluir um elemento da Lista ");
		System.out.println("6- Listar");
		System.out.println("7- Sair");
		System.out.println("Entre com a opcao desejada: ");

	}
	
}
