package br.com.fiap.banco;

public class Conta {
	private String numero;
	private double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
	}
	
//	public void depositar(double valor) {
//		saldo += valor;
//	}
//	
//	public void sacar(double valor) {
//		saldo -= valor;
//	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(Double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de depósito inválido: " + valor);
        }
        saldo += valor;
    }

    public void sacar(Double valor) throws SaldoInsuficienteException, OperacaoInvalidaException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque: " + valor);
        }
        saldo -= valor;
    }
	
}
