import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        System.out.println("Enter your text to check for palindrome");
        Scanner sc=new Scanner(System.in);
        String a =sc.next();
        String b="";
        for(int i=a.length()-1;i>=0;i--) {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }
}
   /* String a="MaDam";
    String rev="";
        for(int i=a.length()-1;i>=0;i--){
                rev=rev+a.charAt(i);
                }if (a.equalsIgnoreCase(rev)){

                System.out.println("This is a palindrome");
                }else {
                System.out.println("This is not a palindrome");
                }*/