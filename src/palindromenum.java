import java.util.Scanner;

public class palindromenum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt(), r, s = 0;
        int c = n;
        while (n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;

        }
        if (c == s) {
            System.out.println("This number is Palindrome");
        } else {
            System.out.println("This number not palindrome");
        }
    }
}




