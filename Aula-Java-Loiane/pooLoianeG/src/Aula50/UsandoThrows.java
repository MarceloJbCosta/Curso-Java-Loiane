package Aula50;

import java.util.Locale;
import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.println("Entro um numero decimal: ");
		
		try {
			double num = leNumero();
			System.out.println("Voce digitou "+ num);
		} catch (Exception e) {
			System.out.println("entrada invalida");
			e.printStackTrace();
		}
		

	}
	public static double leNumero()throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
		
	}

}
