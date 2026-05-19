import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	   int sum = 0;
	   for(int i = 1;i<n;i++){
	       if(n%i==0){
	           sum+=i;
	       }
	   }
	   if(sum==n){
	       System.out.print("Perfect Number");
	   }else{
	       System.out.print("Not a Perfect Number");
	   }
	}
}
