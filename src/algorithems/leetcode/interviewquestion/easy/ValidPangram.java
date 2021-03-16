package algorithems.leetcode.interviewquestion.easy;

import java.awt.AlphaComposite;

public class ValidPangram {

	/*
	 * Pangram is a sentence that contains all alphabetic characters from A to Z;
	 * it can have digits and special characters too but A to Z alphabet is necessary.
	 * return missing alphabets if sentence is not pangram.
	 */
	
	
	public static String checkPangram(String sentence, String ALPHABETS) {
		
		if(sentence == null || sentence.isEmpty()) 
			throw new NullPointerException("empty sentence not allowed");
		
		String missingAlphabets = "";
		
		for(int i=0; i<ALPHABETS.length()-1; i++) {
			
			if(sentence.toLowerCase().contains(ALPHABETS.substring(i, i+1).toLowerCase())) {
				continue;
			}
			
			missingAlphabets += ALPHABETS.substring(i, i+1);
			
		}
		
		return missingAlphabets;
	}
	
	public static void main(String[] args) {
		
		String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		//String sentence = "Aaa Bdfe Ceeee DdfseE dgsegF ggeg Ggsgs HIegee JKegeg egegLMNO eegPQR eegegSTUVWXYZ";
		String sentence = "from morning my cousin's computer was not starting";

		System.out.println("missing Strings: "+checkPangram(sentence, ALPHABETS));
		
	}

}
