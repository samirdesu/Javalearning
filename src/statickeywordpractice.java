public class statickeywordpractice {

    static int a=10;
    int b=20;

     static void m1(){ //static method
         System.out.println("This is a static method");
    }

    void m2(){ //non-static method
        System.out.println("This is a non-static method");
        System.out.println(a);
        System.out.println(b);
        m1();

    }

    public static void main(String[] args) {
        System.out.println(a); // here main is also static so we can call all static stuff directly
        m1();
        statickeywordpractice stc=new statickeywordpractice(); // calling non-static after creating object
        System.out.println("This is non static printing after object creation " + stc.b);
        stc.m2(); //calling non-static method
    }
}
