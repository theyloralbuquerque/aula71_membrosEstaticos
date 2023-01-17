package util;

public class CalculatorV3 {
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {  //  Nesta versão, não é necessário, pois como os métodos são estáticos, eu posso chamá-los no programa principal diretamente pelo nome da classe.
		return 2.0 * PI * radius;							
	}
	
	public static double volume(double radius) {		 
		return 4.0 * PI * Math.pow(radius, 3.0) / 3.0;
	}

}
