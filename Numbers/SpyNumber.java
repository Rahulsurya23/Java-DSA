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
   int product = 1;
   while(n>0){
       int last = n%10;
       sum+=last;
       product*=last;
       n = n/10;
   }
   if(sum==product){
       System.out.print("Yes");
   }else{
       System.out.print("No");
   }
}
}
