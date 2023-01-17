package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159; /* A palavra "final" quer dizer que PI é uma constante e não uma variável, e não vai mudar seu valor. */
											/* O padrão de nomes para constantes no Java é toda em letra maiúscula. */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);	
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", PI);
		
		
		
		sc.close();

	}
	
	public static double circumference(double radius) { /* O primeiro "double" é o tipo que de valor que a função retornará. Já o segundo double é o tipo de argumento (radius) que a função está recebendo. */
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3.0) / 3.0; /* Não precisa de parênteses, pois multiplicação e divisão têm a mesma prioridade, então o cálculo será feito da esquerda para a direita, automaticamente. */
	}
	
}

/* Se eu apagar o "static" dos métodos "circumference" e "volume" o programa dará erro, pois o compilador não deixa eu chamar métodos não estáticos dentro do método "main", que é estático. Só se o método vier de outra classe.*/ 