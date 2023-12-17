import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class learning_array {
    public static void main(String[] args) {

        /*
        // writing style 1 //Declaration and memory allocation
        int [] marks = new int[5]; //for array memory allocation star form 0
        marks[0]=12;
        marks[1]= 50;
        marks[2]=40;
        marks[3]=60;
        marks[4]=78;
        System.out.println(marks[0]);

        // writing style 2//Declaration and then memory allocation
        int[]mark;
        mark=new int[6];
        mark[0]=1;
        mark[1]= 5;
        mark[2]=4;
        mark[3]=6;
        mark[4]=8;
        System.out.println(mark[0]);

        //writing style 3 // Declaration, memory allocation and initialization all together
        int[] mar={99,88,77,41};
        System.out.print(mar[2]);
        */
        // Printing the length of Array
        System.out.println("Printing length of Array");
        int[] sk = {10, 20, 30, 40}; // print 4
        System.out.println(sk.length);

        // Printing the value of Array using loop
        System.out.println("Printing value using for loop normal order");
        for(int i = 0; i < sk.length; i++) {
            System.out.println(sk[i]);
        }
        // Printing the value of Array using loop reverse order
        System.out.println("Printing using for loop reverse order");

        for (int i = sk.length - 1; i >= 0; i--) {
            System.out.println(sk[i]);

        }

        //Enhance loop practice
        System.out.println("Printing using for each loop");
        for(int element :sk){
            System.out.println(element);
        }
        // Find Sum of Elements in Array

        System.out.println("Find Sum of Elements in Array");
        int p[]={5,6,7,8,9};
        int lum=0;
        for(int j=0;j<=p.length-1;j++){
            lum=lum+p[j];
        } System.out.println("Total value is "+lum);

        // Print Even and Odd numbers from array using loop.

        System.out.println("Printing ODD numbers");
        int s[]={2,1,4,3,5,6};


        for(int t=0;t<=s.length-1;t++){
            if(s[t]%2==0)
                System.out.println(s[t]);
        }
        System.out.println("Printing Even numbers");
        for(int t=0; t<=s.length-1;t++){
        if(s[t]%2!=0)
            System.out.println(s[t]);
        }

        // Print Even and Odd numbers from array using enhanced loop.

        System.out.println("Printing Even numbers using enhanced loop");

        for(int value:s){
            if(value%2==0)
                System.out.println(value);
        }

        System.out.println("Printing Odd numbers using enhanced loop");
    for(int value:s) {
        if (value%2!=0)
            System.out.println(value);
    }
        // How to sort Arrays
        //Approach 1
        System.out.println("Array before Sorting "+Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("Array After Sorting "+Arrays.toString(s));

        //Approach 2
        System.out.println("Arrays Before Sorting "+Arrays.toString(s));
        parallelSort(s);
        System.out.println("Arrays After Sorting "+Arrays.toString(s));

        // Sorting in reverse order

        Integer t[]={8,1,4,7,9,6,5,2,3};
        System.out.println("Arrays before sorting"+Arrays.toString(t));
        Arrays.sort(t, Collections.reverseOrder());
        System.out.println("Arrays After sorting"+Arrays.toString(t));

        //Search an element in array using Linear Search
        System.out.println("Search an element in array using Linear Search");
        int z[]={60,10,70,40,90};
        int search=100;
        boolean flag=false;
        for (int g=0;g<=z.length-1;g++) {
//            System.out.println(z[g]);
            if(search==z[g]) {
                System.out.println("Element found: " + g);
                flag=true;
                break;
            }
            }if (flag == false) {
            System.out.println("Element not available");


            }


        }
        }







