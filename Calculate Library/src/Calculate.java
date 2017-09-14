//Jason Weng
// September 5, 2017
//This is our home grown library that will contain various mathematical methods

import java.text.DecimalFormat;
public class Calculate {
	
	//This method takes an integer and returns its square
	public static int square(int operand) {
		return operand * operand;
	}
	//This method takes an integer and return its cube
	public static int cube(int number) {
		return number * number * number;
	}
	//This method takes two numbers and return their average
	public static double average(double number1, double number2) {
		return (number1 + number2) / 2;
	}
	//This method takes three numbers and return their average
	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3) / 3;
	}
	//This method takes a radian and return its degree 
	public static double toDegrees(double radians) {
		return radians * (180 / 3.14159);
	}
	//This method takes a degree and return its radian
	public static double toRadians(double degrees) {
		return degrees * (3.14159 / 180);
	}
	//This method takes three numbers and return the value of the discriminant
	public static String discriminant(double a, double b, double c) {
		return a + "x^2+" + b + "x+" + c;
	}
	//This method takes three numbers and return its improper fraction form
	public static String toImproperFrac(int number1, int number2, int number3) {
		int numerator = number1 * number3 + number2;
		int denominator = number3;
		return numerator + "/" + denominator;
	}
	//This method takes three numbers and return its mixed nummber form
	public static String toMixedNum(int numerator, int denominator) {
		int number1 = numerator / denominator;
		int number2 = numerator - number1 * denominator;
		int number3 = denominator;
		return number1 + "_" + number2 + "/" + number3;
	}
	//This method takes three integers and one string and return its quadratic equation
	public static String foil(int a, int b, int c, int d, String x) {
		int A = a * c;
		int B = a * d + b * c;
		int C = b * d;
		return A + x + "^2 + " + B + x + "- " + C;
	}
	//This method returns a boolean value to test if the integers are evenly divisible
	public static boolean isDivisibleBy(int a, int b) {
		if(a % b == 0) {
			return true;
		}else {
			return false;
		}
	}
	//This method takes a number and return its absolute value
	public static double abaValue(double a) {
		if(a >= 0) {
			return a;
		}else {
			return a * (-1);
		}
	}
	//This method takes two numbers and return the greater one
	public static double max(double a, double b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	//This method takes three numbers and return the greater one
	public static double max(double a, double b, double c) {
		if(a > b || a > c) {
			return a;
		}else if(b > a || b > c) {
			return b;
		}else {
			return c;
		}
	}
	//This method takes two numbers and return the smaller one
	public static int min(int a, int b) {
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}
	//This method takes a decimal and return its rounded number
	public static double round(double number) {
		String aNumber = new String(String.valueOf(number));
		DecimalFormat round = new DecimalFormat("#.##");
		String roundUp = new String(round.format(number));
		return Double.parseDouble(roundUp);
	}
}
