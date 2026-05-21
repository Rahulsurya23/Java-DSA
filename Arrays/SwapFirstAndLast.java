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
	
		
		    int temp = arr[0];
		    arr[0] = arr[n-1];
		    arr[n-1] = temp;
		    
		   
		
			for(int i = 0;i<n;i++){
			    System.out.print(arr[i]+" ");
			}
		
	}
}
