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
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i = 0;i<n;i++){
		    if(arr[i]<min){
		        min = arr[i];
		        index = i;
		    }
		}
		System.out.print(index);

	}
}
