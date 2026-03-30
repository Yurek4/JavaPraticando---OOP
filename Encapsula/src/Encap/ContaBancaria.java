package Encap;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public String getTitular() {
		return titular;
	
	}
	public void  setTitular(String novoNome) {	
		titular = novoNome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double novoSaldo) {
		saldo = novoSaldo;
	}
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
}

