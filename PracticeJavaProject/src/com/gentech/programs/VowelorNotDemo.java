package com.gentech.programs;

public class VowelorNotDemo {

	public static void main(String[] args) {
		char ch=args[0].charAt(0);  
		  
		  if((ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U'))
		  {
		   System.out.println(ch+" is vowel");
		  }
		  else {
		   System.out.println("not vowel");
		 }

	}

}
