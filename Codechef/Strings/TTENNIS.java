package Strings;

import java.util.*;
import java.lang.*;
import java.io.*;

public class TTENNIS {
    public static void main(String[] args) throws java.lang.Exception {
        
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0){
		    String a=sc.next();
		    int c1=0, c2=0;
		    
		    for (int i=0;i<a.length();i++){
		        char ch=a.charAt(i);
		        if(ch == '1')
		            c1++;
		            c2=a.length()-c1;
		        
		    }
		        String ans= c1 > c2 ? "WIN" : "LOSE" ;
		        System.out.println(ans);
		        t--;
		    }
		}
    }
    

