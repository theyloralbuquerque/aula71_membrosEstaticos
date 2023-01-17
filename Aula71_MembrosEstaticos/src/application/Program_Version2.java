package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorV2;

public class Program_Version2 {
	
											
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CalculatorV2 calc = new CalculatorV2();   // Instancia��o obrigat�ria, pois na classe utilit�ria n�o tem o static nos m�todos.
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);	
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", calc.PI);
		
		
		
		sc.close();

	}
	
	
	
}