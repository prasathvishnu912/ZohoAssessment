package assessment;

import java.util.Scanner;

public class Question5 {


	   public static void main(String[] args){

	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the number: ");
	       int n = scanner.nextInt();
	       scanner.nextLine();
	       for(int i=1; i<=n;i++){
	          System.out.println("Enter the String " + i);
	          String s = scanner.nextLine();
	           s = s.toUpperCase();
	          String sStr = sortedString(s);
	System.out.println("String " + i +" "+ sStr);

}


	}
	public static String sortedString(String s){
	   if(s.length()==0)
	      return "";
	    char maxChar = s.charAt(0);
	     int maxCharInx = 0;
	    for(int i=1; i<s.length();i++){
	       if(maxChar<s.charAt(i)){
	        maxChar = s.charAt(i);
	       maxCharInx = i;
	    }
	   }
	 String nS = s.substring(0, maxCharInx) + s.substring(maxCharInx+1, s.length());
	 return maxChar + sortedString(nS);  
	}


}
