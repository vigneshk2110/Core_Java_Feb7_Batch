package controlFlowStatement;

public class BreakContinue{

    public static void main(String[] args) {
    	
//    	for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
    	
    	
        // Print numbers from 1 to 10, but skip 5
        for (int i = 1; i <= 100; i++) {
            if (i == 5) {
            	continue; 
//                System.out.println("Inside 1st If Block, where i = 5");
                // Skip 5
            }
            
            System.out.println(i);
            
            if (i == 4) {
                System.out.println("Inside 2nd If Block, where i = 8");
                break; // Exit loop after 8
            }
        }
    }
}