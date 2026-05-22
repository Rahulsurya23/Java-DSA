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
		int j = 0;
		for(int i = 0;i<n;i++){
		    if(arr[i]!=0){
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		        j++;
		    }
		}
			for(int i = 0;i<n;i++){
	System.out.print(arr[i]+" ");
}
	}
}
