package collectiondemo;

import java.util.ArrayList;

public class arrylistdemo {
    public static void main(String[] args) {
        ArrayList li=new ArrayList();

        li.add(100);
        li.add("Welcome");
        li.add(null);
        li.add(10.5);
        System.out.println(li);
        System.out.println(li.get(1)); // print value in 1
        System.out.println(li.size()); // 4
        li.remove(0);
        System.out.println("After removing data from 0 index: "+li);
        li.add(2,100);
        System.out.println("After adding data on 2 index: "+li);
        for(Object x:li){
            System.out.println(x); // to print in vertical line

        }

        li.clear();
        System.out.println("Arraylist after clearing: " +li); // print [] as nothing inside available



    }
}
