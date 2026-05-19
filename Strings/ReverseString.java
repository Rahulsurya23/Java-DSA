import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int n = str.length();
		String rev = "";
		for(int i = n-1;i>=0;i--){
		    rev = rev+str.charAt(i);
		}
		System.out.print(rev);
	}
}
