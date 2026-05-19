import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
    boolean prime = true;
    if(n<=1){
        prime = false;
    }
    else{
        
    for(int i = 2;i<n;i++){
        if(n%i==0){
            prime = false;
            break;
        }
    }
    }
    if(prime){
        System.out.print("Number is prime");
    }else{
         System.out.print("Number is not prime");
    }
	}
}
