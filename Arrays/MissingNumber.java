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
	int total = (n+1)*(n+2)/2;
	int sum = 0;
	for(int i = 0;i<n;i++){
	  sum+=arr[i];
	}
	int missing = total - sum;
	System.out.print(missing);

	}
}
