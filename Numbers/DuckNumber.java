import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);

        String num = scn.nextLine();

        boolean isDuck = false;

        // Check for 0 after first digit
        for (int i = 1; i < num.length(); i++) {

            if (num.charAt(i) == '0') {
                isDuck = true;
                break;
            }
        }

        if (isDuck) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
    }
}
