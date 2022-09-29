package priya;

import java.util.Scanner;

public class Program3 {
   public static void main(String args[]) {
	  Scanner s=new Scanner(System.in);
	  System.out.print("Enter the input : ");
		int input=s.nextInt();
		if(input%2==0) {
			for(int i=1;i<(input-1)*2;i++) {
				if(i%2!=0) {
					System.out.print(i +", ");
				}
			}
		}
		else {
			for(int i=1;i<input*2;i++) {
				if(i%2!=0) {
					System.out.print(i +", ");
				}
			}
		}
   }
}
