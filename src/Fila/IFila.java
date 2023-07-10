package Fila;

public interface IFila<T> {
	public void enfileirar(T elemento) throws Exception;
	public void desenfileirar() throws Exception;
	public boolean filaCheia();
	public boolean filaVazia();
}
