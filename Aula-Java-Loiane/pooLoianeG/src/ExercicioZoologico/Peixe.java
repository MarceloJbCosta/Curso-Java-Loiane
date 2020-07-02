package ExercicioZoologico;

public class Peixe extends Animal {
	
	private String caracteristica;
	
	public Peixe() {
		super();
		this.setNumeroPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.setCaracteristica("Barbatanas e cauda");
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCaracteristica: " + caracteristica ;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	
	
}
