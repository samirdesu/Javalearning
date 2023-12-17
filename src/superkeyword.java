class animal{
    String color="White";
    void action(){
        System.out.println("Eating");
    }
}
class dog extends animal {
    String color = "Black";
    void clr () {
//        System.out.println("The color is black");
        System.out.println(super.color);
    }
    void action() {
        System.out.println("Eating biscuit");
    }
}

public class superkeyword {
    public static void main(String[] args) {
        dog dg=new dog();
        dg.action();
        dg.clr();
    }
    }

