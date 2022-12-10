package algorithems.leetcode.problem.easy;

// https://leetcode.com/problems/roman-to-integer/
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
/*
 * For example, 2 is written as II in Roman numeral, just two ones added
 * together. 12 is written as XII, which is simply X + II. The number 27 is
 * written as XXVII, which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There
 * are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9.  X can be placed
 * before L (50) and C (100) to make 40 and 90.  C can be placed before D (500)
 * and M (1000) to make 400 and 900.
 * 
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInt {

	public static void main(String[] args) {
		String s = "MCMXCIV"; //(LVIII - 58) // (MCMXCIV - 1994)
		System.out.print(romanToInt(s));
	}

    public static int romanToInt(String s) {

        char[] romanCharArr = s.toCharArray();
    	int solution = 0;
    	
    	for(int i=0; i< s.length(); i++) {
    		if(i < s.length()-1 && getRomanIntValue(romanCharArr[i]) < getRomanIntValue(romanCharArr[i+1])) {
    			solution = solution + getRomanIntValue(romanCharArr[i+1]) - getRomanIntValue(romanCharArr[i]);
    			i=i+1;
    		}else {
    			solution = solution + getRomanIntValue(romanCharArr[i]);
    		}
    	}
    	return solution;
    }
	
    public static int getRomanIntValue(char romanChar) {
    	if(romanChar == 'I') {
    		return 1;
    	}else if(romanChar == 'V') {
    		return 5;
    	}else if(romanChar == 'X') {
    		return 10;
    	}else if(romanChar == 'L') {
    		return 50;
    	}else if(romanChar == 'C') {
    		return 100;
    	}else if(romanChar == 'D') {
    		return 500;
    	}else if(romanChar == 'M') {
    		return 1000;
    	}
    	return 0;
    }
}
