import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  
	 Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int max = Integer.MIN_VALUE;
     while(n>0){
         int digit = n%10;
         if(digit>max){
            max = digit;
         }
         n = n/10;
     }
     System.out.print(max);
	}
}
