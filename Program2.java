package priya;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the input : ");
		int input=s.nextInt();
		for(int i=1;i<input*2;i++) {
			if(i%2!=0) {
				System.out.print(i +", ");
			}
		}
		
	}

}
