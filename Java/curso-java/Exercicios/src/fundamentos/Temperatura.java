package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		//  (°F - 32) X 5/9 = °C
		
		final double AJUSTE = 32;
		final double FATOR = 5.0/9;

		int f = 86;
		double celcius = (f - AJUSTE)*FATOR;

		System.out.println("A temperatura " + f + " Fahrenheit, tem seu valor " + celcius + " em graus celcius" );

		 f = 150;
		 celcius = (f - AJUSTE)*FATOR;
		
		System.out.println("A temperatura " + f + " Fahrenheit, tem seu valor " + celcius + " em graus celcius" );
	}

}
