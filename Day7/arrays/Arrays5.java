package arrays;

public class Arrays5 {
	public static void main(String[] args) {
		// declaring and initializing arrays
//		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//
//		System.out.println("Array1 -");
//
//		for (int i = 0; i < arr1.length; i++) { // for-loop for number of rows
//			for (int j = 0; j < arr1[i].length; j++) { // for-loop for number of columns
//				System.out.print(arr1[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		int arr2[][] = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
//
//		System.out.println("Array2 -");
//		for (int i = 0; i < arr2.length; i++) { // for-loop for number of rows
//			for (int j = 0; j < arr2[i].length; j++) { // for-loop for number of columns
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//			
//		}
//
//		// creating another array with the same dimensions to store the result
//		int arr3[][] = new int[3][3];
//
//		// Multiplying arr1 and arr2, storing results in arr3
//		System.out.println("Multiplication of Array1 and Array2 - ");
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				arr3[i][j] = 0;
//				for (int k = 0; k < arr3.length; k++) {
//					arr3[i][j] += arr1[i][k] * arr2[k][j];
//				}
//				System.out.print(arr3[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		
		

		int[][][] threeDArray = new int[3][3][3];

		int count = 0;
//     Assigning Values
		for (int i = 0; i < threeDArray.length; i++) { // row
			for (int j = 0; j < threeDArray[i].length; j++) { // columns
				for (int k = 0; k < threeDArray[i][j].length; k++) { // each Index
//					count = count+1;
					threeDArray[i][j][k] = count++;
//					count = count+1;
					
				}
			}
		}
		System.out.println(count); // 27
		
		count++; //Post Increment 28
		++count; //Pre Increment  29
		
		count--;//Post decrement 28
		--count;//pre decrement 27
		
		System.out.println(count);
		
//		Print the values from 3d array
		for (int i = 0; i < threeDArray.length; i++) { // row
			System.out.print("{ ");
			for (int j = 0; j < threeDArray[i].length; j++) { // columns
				System.out.print("{ ");
				for (int k = 0; k < threeDArray[i][j].length; k++) { // each Index
					System.out.print(threeDArray[i][j][k] + " ,");
				}
				System.out.print(" },");
			}
			System.out.println(" }");
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
