package methods;

public class MethodExe6 {
	public static void main(String[] args) {
//		printNumsSum(10, 13, 56, 100, 2345, 64, 1234, 34567);
//		multiPlyNums(1,2,3,4,87,93,10,34);
		int ans = nTimesDivisibleby12(1000);
		System.out.println(ans);
		
//		we can return as well
//		>>>
	}
	
	public static int nTimesDivisibleby12(int num) {
		int count = 0;
		
		while (num>12) {
			count++;
			num /=12;
		}
		return count;
	}

	private static void printNumsSum(int ... nums) {
//		Use for each
//		Use Arrays.toString
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println(sum);
		
		
	}

	private static void multiPlyNums(int ... nums) {
//		Use for each
		
		int sum = 1;
		for (int num : nums) {
			sum *= num;
		}
		System.out.println(sum);
		
	}

	

}
