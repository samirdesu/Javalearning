import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class If_statements {
    public static void main(String[] args) {
////        Scanner SC = new Scanner(System.in);
////            System.out.println("Enter Your Age To Check Eligibility");
////            int age=SC.nextInt();
////            if(age>=19&&age<=70){
////                System.out.println("Cong !! Your are Eligible");
////            }
////            else {
////                System.out.println("Sorry, You are not Eligible");
////            }
////    }
//        boolean a = true;
//        boolean b = false;
//        System.out.println("Not A is " + !a);
//        System.out.println("Not B is " + !b);
//        if (a||b){
//            System.out.println("Y");
//        }
//
//        else {
//            System.out.println("N");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Age: ");
//        int age;
//        age=sc.nextInt();
//
//        if(age>60){
//            System.out.println("You are not eligible");
//        } else if (age>18) {
//            System.out.println("You are eligible");
//
//        } else {
//            System.out.println("You are rejected");
//
//        }

//        Scanner s=new Scanner(System.in);
//        System.out.println("Odd, Even checker. Enter your number: ");
//        int x;
//        x=s.nextInt();
//        if(x%2==0){
//            System.out.println("This is a Even number");
//        }else {
//            System.out.println("This is a ODD number");
//        }

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Equal too checker ");
//        int a;
//        int b;
//        System.out.println("Enter number 1");
//        a=sc.nextInt();
//        System.out.println("Enter number 2");
//        b=sc.nextInt();
//        if(a==b){
//
//            System.out.println("Both numbers are equal");
//        } else if (a>b) {
//            System.out.println("Number 1 is greater than number 2");
//
//        } else if (a<b) {
//            System.out.println("Numeber 2 is greater than number 1 ");

//        int age;
//        System.out.println("Enter your number:");
//        Scanner sam=new Scanner(System.in);
//        age=sam.nextInt();
//        switch (age) {
//            case 18 -> System.out.println("You are an Adult");
//            case 23 -> System.out.println("You are going to get an job");
//            case 70 -> System.out.println("You are going to retire");
//            default -> System.out.println("Enjoy life");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name::");;
        String str = sc.nextLine();
       // String s1 = str.substring(0, 1).toUpperCase();  // first letter = J
       // String s2 = str.substring(1);     // after 1st letter = avatpoint
        String res = str.substring(0, 1).toUpperCase() + str.substring(1);

        switch (res) {
            case "Abhijeet" -> System.out.println("You are best");
            case "Subham" -> System.out.println("You are not rocker");
            case "Pravallika" -> System.out.println("You are awesome");
            default -> System.out.println(" Get lost");
        }

    }

}







