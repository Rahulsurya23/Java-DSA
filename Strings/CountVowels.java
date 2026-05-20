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
		int count = 0;
	    for(int i = 0;i<n;i++){
	        char ch = str.charAt(i);
	       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
	            count+=1;
	        }
	    }
	    System.out.print(count);
	}
}
