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
	boolean palindrome = true;
    int start = 0;
    int end = n-1;
	for(int i = 0;i<n;i++){
	 if(arr[start] != arr[end]){
	     palindrome = false;
	     break;
	 }
	 start++;
	 end--;
	}
	if(palindrome){
	     System.out.print("palindrome");
	}else{
	    System.out.print("Not Plaindrome");
	}
	
	
	}
}
