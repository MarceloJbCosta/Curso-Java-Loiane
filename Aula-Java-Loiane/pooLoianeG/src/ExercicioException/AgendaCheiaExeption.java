package ExercicioException;

public class AgendaCheiaExeption extends Exception{

	@Override
	public String getMessage() {
		return "Agenda ja esta Cheia!";
	}
}
