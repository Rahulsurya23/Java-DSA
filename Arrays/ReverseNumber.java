import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int rev = 0;

        while (n > 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }

        System.out.println(rev);
    }
}
