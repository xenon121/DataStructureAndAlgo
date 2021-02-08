package algorithems.leetcode.interviewquestion.easy;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		
		int[] digits = {9};
		boolean reminder = false;
		
		if(digits[digits.length-1] + 1 == 10) {
			
			for(int i=digits.length-1; i>=0; i--) {
				
				if(digits[i] + 1 == 10) {
					
					reminder = true;
					
					digits[i] = 0;
					
					/*if(digits.length-1 == i) {
						digits = Arrays.copyOf(digits, digits.length+1);
						
					}else {
						digits[i+1] = 0;
					}*/
					
				}else {
					reminder = false;
					digits[i] = digits[i] + 1;
					break;
				}
			}
			
			if(reminder) {
				digits = Arrays.copyOf(digits, digits.length+1);
				digits[0] = 1;
				reminder = false;
			}
			
			for(int i=0; i<digits.length; i++) {
				System.out.println(digits[i]);
			}
			
		}else {
			
			digits[digits.length-1] = digits[digits.length-1] + 1;
			
			for(int i=0; i<digits.length; i++) {
				System.out.println(digits[i]);
			}
		}
		
	}

}
