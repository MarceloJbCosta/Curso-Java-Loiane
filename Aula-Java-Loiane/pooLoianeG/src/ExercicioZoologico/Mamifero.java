package ExercicioZoologico;

public class Mamifero extends Animal{
	
		@Override
	public String toString() {
		return super.toString() + "\nAlimento: " + alimento ;
	}

		private String alimento;

		public Mamifero() {
			super();
			this.setAmbiente("Terra");
			this.setCor("Castanho");
			this.alimento = "mel";
		}

		public String getAlimento() {
			return alimento;
		}

		public void setAlimento(String alimento) {
			this.alimento = alimento;
		}
}
