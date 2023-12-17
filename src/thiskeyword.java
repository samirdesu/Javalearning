public class thiskeyword {
int x,y; //instance variable

//void setdata(int x, int y){  /*if the local variable and above instance variable are same
//    then we use this keyword it tells JVM we are talking about the above instance variable */
//    this.x=x; // this.x is above int x
//    this.y=y; //this.y is above int y
//}
//
//void display(){
//    System.out.println(x);
//    System.out.println(y);
//}

    thiskeyword (int x, int y){
    this.x=x;
    this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
//        thiskeyword tk=new thiskeyword();
//        tk.setdata(20,30);
//        tk.display();
        thiskeyword tk=new thiskeyword(30,40);
        tk.display();
    }
}
