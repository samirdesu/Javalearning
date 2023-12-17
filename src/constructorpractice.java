public class constructorpractice {
    int x,y;
    String z;

    //Default constructor
   /* constructorpractice(){
        x=10;
        y=20;
        z="Samir";

    }*/
    //Parameterized constructor
    constructorpractice(int a, int b, String c){
        x=a;
        y=b;
        z=c;

    }
    void display(){

        System.out.println(x+y+"  "+z);
    }

}
