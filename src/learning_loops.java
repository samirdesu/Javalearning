import java.sql.SQLOutput;
import java.util.Arrays;

public class learning_loops {
    public static void main(String[] args) {
//        int a =9;
////        while(a<=10) {
////            System.out.println(a);
////            a++;
//
////        }
//
//        do {
//            System.out.println(a);
//
//        } while (a>10);

//        for (int a=0; a<9; a++){
//            System.out.println(a);
//        }
//
//        for (int b = 1; b < 11; b++) {
//
//            if (b == 5) {
//                System.out.println("loop break number 5 skipped");
//                continue;
//
//            } System.out.println(b);
//            System.out.println("In loop");
//
//
//        }
//        int n=4;
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++)
//                System.out.print("*");
//                System.out.print("\n");


//                for (int a=1;a<=5;a++){
//                    for (int b=1;b<=a;b++){
//                    System.out.print("*");
//
//                }System.out.print("\n");

                    for(int a=1;a<=5;a++){        // Star pattern and nested loop
                       for(int b=1;b<=a;b++){
                           System.out.print("+");
                   }System.out.print("\n");

        }
        System.out.println("Total loop break");

                    for (int a=5;a>0;a--){         //Star pattern and nested loop
                        for(int b=1;b<=a;b++){
                            System.out.print("+");
                        }
                        System.out.print("\n");
                    }
    }


}
