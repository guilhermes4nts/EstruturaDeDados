package Fila;

public class Fila<T> implements IFila<T> {

	private No<T> primeiro;
	private No<T> ultimo;
	private No<T> aux;
	private int tamanho;
	
	public Fila(T dado){
		this.primeiro = null;
		this.ultimo = null;
		tamanho = 10;
	}
	
	public void enfileirar(T elemento) throws Exception {
		
		if (filaCheia()) {
			throw new Exception ("Fila Cheia");
		}
			
		No<T> novo = new No<T>();
		novo.dado = elemento;	
		
		//Inserindo elemento no fim da fila
		
		if(this.primeiro == null) {
			// Caso a fila estiver vazia
			primeiro = novo;
			primeiro.ant = null;
			ultimo = novo;
			ultimo.prox = null;
		}else {
			ultimo.prox = novo;
			primeiro.ant = ultimo;
			ultimo = novo;
			ultimo.prox = null;
		}
		this.tamanho++;
	
	}
	
	public void desenfileirar() throws Exception {
		if (filaVazia()) {
			throw new Exception ("Fila Vazia");
		}
		
		// Removendo no inicio da fila
		
		aux = this.primeiro;
		
		if(this.tamanho == 1) {
			// Caso tiver apenas um elemento na fila
			primeiro = null;
			ultimo = null;
		}else {
			primeiro = aux.prox;
		}
		
		this.tamanho--;
		
	}

	@Override
	public boolean filaCheia() {
		if (this.tamanho == 10){
			return true;
		}
		return false;
	}

	@Override
	public boolean filaVazia() {
		if (this.tamanho == 0){
			return true;
		}
		return false;
	}


}
