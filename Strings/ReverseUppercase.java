import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

       
        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper += ch;
            }
        }

       
        String result = "";
        int index = upper.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += upper.charAt(index);
                index--;
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
