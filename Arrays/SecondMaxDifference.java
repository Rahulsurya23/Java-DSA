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
	int largest = Integer.MIN_VALUE;
	int secondLargest = Integer.MIN_VALUE;
	for(int i = 0;i<n;i++){
	  if(arr[i]>largest){
	      secondLargest = largest;
	      largest = arr[i];
	  }
	  else if(arr[i]>secondLargest && largest!=arr[i]){
	      secondLargest = arr[i];
	  }
	  
	     }
	   int ans = (largest-secondLargest);
	   System.out.print(ans);
   }
}
