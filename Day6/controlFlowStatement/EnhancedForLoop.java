package controlFlowStatement;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String str = "Java Program";
		
		for (Character c : str.toCharArray()) {
			System.out.println(c);
			
		}  
		
		int [] rating = {10, 20, 30, 40};
		 
		for (int i : rating) {
			
			int salary ;
			if(i <= 20) {
				salary = 20000;
			}
			else {
				salary = 40000;
			}
			System.out.println(salary);
			
			
		}
	}

}
