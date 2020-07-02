package Exercicios;

public class ContaCorrente {

		String numero;
		String agencia;
		boolean especial;
		double limiteEspecial;
		double valorEspecialUsado;
		double saldo;
		
		
		boolean realizarSaque(double quantiaASacar) {
			
			//tem saldo na conta
			if(saldo >= quantiaASacar) {
				saldo -= quantiaASacar;
				return true;				
			}else {//nao tem saldo na conta
				if(especial) {
					//verificar se o lime especial tem saldo
					double limite = limiteEspecial + saldo;
					if(limite >= quantiaASacar) {
						saldo -= quantiaASacar; 
						return true;
					}else {
						return false;
					}				
				}else {
					return false;//nao especial e nao tem saldo
				}
			}
			
		}
		
		void depositar(double valorDepositado) {
			saldo += valorDepositado;
		}
		
		void consultarSaldo() {
			System.out.println("Saldo Atual R$ " + saldo);
		}
		
		boolean verificarUsoChequeEspecial() {
			return saldo < 0;
			
		}
		
		
}
