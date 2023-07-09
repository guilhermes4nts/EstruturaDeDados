package Pilha;

public interface IPilha<T> {
    public void empilhar(T elemento) throws Exception;
    public void desempilhar() throws Exception;

}
