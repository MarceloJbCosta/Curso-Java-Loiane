package Aula63;

public class ExemploPrintF {

	public static void main(String[] args) {
			
		System.out.printf("Essa é uma String %s", "Olá Mundo");
		System.out.println();
		System.out.printf("%S","Passando para maiusculo" );
		System.out.println();
		
		System.out.printf("%c", 'c');//caracter Minusculo
		System.out.println();
		System.out.printf("%C", 'c'); //Caracter maiusculo
		System.out.printf("%n");//pular linha
		
		int valor = 123456789;
		System.out.printf("%d", valor);
		System.out.printf("%n");
		
		double pontoFlutuante = 3.45687;
		System.out.printf("%f", pontoFlutuante);
		System.out.println();
		
		String olaMundo = "Ola Mundo";
		System.out.printf("%20s", olaMundo);//coloca 20 espacoes antes da String
		System.out.println();
		System.out.printf("%-20s", olaMundo);//vai colocar 20 espacoes deposi da String
		System.out.println();
		
		System.out.printf("%015d", valor); // vai usar 15casas decimais e que faltar vai completar com zero
		System.out.println();
		
		System.out.printf("%,d", valor);
		System.out.println();
		
		int valor2 = -123456789;
		
		System.out.printf("% d", valor2);//o espaco vai informar o sinal do numero se e negativo ou positivo
		
		System.out.println();
		
		System.out.printf("%.3f", pontoFlutuante);
		
		System.out.printf("R$%10.2f", pontoFlutuante);
		//vai usar o R$, 10 espacos vazios e 2 casas decimais apos a virgula
		
		System.out.println();
		
		testeMaisCompleto();
		
			
	}
	
	private static void testeMaisCompleto() {
		double[] precos = {1000, 123.54, 784.546, 1, 4.6594};
		
		for(int i = 0; i< precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "item", i+1, precos[i]);
		}
		
		
		//java.util.formater
	}

}
