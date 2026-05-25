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
    String res = "";
    for(int i = 0;i<n;i++){
        char ch = str.charAt(i);
        if(ch>='A' && ch<='Z'){
            res+=Character.toLowerCase(ch);
        }else if(ch >='a' && ch<= 'z'){
           res+= Character.toUpperCase(ch);
        }
        else{
            res+=ch;
        }
    }
    System.out.print(res);
   }
}
