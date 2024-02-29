package methods;

import java.util.Scanner;

public class MethodExe2 {
//	Static void methods --> Non Parameterized
	public static void main(String[] args) {

		System.out.println("Inside main");

		printHi10Times();
//		sumOf2Nums();
//		printSquare();
		
		printRect();
		System.out.println("Exiting main");
	}

	private static void printRect() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Length");
		int length = scan.nextInt();
		
		System.out.println("Please enter the breadth");
		int breadth = scan.nextInt();
		
		for (int i = 0; i < breadth; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
}

	private static void printSquare() {
//	 Use loops & print Square

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of side");
		int side = scan.nextInt();

		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void sumOf2Nums() {
//	Use Scanner

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the 1st Num");
		int num1 = scan.nextInt();
		System.out.println("Please enter the 2nd Num");
		int num2 = scan.nextInt();

		int sum = num1 + num2;

		System.out.println(sum);

	}

	private static void printHi10Times() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi");
		}

	}
	

}
