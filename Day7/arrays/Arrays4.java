package arrays;

public class Arrays4 {
	public static void main(String[] args) {
//
////		declaration, instantiation
//		int[][] arr = new int[3][3];
//
////		initialization
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//		arr[2][0] = 7;
//		arr[2][1] = 8;
//		arr[2][2] = 9;
//
		// declaring , initializing & instantiation of 2D array
		int arr1[][] = { 
						{ 1, 2, 3 }, 
						{ 2, 4, 5, 5, 8 }, 
						{ 4, 4 }
					   };

//		Jagged Array in Java

		int arr2[][] = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[3];
		arr2[2] = new int[3];
		

//initializing a jagged array  
		int count = 0;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				count++;  // count = count +1;
				arr2[i][j] = count;
			}
		}

//printing the data of a jagged array   
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();// new line
//		}

//			Jagged Array in Java 2

		int arr3[][] = { { 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18 } };

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();// new line
		}
	}

}
