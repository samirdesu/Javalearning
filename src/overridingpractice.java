class Bank{
    double roi(double a){
        return a;
    }
}
class icici extends Bank{
    double roi(double a){
        return a;
    }
}
class axis extends Bank{
    double roi(double a){

        return a;
    }
}

public class overridingpractice {
    public static void main(String[] args) {
        icici ici=new icici();
        double df=ici.roi(10.7);
        System.out.println(df);
    }
}
