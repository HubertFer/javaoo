package br.com.caelum.contas.modelo;

public abstract class Conta {
	protected double saldo;
	protected String titular;
	protected int numero;
	protected String agencia;
	
	
	public void saca(double valor){
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou sacar" + " um valor negativo");
		}else{
			this.saldo -= valor;
		}
	
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void deposita(double valor){
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public String saldo() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract String getTipo();
	
	public void transfere(double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
}
