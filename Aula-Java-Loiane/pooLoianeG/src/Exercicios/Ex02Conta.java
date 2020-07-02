package Exercicios;

public class Ex02Conta {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo Atual R$ " + conta.saldo);
		}else {
			System.out.println("Nao foi possivel realizar saque., saldo insuficiente");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentatica de saque 500");
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo Atual R$ " + conta.saldo);
		}else {
			System.out.println("Nao foi possivel realizar saque., saldo insuficiente");
		}
		
		System.out.println("Deposito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial");
		}else {
			System.out.println("nao esta usando cheque especial");
		}
		
		
		
		
	}

}
