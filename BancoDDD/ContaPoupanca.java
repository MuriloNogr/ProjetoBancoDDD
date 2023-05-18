package br.com.fiap.banco;

public class ContaPoupanca extends Conta {
	private double taxa;
	private double saldo;
	
	public ContaPoupanca(String numero, double taxa) {
		super(numero);
		this.taxa = taxa;
	}


	public double getTaxa() {
		return taxa;
	}
	
	
	@Override
    public void sacar(Double valor) throws OperacaoInvalidaException {
        throw new OperacaoInvalidaException("Operação invalida");	
	}


	public double getSaldo() {
		return saldo;
	}
}
