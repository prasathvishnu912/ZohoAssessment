package assessment;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = scanner.nextInt();	
		
		int[][] arr = new int[n][n];
		int rowTop=0, rowBottom=n-1, colLeft=0, colRight=n-1;
		int curNum=1;
		while(rowTop<rowBottom||colLeft<colRight) {
			for(int i=rowTop; i<=rowBottom; i++) {
				arr[i][colLeft+i] = curNum++;
			}
			colLeft++;
			rowBottom--;
			for(int i=rowBottom; i>=rowTop; i--) {
				arr[i][colRight] = curNum++;
			}
			colRight--;
			for(int i=colRight; i>=colLeft; i--) {
				if(i==colLeft&&rowTop!=0)
					break;
				arr[rowTop][i] = curNum++;
			}
			rowTop++;
			rowBottom--;
		}
		for(int[] ar:arr) {
			for(int i:ar) {
				if(i!=0)
				    System.out.printf("%3d", i);
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
}


}
