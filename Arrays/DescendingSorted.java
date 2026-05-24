import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        boolean sorted = true;

        // Check descending order
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Sorted in Descending Order");
        } else {
            System.out.println("Not Sorted in Descending Order");
        }
    }
}
