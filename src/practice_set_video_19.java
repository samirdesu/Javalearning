import java.util.Scanner;

public class practice_set_video_19 {
    public static void main(String[] args) {
        //   Question Number 1
//        int a = 11;
//        if (a == 10) {
//            System.out.println("My age is 11");
//
//        } else {
//            System.out.println("My age is not Eleven");
//        }
        //   Question Number 2 - How to tell pass or fail
//        Scanner sc=new Scanner(System.in);
//        int total =300;
//        System.out.println("Enter your marks in Eng:");
//        float eng=sc.nextFloat();
//        System.out.println("Enter your marks in History:");
//        float his=sc.nextFloat();
//        System.out.println("Enter your marks in Maths:");
//        float Maths=sc.nextFloat();
//        float totalmarks=(eng+his+Maths)/total*100;
//        System.out.println("Your Total percentage is: "+ totalmarks);
//        if (totalmarks>=33&&eng>=33&&his>=33&&Maths>=33){
//
//            System.out.println("Congo ! You have passed");
//        }else {
//            System.out.println("Better Luck next time");
//        }
//       Question Number 3 my version - How to calculate Tax

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your Yearly Income: ");
//        float totalincome=0;
//        totalincome=sc.nextFloat();
//        if(totalincome>499999&&totalincome<=500000){
//            System.out.println("Total Tax Amount: "+totalincome*5/100);
//
//        }else if (totalincome>=500001&&totalincome<=1000000f){
//
//            System.out.println("Total Tax Amount:"+totalincome*20/100 );
//
//        }else if (totalincome>=1000001f) {
//
//            System.out.println("Total Tax Amount: " + totalincome*30/100);
//
//        }else {
//            System.out.println("Your are Tax Excempt");
//        }
//
//       Question Number 3 Harry version - How to calculate Tax

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your Yearly Income: ");
//        float tax=0;
//        float income=sc.nextFloat();
//
//        if(income<=250000){
//            System.out.println("You are Tax Excempt");;
//        }
//        else if(income>250000f&&income<=500000f){
//        tax=tax+(income-250000f)*5/100;
//        }
//        else if(income>500000f&&income<=1000000f){
//            tax=(500000-250000f)*5/100;
//            tax=tax+(income-250000f)*20/100;
//        }
//        else if(income>1000000f){
//            tax=(500000-250000f)*5/100;
//            tax=tax+(1000000f-500000)*20/100;
//            tax=tax+(income-1000000f)*30/100;
//
//        }
//        System.out.println("Total tax: " + tax);

//        Question Number 4- How to Get the day of a week
//        Scanner sc=new Scanner(System.in);
//        byte day= sc.nextByte();
//        switch (day){
//            case 1 ->   System.out.println("Monday");
//            case 2 ->   System.out.println("Tuesday");
//            case 3 ->   System.out.println("Wednesday");
//            case 4 ->   System.out.println("Thursday");
//            case 5 ->   System.out.println("Friday");
//            case 6 ->   System.out.println("Saturday");
//            case 7 ->   System.out.println("Sunday");
//            default -> System.out.println("Enter number between 1 to 7");
//        }

//        Question Number 6 - How to know what type of website it is

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your complete Website URL : ");
//        String website = sc.nextLine();
//        if (website.endsWith(".com")) {
//            System.out.println("This is a comercial website");
//        } else if (website.endsWith(".org")){
//            System.out.println("This is an organization website");
//
//        }else if (website.endsWith(".in")){
//            System.out.println("This is an India Website");
//
//
//        }

        // Question number 5 - How to calculate Leap Year

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        float year=sc.nextInt();
        if (year%4==0&&year%100!=0 || year%100==0&&year%400==0){
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is not a leap year");
        }


    }
}
