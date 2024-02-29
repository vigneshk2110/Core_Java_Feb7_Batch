package arrays;

import java.util.Arrays;

public class Arrays7Methods {
	public static void main(String[] args) {

//      CopyOf(ogArray, newLength)

		int intArr[] = { 10, 20, 15, 22, 35 };
		int[] copyArray = Arrays.copyOf(intArr, 10); // 10 is Length of new Array
		System.out.println(Arrays.toString(copyArray));

//      copyOfRange(ogArray, fromIndex, toIndex)
		int[] copyArray1 = Arrays.copyOfRange(intArr, 0, 3);
		System.out.println(Arrays.toString(copyArray1));

//      Equals

		// Get the second Arrays
		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.equals(intArr1, intArr));

//      Tofill

		int intKey = 22;

		Arrays.fill(intArr, intKey);

		// To fill the arrays
		System.out.println("Integer Array on filling: " + Arrays.toString(intArr));

//      Mismatch Index

		// To compare both arrays -> returns index where mismatch occurs
		System.out.println("The element mismatched at index: " + Arrays.mismatch(intArr, intArr1));

//      Stream 
		
		int intArr2[] = { 10, 20, 15, 22, 35 };

		Arrays.stream(intArr2).
					forEach(value -> System.out.println(value));

	}
}
