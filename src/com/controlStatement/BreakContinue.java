package com.controlStatement;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=0;i<=10;i++) {
    	  if(i==5) {
    		  continue;
    	  }
    	  System.out.println(i);
    	  if(i==8) {
    		  break;
    	  }
    	  
      }
      System.out.println("Rest of code.....");
	}

}
