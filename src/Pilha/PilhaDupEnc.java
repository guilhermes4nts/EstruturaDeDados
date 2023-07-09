package Pilha;

public class PilhaDupEnc<T> implements IPilha<T> {

    private No<T> primeiro;
    private No<T> ultimo;
    private No<T> aux;
    private int tamanho;

    public PilhaDupEnc(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 10;
    }

    public void empilhar(T elemento) throws Exception{

        if (this.tamanho > 10){
            throw new Exception("Pilha Cheia");
        }

        No<T> novo = new No<T>();
        novo.dado = elemento;

        // adicionando no fim da pilha

        if (primeiro == null){
            // caso a pilha esteja vazia
            primeiro = novo;
            primeiro.ant = null;
            ultimo = novo;
            ultimo.prox = null;
        }else{
            primeiro.ant = ultimo;
            ultimo = novo;
            ultimo.prox = null;
        }
        this.tamanho++;
    }

    public void desempilhar() throws Exception{
        if (this.tamanho == 0){
            throw new Exception("Pilha Vazia!!");
        }

        aux = this.ultimo;

        //removendo no fim da pilha

        if(this.tamanho == 1){
            // caso tenha apenas 1 elemento na pilha
            primeiro = null;
            ultimo = null;
        }else {
            ultimo = aux.ant;
            ultimo.prox = null;
        }
        this.tamanho--;
    }


}
