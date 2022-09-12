package methods;

public class StaticMethod {

//	access_modifier static void name_of_method()
//	{
//		actions to be executed
//	}
	public static void substraction() {
		int a = 50;
		int b = 10;

		int c = a - b;

		System.out.println(c);
	}

	public static void multiplication() {
		int f = 50;
		int g = 10;

		int u = g * f;

		System.out.println(u);
	}

	public static void division() {
		double a = 50;
		double b = 10;

		double c = a / b;

		System.out.println(c);
	}

	public static void additionOfNumber() {
		int a = 80;
		int b = 20;
		int c = a + b;

		System.out.println("Addition of " + a + " and " + b + " is " + c);
	}

	public static void main(String[] args) {

		additionOfNumber();

		additionOfNumber();

		additionOfNumber();

		System.out.println("executed the methods for 3 times");

		substraction();
		
		StaticMethod.substraction();

		multiplication();

		division();

		StaticMethod2.printHello();

		StaticMethod2.m1();
	}

//	WAP to define the methods for addition multiplication substraction and division

}
