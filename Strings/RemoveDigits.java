import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int n = str.length();
        String result = "";
        for(int i = 0;i<n;i++){
            char ch = str.charAt(i);
            if(!(ch>='0' && ch<='9')){
                result+=ch;;
            }
        }
        System.out.print(result);
    }
}
