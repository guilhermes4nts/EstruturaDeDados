package Fila;

public class FilaSequencial<T> implements IFila<T> {

    private T[] fila;
    private int inicio;
    private int fim;

    public FilaSequencial(int tamanho){
        this.fila = (T[]) new Object[tamanho];
        this.inicio = (this.fila.length - 1);
        this.fim = this.inicio;
    }

    public void enfileirar(T elemento) throws Exception {
        if (filaCheia()){
            throw new Exception("Fila Cheia!!");
        }
        this.fila[this.fim] = elemento;
        this.fim = ( (this.fim - 1) + fila.length ) % fila.length;
    }

    public void desenfileirar() throws Exception {
        if (filaVazia()){
            throw new Exception("Fila Vazia!!");
        }

        this.fila[inicio] = null;
        this.inicio = ( (this.inicio - 1) + this.fila.length) % this.fila.length;
    }

    public boolean filaCheia(){
        if(this.fila[fim] != null){
            return true;
        }
        return false;
    }

    public boolean filaVazia(){
        if(this.fila[inicio] == null){
            return true;
        }
        return false;
    }
}
