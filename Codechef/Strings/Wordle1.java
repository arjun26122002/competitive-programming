package Strings;

import java.util.Scanner;

class Wordle1{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		    String a=sc.next();
		    String b=sc.next();
		    StringBuilder sb=new StringBuilder();
		    
		    for(int i = 0;i < 5; i++ ){
		        if(a.charAt(i)==b.charAt(i)){
		            sb.append("G");
		          //System.out.println("G");
		        }
		        else{
		            sb.append("B");
		          //System.out.println("B");
		        }
		        
		    }
		    System.out.println(sb.toString());
		  //System.out.println();
		    
		}
		
		
		
		
       
    }
	
	
}
