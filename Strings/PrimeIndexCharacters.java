import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // Function to check prime index
    public static boolean isPrime(int num)
    {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        // Print characters at prime indices
        for (int i = 0; i < str.length(); i++) {

            if (isPrime(i)) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
