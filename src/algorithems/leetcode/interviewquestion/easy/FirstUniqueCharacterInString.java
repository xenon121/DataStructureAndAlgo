package algorithems.leetcode.interviewquestion.easy;

import java.util.Date;

public class FirstUniqueCharacterInString {
	
	public static int firstUniqChar3(String s) {
	
    	int[] charArray = new int[26];
    	
    	for(char c : s.toCharArray()) charArray[c-'a']++;
    	
    	int indx = 0;
    	for(char c : s.toCharArray()) {
    		if(charArray[c-'a'] == 1) return indx;
    		indx++;
    	}
    	
    	return -1;
	}
	
    public static int firstUniqChar(String s) {
        
    	if(s.length() == 1) return 0;
    	
    	String checkedChraracters = "";
    	String currentChar;
    	
        for(int i=0; i<s.length(); i++){
            
        	currentChar = s.substring(i, i+1);
        	
        	if(!s.substring(i+1, (s.length())).contains(currentChar) && !checkedChraracters.contains(currentChar)) return i;
          
        	if(!checkedChraracters.contains(currentChar)) checkedChraracters = checkedChraracters + currentChar;
           
        }
        
        return -1;
    }
    
    public static int firstUniqChar2(String s) {
        
        int[] arr=new int[26];
        
        for(char c:s.toCharArray()) arr[c-'a']++;
        
        int indx=0;
        for(char c:s.toCharArray())
            if(arr[c-'a']==1) return indx;
            else
                indx++;
        
        return -1;
    }
	
	public static void main(String[] args) {
		
		String s = "loveleetcode";
		
		long startTime = new Date().getTime();
		System.out.println(startTime);
		System.out.println(firstUniqChar2(s));
		System.out.println(new Date().getTime() - startTime);
		
		startTime = new Date().getTime();
		System.out.println(startTime);
		System.out.println(firstUniqChar(s));
		System.out.println(new Date().getTime() - startTime);
		
		startTime = new Date().getTime();
		System.out.println(startTime);
		System.out.println(firstUniqChar3(s));
		System.out.println(new Date().getTime() - startTime);
	}

}
