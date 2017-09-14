//Jason Weng
//September 5, 2017
//This is the runner class for my Calculate Library methods
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5,6));
		System.out.println(Calculate.average(4,5,6));
		System.out.println(Calculate.toDegrees(5));
		System.out.println(Calculate.toRadians(5));
		System.out.println(Calculate.discriminant(4,5,6));
		System.out.println(Calculate.toImproperFrac(4,5,6));
		System.out.println(Calculate.toMixedNum(5,6));
		System.out.println(Calculate.foil(4,5,6,7,"x"));
		System.out.println(Calculate.isDivisibleBy(5,6));
		System.out.println(Calculate.abaValue(5));
		System.out.println(Calculate.max(5,6));
		System.out.println(Calculate.max(4,5,6));
		System.out.println(Calculate.min(5,6));
		System.out.println(Calculate.round2(5.234253));		
		//		
	}

}
