import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	    int m = scn.nextInt();
	    int x = n;
	    int y = m;
	    while(m!=0){
	        int temp = m;
	        m = n%m;
	        n = temp;
	    }
	    int ans = (x*y)/n;
	    System.out.print(ans);
	  
	}
}
