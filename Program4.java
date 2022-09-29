package priya;

public class Program4 {
	public static void main(String args[]) {
		int ar[]= {1,2,8,9,12,46,76,82,15,20,30};
		int count=0;
		int temp[]=new int[9];
		for(int i=1;i<=9;i++) {
			count=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[j]%i==0) {
					count++;
				}
				temp[i-1]=count;
			}
		}
		for(int i=0;i<temp.length;i++) {
			System.out.print((i+1)+":"+temp[i]+ ", ");
		}
	}

}
