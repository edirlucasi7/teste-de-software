package tdd;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
	
	private String nome;
	private int saldoInicial;
	private int saldo;
	private List<Deposito> depositos = new ArrayList<Deposito>();
	
	public ContaCorrente() { }
	
	public ContaCorrente(int saldo) {
		this.saldo = saldo;
	}
	
	public ContaCorrente(String nome) {
		this.nome = nome;
	}
	
	public ContaCorrente(String nome, int saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void creditar(Deposito deposito) {
		this.saldoInicial = getSaldo();
		this.saldo += deposito.valor();
		this.depositos.add(deposito);
	}

	public void limpa() {
		this.nome = "";
		this.saldo = 0;
		this.saldoInicial = 0;
	}
	
	public String extrato() {
		return "Conta de " + getNome() + "\n" +
				"Saldo Inicial $" + getSaldoInicial() + "\n" +
				"Saldo Final $" + getSaldo() + "\n" +
				retornaListaDeDepositos() + "\n";
	}
	
	public String retornaListaDeDepositos() {
		if(this.depositos.size() == 0) {
			return "Nenhuma trasacao realizada";
		}
		return getDepositos().toString().replace(", ", "\n");
	}
	
	public int getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(int saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public int getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Deposito> getDepositos() {
		return depositos;
	}

	public void setDepositos(List<Deposito> depositos) {
		this.depositos = depositos;
	}
	
}
