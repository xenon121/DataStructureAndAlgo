package games.practices;

/*import java.util.Scanner;

public class MoveThor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value for light: ");
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        
        System.out.println("Enter value for thor intial position: ");
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        
        System.out.println("Enter total movement for thor: ");
        int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            System.err.println("initialTx: "+initialTx);
            System.err.println("initialTy: "+initialTy);

            System.err.println("lightX: "+lightX);
            System.err.println("lightY: "+lightY);
            
            System.err.println("total given movment: "+remainingTurns);

        // game loop
        while (true) {

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // A single line providing the move to be made: N NE E SE S SW W or NW

            if(initialTx < lightX && initialTy < lightY){
                System.out.println("SE");
                initialTx++;
                initialTy++;

            }else if(initialTx > lightX && initialTy > lightY){
                System.out.println("NW");
                initialTx--;
                initialTy--;

            }else if(initialTx > lightX && initialTy < lightY){
                System.out.println("SW");
                initialTx--;
                initialTy++;

            }else if(initialTx < lightX && initialTy > lightY){
                System.out.println("NE");
                initialTx++;
                initialTy--;

            }else if(initialTx < lightX && initialTy == lightY){
                System.out.println("E");
                initialTx++;

            }else if(initialTx > lightX && initialTy == lightY){
                System.out.println("W");
                initialTx--;

            }else if(initialTx == lightX && initialTy < lightY){
                System.out.println("S");
                initialTy++;

            }else if(initialTx == lightX && initialTy > lightY){
                System.out.println("N");
                initialTy--;
            }

            if(initialTx == lightX && initialTy == lightY) {
            	
                System.err.println("Win - initialTx: "+initialTx);
                System.err.println("Win - initialTy: "+initialTy);
                
                System.err.println("total given movment: "+remainingTurns);
            	
            	System.out.println("congrates thor regains the lightning power...");
            	break;
            	
            }else if(remainingTurns <= 0) {
            	
                System.err.println("Lost - initialTx: "+initialTx);
                System.err.println("Lost - initialTy: "+initialTy);
            	
            	System.out.println("lightning power faded away. try again...");
            	break;
            }
            
            remainingTurns--;

           // System.out.println("N");
        }
    }
}
*/


// below is taken from other's solution to check...

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
public class MoveThor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int remainingTurns = in.nextInt();
        // game loop
        while (true) {
            
            String direction="";
            // Write an action using System.out.println()
            System.err.println(initialTY+" "+ initialTX +" "+lightY +" "+ lightX);
            
            if(lightY < initialTY) { 
            	direction += "N";
            	initialTY--;
            } 
            if(lightY > initialTY){
            	direction += "S";
            	initialTY++;
            } 
            if(lightX < initialTX){ 
            	direction += "W" ;
            	initialTX--;
            }
            if(lightX > initialTX){ 
            	direction += "E";
            	initialTX++;
            }
            
            if(initialTX == lightX && initialTY == lightY) {
            	
                System.err.println("Win - initialTx: "+initialTX);
                System.err.println("Win - initialTy: "+initialTY);
                
                System.err.println("total given movment: "+remainingTurns);
            	
            	System.out.println("congrates thor regains the lightning power...");
            	break;
            	
            }else if(remainingTurns <= 0) {
            	
                System.err.println("Lost - initialTx: "+initialTX);
                System.err.println("Lost - initialTy: "+initialTY);
            	
            	System.out.println("lightning power faded away. try again...");
            	break;
            }
            
            remainingTurns--;
            
            
            
            System.out.println(direction); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}