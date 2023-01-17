package util;

public class CalculatorV3 {
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {  //  Nesta vers�o, n�o � necess�rio, pois como os m�todos s�o est�ticos, eu posso cham�-los no programa principal diretamente pelo nome da classe.
		return 2.0 * PI * radius;							
	}
	
	public static double volume(double radius) {		 
		return 4.0 * PI * Math.pow(radius, 3.0) / 3.0;
	}

}
