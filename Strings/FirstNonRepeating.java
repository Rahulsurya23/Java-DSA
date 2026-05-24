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
       boolean found = false;
        for(int i = 0;i<n;i++){
             int count = 0;
         for(int j = 0;j<n;j++){
             if(str.charAt(i)==str.charAt(j)){
                 count++;
             }
         }
          if (count == 1) {
                System.out.print(str.charAt(i));
                found = true;
                break;
            }
        }
   if(!found){
       System.out.print("Not repeated");
   }
    }
}
