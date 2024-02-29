package arrays;

public class Arrays2 {

	public static void main(String[] args) {
		
		int price1 = 100;
		int price2 = 101;
		int price3 = 120;
		int price4 = 310;
		int price5 = 1900;	
		
//		Declaration
		int [] stockPrice;
		
//		instantiation
		stockPrice = new int [5]; // Memory Allocation
		
//		Index Based initialization
		stockPrice[0] = price1;
		stockPrice[1] = price2;
		stockPrice[2] = price3;
		stockPrice[3] = price4;
		stockPrice[4] = price5;
		stockPrice[5] = 4567;
		
		System.out.println(stockPrice[5]);
			
		
//		 Access with Index
		int priceOfStock1 = stockPrice[0];
		System.out.println(priceOfStock1);
		
		System.out.println(stockPrice[4]);
		
//		ReAssigning
		
		stockPrice[0] = stockPrice[0] + 1000;
		
		priceOfStock1 = stockPrice[0];
		System.out.println("Reassigned value of 1st Stock : " + priceOfStock1);
		
//		Array Index Out of Bound
//		int newStockPrice = stockPrice[5];
//		System.out.println(newStockPrice);
		
		String name1 = "HCL";
		String name2 = "TCS";
		String name3 = "CTS";
		String name4 = "Wipro";
		String name5 = "Zoho";
		
		String [] stockNames = new String [5];
		stockNames[0] = name1;
		stockNames[1] = name2;
		stockNames[2] = name3;
		stockNames[3] = name4;
		stockNames[4] = name5;
		
		for (int i = 0; i < stockNames.length; i++) {
			System.out.println(stockNames[i]); 
		}
		
		int [] randomNum = {123, 456, 1342,89};
		
		for (int i = 0; i < randomNum.length; i++) {
			System.out.println(randomNum[i]);
		}
		
		
	}

}
