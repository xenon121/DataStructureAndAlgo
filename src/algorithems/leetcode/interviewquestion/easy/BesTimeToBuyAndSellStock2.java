package algorithems.leetcode.interviewquestion.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BesTimeToBuyAndSellStock2 {

	public static void main(String[] args) {

		System.out.println("starting execution...");

		//int[] prices = { 7, 1, 5, 3, 6, 4 };
		//int[] prices = { 7, 1, 5, 1, 6, 4 };
		//int[] prices = { 7,6,4,3,1 };
		int[] prices = {6,1,3,2,4,7};
		//int[] prices = { 1, 2, 3, 4, 5 };

		int maxProfit = 0, currentProfit = 0, profit = 0;

		// int buy;

		boolean isStart = true;

		HashMap<Integer, List<Integer>> skipMap = null;

		while (isStart) {

			System.out.println("skipMap: " + skipMap);

			isStart = false;
			// buy = 0;
			
			profit = 0;
			currentProfit = 0;
			
			for (int buy = 0; buy < prices.length - 1; buy++) {

				for (int sell = (buy + 1); sell < prices.length; sell++) {

					if (skipMap != null && !skipMap.isEmpty() && skipMap.containsKey(buy) && skipMap.get(buy).contains(sell)) {
						System.out.println("skiping buy: " + buy);
						System.out.println("skiping sell: " + sell);
						continue;
					}

					System.out.println("\nbuy price: " + prices[buy]);
					System.out.println("sell price: " + prices[sell]);

					if (prices[buy] < prices[sell]) {

						profit = prices[sell] - prices[buy];
						System.out.println("profit: "+profit);
						currentProfit = currentProfit + profit;

						if(skipMap == null) {
							skipMap = new HashMap();
						}
						
						if (isStart == false) {

							if (!skipMap.containsKey(buy)) {
								
								List<Integer> sellSkipList = new ArrayList<Integer>(); 
								sellSkipList.add(sell);
								
								skipMap.put(buy, sellSkipList);
								isStart = true;

							} else if (!skipMap.get(buy).contains(sell)) {
								skipMap.get(buy).add(sell);
								isStart = true;
							}

						}
						buy = sell + 1;

					}
				}
			}
			System.out.println("currentProfit: " + currentProfit);

			if (maxProfit < currentProfit) {
				maxProfit = currentProfit;
			}

		}

		System.out.println("maxProfit: " + maxProfit);
		System.out.println("skimap: "+skipMap);

	}

}
