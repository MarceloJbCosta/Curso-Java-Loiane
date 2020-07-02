package ExercicioContaBancaria;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Teste conta Bancaria ***");

		ContaBancaria contaSimples = new ContaBancaria();

		contaSimples.setNomeCliente("Cliente conta Simples");
		contaSimples.setNumConta("182377");
		
		
		System.out.println(contaSimples);
		
		contaSimples.depositar(100.00);
		
		realizarSaque(contaSimples, 50);
		
		System.out.println(contaSimples);
		
		System.out.println("*********************************************");
		
		System.out.println("*** Teste conta Poupança ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();

		contaPoupanca.setNomeCliente("Cliente conta Poupanca");
		contaPoupanca.setNumConta("10040722");
		contaPoupanca.setDiaRendimento(19);
		
		System.out.println(contaPoupanca);
		
		contaPoupanca.depositar(100.00);
		
		realizarSaque(contaPoupanca, 50);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Novo rendimento aplicado, novo saldo é R$" + contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de Rendimento");
		}
		
		System.out.println(contaPoupanca);
		
		System.out.println("*********************************************");
		
		System.out.println("*** Teste conta Especial ***");

		ContaEspecial contaEspecial = new ContaEspecial();

		contaEspecial.setNomeCliente("Cliente conta Especial");
		contaEspecial.setNumConta("13002495");
		contaEspecial.setLimite(50);
		
		//System.out.println(contaEspecial);
		
		contaEspecial.depositar(100.00);
		
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 80);
		realizarSaque(contaEspecial, 70);
		
		System.out.println(contaEspecial);


		
	}
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque Efetuado de R$" + valor + " novo saldo R$ " + conta.getSaldo());
		}else {
			System.out.println("Saldo insuficiente.");
		}
		
	}

}
