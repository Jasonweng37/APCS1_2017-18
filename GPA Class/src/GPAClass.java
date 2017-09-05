
//Jason Weng
//It is a GPA class that calculate and print GPA
//September 4, 2017
public class GPAClass {
	public static void main (String[]args) {
		double grade1 = 4.0;
		double grade2 = 3.5;
		double grade3 = 3.7;
		double gpa = calculateGPA(grade1, grade2, grade3);
		printGPA(gpa);
	}
	public static double calculateGPA(double grade1, double grade2, double grade3) {
		double gpa = (grade1+grade2+grade3)/3;
		return gpa;
	}
	public static void printGPA(double gpa) {
		System.out.println(gpa);
	}
}
