public class Methodoverloading {
    int x,y;
    double z;

    //1
    void sum(){
        x=10;
        y=20;
        System.out.println(x+y);
    }
    //2
    void sum(int a, int b){
        x=a;
        y=b;
        System.out.println(x+y);
    }
    //3
    void  sum(int a, double c){
        x=a;
        z=c;
        System.out.println(x+z);
    }
   //4
    void sum(double c, int a){
        x=a;
        z=c;
        System.out.println(x+z);
    }

    }

