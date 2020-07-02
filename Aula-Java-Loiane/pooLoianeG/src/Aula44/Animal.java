package Aula44;

public abstract class Animal {
	
	private String nome;
	
	public abstract void emitirSom();
	//metodo abstrato emitir som ..cada classe terar seu metodo.

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
