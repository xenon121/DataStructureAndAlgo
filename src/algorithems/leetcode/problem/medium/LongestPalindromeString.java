package algorithems.leetcode.problem.medium;

import java.util.stream.Stream;

public class LongestPalindromeString {

	public static void main(String[] args) {
		
		String s = "aacabdkacaa";
		String longestString = "";
		String palindromString = "";
		
		final int[] i = {0};
		long count = 0;
		//int holdJ = 0;
		
		for(i[0] = 0; i[0] < s.length(); i[0]++) {
			
			//count = Stream.of(s).filter(ch -> ch == s.substring(i[0], i[0]+1)).count();
			
			count = s.chars().filter(ch -> ch == s.charAt(i[0])).count();
			
			if(count > 1) {

				for(int j = i[0] + 1; j < s.length(); j++) {	
					if(count <=0) break;
					
					if(s.charAt(i[0]) == s.charAt(j)) {
						
						longestString = s.substring(i[0], j + 1);
						
						System.out.println(longestString+": "+longestString.length());
						
						if((palindromString.length() < longestString.length()) 
								&& longestString.equals(new StringBuilder(longestString).reverse().toString())) {
							
							palindromString = longestString;
							System.out.println("palindrom: "+palindromString);
								
						}
						
						//holdJ = j;
						count--;	
					}
				}
			}	
		}
		
		if(palindromString.isEmpty()) {
			palindromString = String.valueOf(s.charAt(0));
		}
		
		System.out.println("final: - "+palindromString+": "+palindromString.length());

	}

}
