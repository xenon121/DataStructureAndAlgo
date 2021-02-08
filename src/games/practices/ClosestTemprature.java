package games.practices;

/*import java.util.Scanner;

public class ClosestTemprature {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Total number of temperature: ");
        int n = in.nextInt(); // the number of temperatures to analyse
        
        int positiveVal = 0;
        int negativeVal = 0;
        int result = 0;
        
        for (int i = 0; i < n; i++) {
        	
        	System.out.println("Enter temperature ranging from -273 to 5526: ");
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            
            if(t != 0 && t > 0) {
            	
            	if(positiveVal == 0 || positiveVal > t) {
            		positiveVal = t;
            	}
            	
            }else {
            	
            	if(negativeVal == 0 || negativeVal < t) {
            		negativeVal = t;
            	}
            }
            
            System.err.println(i +" - current positive value: "+positiveVal);
            System.err.println(i +" - current negative value: "+negativeVal);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        // if getting same value as +ve(positive) and -ve(negative) then pic +ve

        if(positiveVal == 0) {
        	result = negativeVal;
        	
        }else if(negativeVal == 0) {
        	result = positiveVal;
        	
        }else {
        	
            if(positiveVal > Math.abs(negativeVal)) {
            	result = negativeVal;
            	
            }else {
            	result = positiveVal;
            }
        }
        
        System.out.println(result);
    }
}
*/

// below is taken from others solution to check...

import java.util.Scanner;

public class ClosestTemprature {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Total number of temperature: ");
        int n = in.nextInt(); // the number of temperatures to analysis
        
        int result = 0;
        
        for (int i = 0; i < n; i++) {
        	
        	System.out.println("Enter temperature ranging from -273 to 5526: ");
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            
            if(i == 0 || Math.abs(result) > Math.abs(t)) {
            	result = t;
            	
            }else if(Math.abs(result) == Math.abs(t)) {
            	
            	if(result < 0) {
            		result = t;
            	}        	
            }
        }
        
        System.out.println(result);
    }
}



