import java.util.*;
import java.lang.*;
import java.io.*;

public class practiceperf {

    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[4];
		int c=0;
		for (int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]>=10){
		       c++;
		    }
		    
		}
		System.out.println(c);
	}
}