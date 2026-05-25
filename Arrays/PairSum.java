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
	int x = scn.nextInt();
boolean found = false;
	for(int i = 0;i<n;i++){
	    for(int j = i+1;j<n;j++){
	        if(arr[i]+arr[j]==x){
	            System.out.print(arr[i]+" "+arr[j]);
	            found = true;
	            break;

	        }
	    }
	    if(found){
	        break;
	    }
	}
	
	if(!found){
	    System.out.print("Not found");
	}

	}
}
