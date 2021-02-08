package games.practices;

import java.util.Scanner;

public class BatmanJumpsToStopBomb2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter building width: ");
        int W = in.nextInt(); // width of the building.
        
        System.out.print("Enter building height: ");
        int H = in.nextInt(); // height of the building.
        
        System.out.print("Enter maximum turns: ");
        int N = in.nextInt(); // maximum number of turns before game over.
        
        System.out.print("Enter batman X position: ");
        int X0 = in.nextInt();
        
        System.out.print("Enter batman Y position: ");
        int Y0 = in.nextInt();
        
        // game loop
        while (true) {
        	//System.out.println("Enter bomb Direction...");
            //String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

        	String 	bombDir;
        	
            System.err.println("width: "+W);
            System.err.println("height: "+H);
            System.err.println("turns: "+N);
            System.err.println("x axis: "+X0);
            System.err.println("y axis: "+Y0);

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            if(X0 != W) {
            	
            	X0 = (X0+W)/2;
            	
            	if(X0+1 == W) {
            		X0 = X0 + 1;
            	}
            }

            if(Y0 != H) {
            	
            	Y0 = (Y0+H)/2;
            	
            	if(Y0+1 == H) {
            		Y0 = Y0 + 1;
            	}
            }
            
            System.err.println("x axis - after function: "+X0);
            System.err.println("y axis - after function: "+Y0);
        	
            bombDir = "";
            
        	if(H >= Y0) {
        		bombDir = bombDir + "D";
        		
        	}else {
        		bombDir = bombDir + "U";
        	}
        	
        	if(W >= X0) {
        		bombDir = bombDir + "R";
        		
        	}else {
        		bombDir = bombDir + "L";
        	}
            
        	System.out.println("BombDir set....: "+bombDir);
        	
            if(bombDir.contains("D") && Y0 != H){
                Y0++;
                System.err.println("y axis - changed: "+Y0);
            }

            if(bombDir.contains("U") && Y0 != H){
                Y0--;
                System.err.println("y axis - changed: "+Y0);
            }

            if(bombDir.contains("R") && X0 != W){
                X0++;
                System.err.println("x axis - changed: "+X0);
            }

            if(bombDir.contains("L") && X0 != W){
                X0--;
                System.err.println("x axis - changed: "+X0);
            }

            // the location of the next window Batman should jump to.
            System.out.println(X0+" "+Y0);
            
            System.out.println("N - "+N);
            N--;
            
            if(X0 == W && Y0 == H) {
            	System.out.println("Bomb defused...");
            	break;
            	
            }else if(N<=0) {
            	System.out.println("Bomb gone boom... failed");
            	break;
            }
            
        }
    }

}
