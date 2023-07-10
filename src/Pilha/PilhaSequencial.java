package Pilha;

public class PilhaSequencial<T> implements IPilha<T> {

    private T[] pilha;
    private int inicio;
    private int fim;

    public PilhaSequencial(int tamanho){
        this.pilha = (T[]) new Object[tamanho];
        this.fim = 0;
    }

    @Override
    public void empilhar(T elemento) throws Exception {
        if (this.fim == pilha.length){
            throw new Exception("Pilha Cheia!!");
        }

        pilha[this.fim] = elemento;
        this.fim++;
    }

    @Override
    public void desempilhar() throws Exception {
        if (this.pilha[0] == null){
            throw new Exception("Lista Vazia");
        }

        pilha[fim] = null;
        this.fim--;
    }
}
