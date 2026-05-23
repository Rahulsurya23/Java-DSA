import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){

            String word = words[i];

            for(int j = word.length() - 1; j >= 0; j--){
                System.out.print(word.charAt(j));
            }

            System.out.print(" ");
        }
    }
}
