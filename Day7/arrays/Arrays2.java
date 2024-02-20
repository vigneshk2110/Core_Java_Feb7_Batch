package arrays;

public class Arrays2 {

	public static void main(String[] args) {
		
		int price1 = 10;
		int price2 = 101;
		int price3 = 120;
		int price4 = 310;
		int price5 = 1900;
		
//		Declaration
		int [] stockPrice;
		
//		instantiation
		stockPrice = new int [5];
		
//		Index Based initialization
		stockPrice[0] = price1;
		stockPrice[1] = price2;
		stockPrice[2] = price3;
		stockPrice[3] = price4;
		stockPrice[4] = price5;
//		stockPrice[5] = 4567;
		
//		 Access with Index
		int priceOfStock1 = stockPrice[0];
		System.out.println(priceOfStock1);
		
		System.out.println(stockPrice[4]);
		
//		ReAssigning
		
		stockPrice[0] = 1000;
		
		priceOfStock1 = stockPrice[0];
		System.out.println("Reassigned value of 1st Stock : " + priceOfStock1);
		
//		Array Index Out of Bound
		int newStockPrice = stockPrice[5];
		System.out.println(newStockPrice);
		
	}

}
