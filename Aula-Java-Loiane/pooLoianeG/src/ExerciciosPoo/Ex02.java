package ExerciciosPoo;

import ExerciciosPoo.ContaCorrente02;

public class Ex02 {

	public static void main(String[] args) {
		
		ContaCorrente02 conta = new ContaCorrente02();
		/*Quando encapsulamos nao da pra acesssar diretamente o metodo
		 * temos que usar o set... e o get
		 * 
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		*/
		conta.setNumero("18237-7");
		conta.setAgencia("8251");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		//conta.setValorEspecialUsado(valorEspecialUsado);
		conta.setSaldo(-10);
		
		
		System.out.println("Saldo conta "+ conta.getNumero() + " = " + conta.getSaldo());
		System.out.println("Numero Agencia: "+ conta.getAgencia() + " Numero conta: " + conta.getNumero());
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo Atual R$ " + conta.getSaldo());
		}else {
			System.out.println("Nao foi possivel realizar saque., saldo insuficiente");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentatica de saque 500");
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo Atual R$ " + conta.getSaldo());
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


