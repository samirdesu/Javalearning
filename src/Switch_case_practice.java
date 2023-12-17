import java.util.Scanner;

import static java.lang.System.*;

public class Switch_case_practice {
    public static void main(String[] args) {

        Scanner practice = new Scanner(in);
        int a = practice.nextInt();
        switch (a) {
            case 10 -> out.println("You have entered number 10");
            case 15 -> out.println("You have entered 15");
            case 20 -> out.println("You have entered 20");
            default -> out.println("Please enter a valid number");
        }

    }
}
