package br.com.fiap.banco;

public class OperacaoInvalidaException extends Exception{
	public OperacaoInvalidaException(String mensagem) {
        super(mensagem);
	}
	
}
