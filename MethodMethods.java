package javaPractice;

//Demonstrating Math class methods
public class MethodMethods 
{

	public static void main(String[] args) 
	{
		System.out.println("Demonstrating Math Class methods");
		
		// Absolute value
        int num = -42;
        System.out.println("Absolute value of " + num + ": " + Math.abs(num));

        // Square root
        double value = 25.0;
        System.out.println("Square root of " + value + ": " + Math.sqrt(value));

        // Power
        double base = 2.0, exponent = 3.0;
        System.out.println(base + " raised to the power of " + exponent + ": " + Math.pow(base, exponent));

        // Maximum and Minimum
        int a = 10, b = 20;
        System.out.println("Maximum of " + a + " and " + b + ": " + Math.max(a, b));
        System.out.println("Minimum of " + a + " and " + b + ": " + Math.min(a, b));
        
        // Rounding methods
        double number = 4.7;
        System.out.println("Ceil of " + number + ": " + Math.ceil(number));
        System.out.println("Floor of " + number + ": " + Math.floor(number));
        System.out.println("Round of " + number + ": " + Math.round(number));

        // Trigonometric methods
        double angle = Math.toRadians(45); // Convert degrees to radians
        System.out.println("Sin of 45 degrees: " + Math.sin(angle));
        System.out.println("Cos of 45 degrees: " + Math.cos(angle));
        System.out.println("Tan of 45 degrees: " + Math.tan(angle));

        // Random number
        double randomNum = Math.random(); // Generates a random number between 0.0 and 1.0
        System.out.println("Random number: " + randomNum);
	}
}
