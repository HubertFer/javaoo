package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {
	@Override
	public void saca(double valor){
		this.setSaldo(this.getSaldo()-(valor+0.1));
	}
	
	public String getTipo(){
		return "Conta Corrente";
	}
}
