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
	    boolean sorted = true;
	  for(int i = 1;i<n;i++){
	      if(arr[i]<arr[i-1]){
	          sorted = false;
	          break;
	      }
	  }
	  if(sorted){
	      System.out.print("Sorted");
	  }
	  else{
	      System.out.print("Not sorted");
	  }
	}
}
