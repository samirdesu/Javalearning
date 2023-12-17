class first{
    int a;
    void  display(){
        System.out.println(a);
    }
}
class second extends first{ // extending value and method from parent class first
                            //now this class have two method show and display
    int b;

    void show(){
        System.out.println(b);
    }
}

class third extends second{
    int c;

    void print(){
        System.out.println(c);
    }
}
public class inheritancepractice {
    public static void main(String[] args) {
        second inobj=new second();
        inobj.a=100;
        inobj.b=200;
        inobj.display();
        inobj.show();
        third inobjth=new third();
        inobjth.a=2000;
        inobjth.b=3000;
        inobjth.c=4000;
        inobjth.display();
        inobjth.show();
        inobjth.print();
    }
}
