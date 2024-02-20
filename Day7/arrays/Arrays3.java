package arrays;

public class Arrays3 {
	public static void main(String[] args) {
		
//		declaration, instantiation and initialization  
		int [] stockPrice = {10, 120, 100, 66, 55};		
		
//		Length --> Inbuilt method
		
		int length = stockPrice.length;
		System.out.println(length);
		
//		For Loop in Array
		
		for (int i = 0; i < stockPrice.length; i++) {
			System.out.println(stockPrice[i]);
		}
		
//		For Each Loop
		
		for (int i : stockPrice) {
			System.out.println(i);
		}
	}
}
