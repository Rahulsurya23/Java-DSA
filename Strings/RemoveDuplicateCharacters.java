import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        String result = "";

       
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
