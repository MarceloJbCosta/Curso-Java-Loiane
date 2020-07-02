package ExercicioImpostoRenda;

public class Teste {

	public static void main(String[] args) {
		
		PessoaJuridica pj1 = new PessoaJuridica();
		
		pj1.setNome("14Bis auto tintas");
		pj1.setCnpj("12.258.911/0001-00");
		pj1.setRendaBruta(65000.00);
		//System.out.println(pj1);
		
		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setNome("Eldorado Tintas");
		pj2.setRendaBruta(387595.);
		pj2.setCnpj("54.479.428/0001-98");
		
		PessoaJuridica pj3 = new PessoaJuridica();
		pj3.setNome("Geramais");
		pj3.setRendaBruta(15983);
		pj3.setCnpj("59.022.873/0001-48");
		
		
		//Pessoa Fisica
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("marcelo costa");
		pf1.setRendaBruta(5000);
		pf1.setCpf("685.435.280-03");
		
		
		PessoaFisica pf2 = new PessoaFisica();
		pf2.setNome("Juliana Costa");
		pf2.setRendaBruta(2000);
		pf2.setCpf("822.360.250-41");
		
		
		PessoaFisica pf3 = new PessoaFisica();
		pf3.setNome("Joao Marcelo");
		pf3.setRendaBruta(3700);
		pf3.setCpf("020.923.230-75");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		
		contribuintes[0] = pf1;
		contribuintes[1] = pf2;
		contribuintes[2] = pf3;
		contribuintes[3] = pj1;
		contribuintes[4] = pj2;
		contribuintes[5] = pj3;
			
		for(Contribuinte c :contribuintes) {
			System.out.println(c.toString());
		}
	}

}
