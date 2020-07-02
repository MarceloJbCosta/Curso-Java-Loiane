package ExercicioZoologico;

public class Teste {

	public static void main(String[] args) {
		
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setCor("Amarelo");
		//camelo.setNumeroPatas(4);
		camelo.setComprimento(150);
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		
		//System.out.println("----------------------");
		//System.out.println(camelo);
		
		Animal tubarao = new Peixe();
		
		tubarao.setNome("Tubarao-Cabeça-Chata");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		//System.out.println("----------------------");
		//System.out.println(tubarao);
		
		Mamifero urso = new Mamifero();
		
		urso.setNome("Usro-do-canada");
		urso.setComprimento(180);
		urso.setVelocidade(0.5);
		urso.setCor("Vermelho");
		
		//System.out.println("----------------------");
		//System.out.println(urso);
		
		Animal[] animais = new Animal[3];
		
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		
		
		for(Animal c : animais) {
			System.out.println("----------------------");
			System.out.println(c.toString());
		}

	}

}
