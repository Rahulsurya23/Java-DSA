import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();
        int original = 0;
        int sum = 0;
        while(n>0){
            int last = n%10;
            sum+=last;
            n = n/10;
        }
        int result = original%sum;
        if(result==0){
            System.out.print("Harshad Number");
        }else{
            System.out.print("Not");
        }
    }
}
