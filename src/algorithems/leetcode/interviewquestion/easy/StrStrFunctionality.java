package algorithems.leetcode.interviewquestion.easy;

public class StrStrFunctionality {

	public static int strOccurrenceIndex(String haystack, String needle) {
		
		int j=0, k;
		boolean isSame;
		
		if(needle == null || needle.isEmpty()) return 0;
		
		for(int i=0; i<=(haystack.length()-needle.length()); i++) {
			
			if(haystack.charAt(i) == needle.charAt(j)) {
				k=i;
				isSame = true;
				
				while(isSame && j<needle.length()) {
					System.out.println("haystack: "+haystack.charAt(k));
					System.out.println("needle: "+needle.charAt(j));
			
					isSame = (haystack.charAt(k++) == needle.charAt(j++));
					System.out.println(isSame);
					
				}
				
				if(isSame) return i;
				
				j=0;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		String haystack = "eloolloll"; 
		String needle = "oll";
	
		System.out.println(strOccurrenceIndex(haystack, needle));
	}

}
