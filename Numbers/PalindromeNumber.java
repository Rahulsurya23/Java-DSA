import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int original = n;
		int rev = 0;
		while(n>0){
		    int last = n%10;
		    rev =rev*10+last;
		    n = n/10;
		}
		if(rev==original){
		    System.out.print("true");
		}else{
		    System.out.print("false");
		}

	}
}
