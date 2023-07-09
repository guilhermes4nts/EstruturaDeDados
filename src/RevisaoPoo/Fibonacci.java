package RevisaoPoo;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1 = -1;
		int n2 = 1;
		int n3 = n1 + n2;
		
			while(n3 < 5000) {
				System.out.print(n3 + " | ");
				n1 = n2;
				n2 = n3;
				n3 = n1 + n2;
			}
		
	}

}
