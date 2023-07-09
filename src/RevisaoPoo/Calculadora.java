package RevisaoPoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> valores = new ArrayList<String>();
		ArrayList<Double> resultado = new ArrayList<Double>();
		double a = 0,c = 0, resultado1;
		int b =0;
		boolean teste; 
		System.out.println("Operação ");
        System.out.println("1- Adição \n" +
                            "2- Subtração \n" +
                            "3- Divisão \n" +
                            "4- Multiplicação \n");
        
        try {
			while (true) {
				teste = true;
				System.out.println("Entre com a Lista de números: ( para sair digite 'Fim')");
				String lista = ler.next();
				
				if(lista.equalsIgnoreCase("fim")) {
					break;
				}
				
				String[] expressao = lista.split(";");
				
				if(expressao.length != 3) {
					System.out.println("Expressão inválida");
					teste = false;
				}
				
				if(teste) {
					try {
					a = Double.parseDouble(expressao[0]);
					b = Integer.parseInt(expressao[1]);
					c = Double.parseDouble(expressao[2]);
					}catch(Exception e) {
						System.out.println("Erro na validação dos valores! ");
						continue;
					}
					switch (b) {
					case 1: 
						resultado1 = a+c;
						resultado.add(resultado1);
						break;
					case 2: 
						resultado1 = a-c;
						resultado.add(resultado1);
						break;
					case 3: 
						resultado1 = a/c;
						resultado.add(resultado1);
						break;
					case 4: 
						resultado1 = a*c;
						resultado.add(resultado1);
						break;
					default:
						System.out.println("Operação Inválida! ");
						continue;
					}
					valores.add(lista);
				}
				
	
			}
			
			System.out.println("Resultado impresso pelo programa: ");
			
			for(int i=0; i<resultado.size(); i++) {
				System.out.println(valores.get(i)+ " = " + resultado.get(i));
			}
			ler.close();
        }catch(Exception erro) {
        	System.out.println("Ocorreu um erro: "+ erro);
        }
	}

}
