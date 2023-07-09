package RevisaoPoo;

public class Pares {

	public static void main(String[] args) {
		int[] v = {0,1,2,3,4,5,6,7,8,9,10};
		int contagemPares = contarPares(v, 0, 0);
		System.out.println("Número de pares no vetor: " + contagemPares);

	}
	
	public static int contarPares(int[] v, int indiceAtual, int contagemPares) {
	    if (indiceAtual == v.length) {
	        return contagemPares;
	    }
	    if (v[indiceAtual] % 2 == 0) {
	        contagemPares++;
	    }
	    return contarPares(v, indiceAtual + 1, contagemPares);
	}





	

}
