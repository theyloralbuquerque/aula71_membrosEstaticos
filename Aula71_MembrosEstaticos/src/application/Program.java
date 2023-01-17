package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159; /* A palavra "final" quer dizer que PI � uma constante e n�o uma vari�vel, e n�o vai mudar seu valor. */
											/* O padr�o de nomes para constantes no Java � toda em letra mai�scula. */
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
	
	public static double circumference(double radius) { /* O primeiro "double" � o tipo que de valor que a fun��o retornar�. J� o segundo double � o tipo de argumento (radius) que a fun��o est� recebendo. */
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3.0) / 3.0; /* N�o precisa de par�nteses, pois multiplica��o e divis�o t�m a mesma prioridade, ent�o o c�lculo ser� feito da esquerda para a direita, automaticamente. */
	}
	
}

/* Se eu apagar o "static" dos m�todos "circumference" e "volume" o programa dar� erro, pois o compilador n�o deixa eu chamar m�todos n�o est�ticos dentro do m�todo "main", que � est�tico. S� se o m�todo vier de outra classe.*/ 