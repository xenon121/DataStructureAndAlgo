package algorithems.leetcode.interview.practice;


// MergeOccuraceAsCount: aabbb = a2b3
public class MergeOccuraceAsCount {

	public static String mergeOccurance(String s) {
		
		if(s == null || s.isEmpty()) return s;
		
		String result = "";
		int count = 1;
		
		for(int i = 0; i < s.length()-1; i++) {
			
			if(s.charAt(i) == s.charAt(i+1)) {
				++count;
				
			}else {
				result = result + (s.charAt(i)+""+count);
				count = 1;	
			}	
		}
		
		result = result + (s.charAt(s.length()-1)+""+count);
		return result;
	}
	
	public static void main(String[] args) {
		
		String s = "aaaa";
		
		System.out.println("merged occurance: "+mergeOccurance(s));
		
	}

}
