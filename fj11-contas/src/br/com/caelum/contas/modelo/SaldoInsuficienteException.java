package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException{
	public SaldoInsuficienteException(){
		super();
	}
	public SaldoInsuficienteException(String m){
		super(m);
	}
	public SaldoInsuficienteException(Throwable t){
		super(t);
	}
	public SaldoInsuficienteException(String m, Throwable t){
		super(m,t);
	}
}
