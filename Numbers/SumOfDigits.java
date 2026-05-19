import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int count = 0;
	while(n>0){
	    int last = n%10;
	    count+=last;
	    n = n/10;
	}
	System.out.print(count);

	}
}
