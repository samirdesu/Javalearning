public class constructoroverloading {
    int x,y;double z;
    constructoroverloading(){  //1
        x=10;
        y=20;
    }
    constructoroverloading(int a, int b){  //2
    x=a;
    y=b;
    }
    constructoroverloading(int a, double c){  //3
        x=a;
        z=c;
    }
    constructoroverloading(double c, int a){  //3
        x=a;
        z=c;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}
