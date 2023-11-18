package assessment;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = scanner.nextLine();
		System.out.println("Enter the rows: ");
		int rows = scanner.nextInt();
		if(rows<=1) {
			System.out.println(s);
		    return;   
		}
		
		int colCount = s.length()%(rows+(rows-2))==0 ? s.length()/(rows+(rows-2)) : s.length()/(rows+(rows-2))+1;
		
		
		char[][] resultArr = new char[rows][colCount*((rows-2)+1)];
		
		int currCharInx = 0;
		int currCol = 0;
		while(currCharInx<s.length()&&currCol<resultArr[0].length) {
			for(int i=0; i<rows; i++) {
				if(currCol<resultArr[0].length&&currCharInx<s.length()) {
					resultArr[i][currCol] = s.charAt(currCharInx);
					currCharInx++;	
				}
				
			}
			currCol++;
			for(int j=0; j<rows-2; j++) {
					if(currCol<resultArr[0].length&&currCharInx<s.length()) {
						resultArr[rows-j-2][currCol] = s.charAt(currCharInx);
						currCol++;
						currCharInx++;
					}
				
			}
		}
		
		for(char[] cArr:resultArr) {
			for(char x : cArr) {
				if(x=='\u0000') {
					System.out.print("  ");
				}else {
					System.out.print(x+" ");
				}
			}
			System.out.println();
		}
	}

}
