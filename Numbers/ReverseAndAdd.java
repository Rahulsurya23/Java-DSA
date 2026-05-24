import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();
        int original = n;
        int sum = 0;
        int reverse = 0;
        while(n>0){
            int last = n%10;
            reverse=reverse*10+last;
            n = n/10;
        }
        int res = original + reverse;
        System.out.print(res);
    }
}
