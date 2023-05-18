package br.com.fiap.banco;

public class App {

	public static void main(String[] args) {
		Conta conta = new Conta("00123-5");
		ContaPoupanca contaPoupanca = new ContaPoupanca("000124-5", 0.08);

		try {
			conta.depositar(100.0);
			conta.sacar(50.0);

			contaPoupanca.depositar(200.0);
			contaPoupanca.sacar(150.0);
		} catch (ValorInvalidoException | SaldoInsuficienteException | OperacaoInvalidaException e) {
			System.out.println("Ocorreu um erro durante a operação: " + e.getMessage());
		}
	}

}
