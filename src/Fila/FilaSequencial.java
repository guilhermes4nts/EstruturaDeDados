package Fila;

public class FilaSequencial<T> implements IFila<T> {

    private T[] fila;
    private int inicio;
    private int fim;

    public FilaSequencial(Class infoCategoria, int tamanho){
        fila = (T[]) java.lang.reflect.Array.newInstance(infoCategoria, tamanho);
        this.inicio = (this.fila.length - 1);
        this.fim = this.inicio;
    }

    public void enfileirar(T elemento) throws Exception {
        if (this.fila[fim] != null){
            throw new Exception("Fila Cheia!!");
        }
        this.fila[this.fim] = elemento;
        this.fim = ( (this.fim - 1) + fila.length ) % fila.length;
    }

    public void desenfileirar() throws Exception {
        if (this.fila[inicio] == null){
            throw new Exception("Fila Vazia!!");
        }

        this.fila[inicio] = null;
        this.inicio = ( (this.inicio - 1) + this.fila.length) % this.fila.length;
    }
}
