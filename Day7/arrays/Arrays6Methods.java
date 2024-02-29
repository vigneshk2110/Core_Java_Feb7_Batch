package arrays;

import java.util.Arrays;

public class Arrays6Methods {

	public static void main(String[] args) 
    { 
// toString
        int intArr[] = { 10, 20, 15, 22, 35 }; 
        
        String array =Arrays.toString(intArr); 
        
        // To convert the elements as List 
        System.out.println("Integer Array as List: "
                           + array); 
        
//Sort(fromIndex, toIndex)
        Arrays.sort(intArr, 1, 3);
        
        System.out.println("Sorted Integer Array: "
                + Arrays.toString(intArr)); 
        
// Sort
        
        Arrays.sort(intArr);
        
        System.out.println("Sorted Integer Array: "
                + Arrays.toString(intArr)); 
        
// binarySearch()
        
        int toFind = 22;
        
        int index = Arrays.binarySearch(intArr, toFind);
        
        System.out.println(index + " is the index of 22 in the Array");
        
// binarySearch(from, to) 
        
        toFind = 20;
        index = Arrays.binarySearch(intArr, 0, 2, toFind);
        
        System.out.println(index + " is the index of 20 in the Array between 0th & 2nd Index");
        
//        compare(array 1, array 2) Method
        
        int intArr1[] = { 10, 20, 15, 22, 35 }; 
        
        // Get the second Array 
        int intArr11[] = { 10, 15, 22 }; 
  
        // To compare both arrays 
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.compare(intArr11, intArr1)); 
        

    } 
}
