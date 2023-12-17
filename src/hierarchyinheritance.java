//This is a hierarchy inheritance, in which one parent class and
// multiple child class but there is no relation between the child class
class parent{

    void show(int num){
        System.out.println(num);
    }
}
class child1 extends parent{
     void display(int num){
         System.out.println(num);
     }
}

class child2 extends parent{

    void print(int num){
        System.out.println(num);
    }
}

public class hierarchyinheritance {
    public static void main(String[] args) {
        child1 ch1 = new child1();
        ch1.show(100);
        ch1.display(200);
        child2 ch2 = new child2();
        ch2.show(300);
        ch2.print(400);

    }
}

