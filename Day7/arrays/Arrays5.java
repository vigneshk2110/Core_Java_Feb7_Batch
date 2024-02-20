package arrays;

public class Arrays5 {
	public static void main(String[] args) {
		// declaring and initializing arrays
	    int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
	    int arr2[][] = {{2,2,2},{2,2,2},{2,2,2}};
	    
	    // Printing Array1 in matrix format
	    System.out.println("Array1 -");
	    for(int i=0;i<3;i++) {    // for-loop for number of rows
	      for(int j=0;j<3;j++) {    // for-loop for number of columns
	        System.out.print(arr1[i][j] + " ");
	      }
	      System.out.println();
	    }
	    
	    // Printing Array2 in matrix format
	    System.out.println("Array2 -");
	    for(int i=0;i<3;i++) {    // for-loop for number of rows
	      for(int j=0;j<3;j++) {    // for-loop for number of columns
	        System.out.print(arr2[i][j] + " ");
	      }
	      System.out.println();
	    }
	    
	    // creating another array with the same dimensions to store the result
	    int arr3[][] = new int[3][3];
	    
	    // Multiplying arr1 and arr2, storing results in arr3
	    System.out.println("Multiplication of Array1 and Array2 - ");
	    for(int i=0;i<arr1.length;i++) {
	      for(int j=0;j<arr2.length;j++) {
	        arr3[i][j] = 0;
	        for(int k=0;k<arr3.length;k++) {
	          arr3[i][j] += arr1[i][k] * arr2[k][j];
	        }
	        System.out.print(arr3[i][j] + " ");
	      }
	      System.out.println();
	    }
	}

}
