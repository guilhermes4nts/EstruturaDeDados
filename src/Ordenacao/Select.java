package Ordenacao;

public class Select implements IOrdenacao {
	

	public Integer[] ordenar(Integer[] arr) {
		int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            
            int menorIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[menorIndex]) {
                    menorIndex = j;
                }
            }
            
            int temp = arr[menorIndex];
            arr[menorIndex] = arr[i];
            arr[i] = temp;
        }		
        
        return arr;
	}

}
