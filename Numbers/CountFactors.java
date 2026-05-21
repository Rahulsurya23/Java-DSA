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
		for(int i = 1;i<=n;i++){
		    if(n%i==0){
		        count++;
		    }
		}
		System.out.print(count);
	}
}
