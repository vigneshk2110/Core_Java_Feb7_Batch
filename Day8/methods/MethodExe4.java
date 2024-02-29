package methods;

import java.util.Scanner;

public class MethodExe4 {
	
//	Return Type Methods  --> Non Parameterized
	
	public static void main(String[] args) {
		
//		int ans = getNum();
//		System.out.println(ans);
		
		
//		String message = receiveMessage();
//		System.out.println(message);
		
		double result = divide2Nums();
		System.out.println(result);
	}

private static double divide2Nums() {
	Scanner scan = new Scanner(System.in);
	int first = scan.nextInt();
	int second = scan.nextInt();
	double result = (double)first/second;
		return result;
	}

private static String receiveMessage() {
	Scanner scan = new Scanner(System.in);
	String receivedMessage = scan.nextLine();
	System.out.println("The Message Recieved is ");
//	System.out.println(receivedMessage);
	
	return receivedMessage;
}

private static int getNum() {
	
	Scanner scan = new Scanner(System.in);
	double num = scan.nextDouble();
	int result = (int)num * 2;	
	return result;
}

public static void name() {
	
}

}
