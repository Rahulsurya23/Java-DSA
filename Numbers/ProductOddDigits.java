import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  
	 Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int product = 1;
     while(n>0){
         int digit = n%10;
         if(digit%2!=0){
             product*=digit;
         }
         n = n/10;
     }
     System.out.print(product);
	}
}
