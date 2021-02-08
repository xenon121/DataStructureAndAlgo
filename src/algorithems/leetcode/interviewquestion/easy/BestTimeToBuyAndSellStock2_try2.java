package algorithems.leetcode.interviewquestion.easy;

public class BestTimeToBuyAndSellStock2_try2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 7, 1, 5, 3, 6, 4, 7 };
		//int[] prices = { 7, 1, 5, 1, 6, 4 };
		//int[] prices = { 7,6,4,3,1 };
		//int[] prices = {6,1,3,2,4,7};
		//int[] prices = { 1, 2, 3, 4, 5 };
	
		
		int profit = 0;
		
		for(int i = 1; i < prices.length; i++) {
			
			if(prices[i] > prices[i-1]) {			
				profit += prices[i] - prices[i-1];
			}
		}
		
		System.out.println("total profit: "+profit);
		
	}

}
