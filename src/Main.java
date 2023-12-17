import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

/*
//         Press Alt+Enter with your caret at the highlighted text to see how
//         IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//         Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
*/
        Scanner s =new Scanner(System.in);
        float total = 400F;
        System.out.println("Enter Your full name: ");
        String name=s.nextLine();
        System.out.println("Enter Your Marks in English");
        float Eng = s.nextFloat();
        System.out.println("Enter Your Marks in History");
        float His=s.nextFloat();
        System.out.println("Enter Your Marks in Maths");
        float Math=s.nextFloat();
        System.out.println("Enter Your Marks in Geography");
        float Geo=s.nextFloat();
        float totalmarks=Eng+His+Math+Geo;
        float percentage=totalmarks/total*100;
        System.out.println("Your Name is: " + name);
        System.out.println("Your percentage is: " +percentage);
            float a =7/4.0f*9/2.0f;
        }
    }

