package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorV3;

public class Program_Version3 {
	
											
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorV3.circumference(radius); // Chamada de método direto pelo nome da classe, isso é possível por que os métodos são static.
		
		double v = CalculatorV3.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);	
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", CalculatorV3.PI);
		
		
		
		sc.close();

	}
	
	
	
}