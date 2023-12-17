public class methodspractice {
    static void foo(){

        System.out.println("Good morning");
    }
    static void foo(int s){

        System.out.println("Good morning " + s + " Samir !");
    }
    static void foo(int s, int k){

        System.out.println("Good Night" + s + k +" Samir");
    }
    static int logic(int x, int y){
    int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }return z;
    }

    public static void main(String[] args) {

        int a = 6;
        int b = 1;
        int c;
        c=logic(a,b);
        System.out.println(c);

        int d=1;
        int e =7;
        int f;
        f=logic(d,e);
        System.out.println(f);

        // Method Overloading
         foo();
         foo(1000);
        foo(1000,3000);
    }
}
