package algorithems.leetcode.problem.medium;

// longest substring without repeating character
/*Constraints:

    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.
*/
//  Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstring {

	public static void main(String[] args) {
		
		int topLength = 0;
		String s = " ";
		String processString;
		
		for(int i = 0; i < s.length(); i++) {
			
			processString = "";
			
			for(int j = i; j < s.length(); j++) {		
				if(!processString.contains(s.substring(j,j+1))) {
					processString = processString + s.substring(j,j+1);
					
				}else {
					System.out.println("duplicated: "+s.substring(j,j+1));
					break;
				}
			}
			
			System.out.println("processString: "+processString);
			System.out.println(topLength+" < "+processString.length()+": "+(topLength < processString.length()));
			
			if(topLength < processString.length()) {
				topLength = processString.length();
			}
		}

		System.out.println("longest string was : "+topLength);
	}

}
