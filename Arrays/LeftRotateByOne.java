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
		int first = arr[0];
		for(int i = 0;i<n-1;i++){
		    arr[i] = arr[i+1];
		}
		arr[n-1] = first;
		for(int i = 0;i<n;i++){
		    System.out.print(arr[i] + " ");
		}
	}
}
