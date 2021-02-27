package algorithems.simple;

import java.util.Arrays;

// array is given that can have positive and negative numbers
// push all negative numbers one side and all positive numbers to another side
// Constraint: only single loop can be used.

public class MoveNegativeAndPositiveOppositeSide {

	public static void main(String[] args) {
		
		int[] arr = {-1,2,-2,-2,1,2,4,-1,0,-29};
		
		int i = 0;
		int j = arr.length-1;
		boolean holdI = false;
		boolean holdJ = false;
		int temp = 0;
		
		while(i != j) {
			
			if(arr[i] < 0 && !holdI) {
				i++;
				
			}else {
				holdI = true;
			}
			
			if(arr[j] > 0 && !holdJ) {
				j--;
				
			}else {
				holdJ = true;
			}
			
			if(holdI && holdJ) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;	
				
				holdI = false; 
				holdJ = false;
			}
		}
		
		Arrays.stream(arr).forEach(System.out::println);
		
	}

}
