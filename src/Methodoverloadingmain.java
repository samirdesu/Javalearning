public class Methodoverloadingmain {
    public static void main(String[] args) {
        Methodoverloading mo=new Methodoverloading();
        mo.sum();//1
        mo.sum(20,30);//2
        mo.sum(20,30.5);//3
        mo.sum(41.5,10);//4
    }
}
