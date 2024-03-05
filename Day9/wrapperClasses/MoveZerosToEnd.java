package wrapperClasses;

import java.util.Arrays;

public class MoveZerosToEnd {
	
    public static void main(String[] args) {
        int[] nums = {1,2, 0, 3,4,0,5,6,7,0};
        
        System.out.println(Arrays.toString(nums));

        int nonZeroIndex = 0;

//      Move Non zero elements to start of array  
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

//        Fill the rest array with zero
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

}
