import java.util.Scanner;

public class exceptionhandeling {
    public static void main(String[] args) {
        System.out.println("Enter Your Number: ");
        Scanner sc =new Scanner(System.in);

        int a=sc.nextInt();
        try {
            System.out.println(100 / a); // try catch block will handle the exception
        }
        catch (Exception s){
            // if we know the exception name (ArithmeticException) have to write in catch block
            // s is a variable using it we can call the built-in methods.
            // if we do not know the exception name we can simpley write "Exception" and it will handel all type of exception
            System.out.println("Enter number between 1 to 100");
        }
        System.out.println("Program Completed");

    }

}
