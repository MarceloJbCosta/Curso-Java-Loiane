package Aula52;

public class DivisaoNaoExata extends Exception{
	
	private int num;
	private int denom;
	
	@Override
	public String toString() {
		return "Resultado de "+ num + "/"+ denom + " Não é um inteiro !";
	}

	public DivisaoNaoExata(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}
	

}
