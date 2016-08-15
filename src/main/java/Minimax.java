import java.io.*;
import java.util.Scanner;
public class Minimax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] b = new char[3][3];
		char b1,b2,b3,b4,b5,b6,b7,b8,b9;
		for (int i=0;i<3 ;++i ) {
			for (int j=0;j<3 ;++j ) {
				b[i][j] = "*".charAt(0);
			}			
		}
		System.out.println("Display of board");
		for (int i=0;i<3 ;++i ) {
			for (int j=0;j<3 ;++j ) {
				System.out.print(b[i][j]+" ");
			}			
			System.out.println();
		}
		System.out.println("Select the turn:\n1. Computer\t2. Human");
		int choice = scan.nextInt();
		
	}
	public boolean isGameOver() {
		return (hasXWon() || hasOWon());
	}
	public boolean hasXWon() {
		if((b1==b2 && b1==b3 && b1=="X") || (b1==b4 && b1==b7 && b1=="X") || (b1==b5 && b1==b9 && b1=="X") || (b2==b5 && b2==b8 && b2=="X") || (b3==b6 && b3==b9 && b3=="X") || (b3==b5 && b3==b7 && b3=="X")){
			return true;
		}		
	}
	public boolean hasOWon() {
		if((b1==b2 && b1==b3 && b1=="O") || (b1==b4 && b1==b7 && b1=="O") || (b1==b5 && b1==b9 && b1=="O") || (b2==b5 && b2==b8 && b2=="O") || (b3==b6 && b3==b9 && b3=="O") || (b3==b5 && b3==b7 && b3=="O")){
			return true;
		}		
	}
	
}
