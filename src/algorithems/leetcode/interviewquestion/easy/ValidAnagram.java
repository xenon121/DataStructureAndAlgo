package algorithems.leetcode.interviewquestion.easy;

import java.util.Arrays;
import java.util.List;

public class ValidAnagram {

	public static boolean checkIsAnagram(String s, String t) {
		
		if(s.length() != t.length()) return false;
		
		/*final char temp[] = {0};
		
		for(int i=0; i<s.length(); i++) {
			
			temp[0] = s.charAt(i);
			
			if (s.chars().filter(ns -> ns == temp[0]).count() != t.chars().filter(nt -> nt == temp[0]).count()) {
				
				System.out.println("not equal s.count: "+s.chars().filter(ns -> ns == temp[0]).count());
				System.out.println("not equal t.count: "+t.chars().filter(nt -> nt == temp[0]).count());
				return false;
				
			}else {
				System.out.println("equal s.count: "+s.chars().filter(ns -> ns == temp[0]).count());
				System.out.println("equal t.count: "+t.chars().filter(nt -> nt == temp[0]).count());
			}
			
			System.out.println("-----------------------");
		}*/
		
		// alternate approach
		char str1[] = s.toCharArray();
		char str2[] = t.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(!Arrays.equals(str1, str2)) return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		
		//String s = "anagram";
		//String t = "nagaram";
		
		String s = "rat";
		String t = "art";
		
		//String s = "aacc";
		//String t = "ccac";

		System.out.println("isAnagram: "+checkIsAnagram(s,t));
	}

}
