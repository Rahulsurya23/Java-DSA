import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0;i<n;i++){
	        arr[i] = scn.nextInt();
	    }
	  int sum = 0;
	 for(int i = 0;i<n;i++){
	     if(arr[i]>0){
	         sum+=arr[i];
	     }
	 }
	 System.out.print(sum);
	}
}
