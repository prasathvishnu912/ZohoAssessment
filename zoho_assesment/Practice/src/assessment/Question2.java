package assessment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		     System.out.println("Enter the Number: ");
		     String s = scanner.nextInt()+"";
		     boolean condition = true;
		      for(int i=0; i<s.length();i++){
		        int curN = Integer.parseInt(s.charAt(i)+"");
		        int leftDiff = 0;
		        int rightDiff = 0;
		        if(i>0){
		          int leftN = Integer.parseInt(s.charAt(i-1)+"");
		          leftDiff = Math.abs(curN-leftN);
		         }
		        if(i<s.length()-1){
		          int rightN = Integer.parseInt(s.charAt(i+1)+"");
		          rightDiff = Math.abs(rightN-curN);
		         }
		        if(leftDiff>1&&rightDiff>1){
		            condition = false;
		           System.out.println(s + " is not a jumbled number");
		            break;
		      }
		     }
		     if(condition)
		     System.out.println(s + " is a jumbled number");

	}

}
