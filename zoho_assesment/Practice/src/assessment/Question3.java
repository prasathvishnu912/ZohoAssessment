package assessment;

import java.util.Scanner;

public class Question3 {

	 public static void main(String[] args){

	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter a expression: ");
	  String s = scanner.nextLine();
	      int lbC = 0;
	      int rbc = 0;   
	   for(int i=0; i<s.length(); i++){
	        if(s.charAt(i)==')')
	          rbc++;
	        if(s.charAt(i)=='(')
	          lbC++;
	      }
	   
	   
	      if(lbC!=rbc)
	         System.out.println("Invalid");
	       
	      else{
	      boolean condition = true;
	      String symbols = "-+%/*=";    
	     for(int i=0; i<s.length(); i++){
	         if(symbols.contains(s.charAt(i)+"")){
	           if(!Character.isAlphabetic(s.charAt(i-1))||!Character.isAlphabetic(s.charAt(i+1))){
	              condition = false;
	              System.out.println("Invalid");
	              break;
	            }     
	      }
	    }
	   if(condition){
	      System.out.println("Valid");
	     }  
	   }

	}

}
