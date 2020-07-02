package ExercicioException;

public class contatoNaoExisteException extends Exception {
	
		private String nomeContato;

		public contatoNaoExisteException(String nomeContato) {
			super();
			this.nomeContato = nomeContato;
		}
		
		
	 @Override
	public String getMessage() {
	return "Contato " + nomeContato + " Não existe na agenda";
	}

}
