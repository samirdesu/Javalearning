public class methodpracticemain {

    public static void main(String[] args) {
        methodpractice mp=new methodpractice();
        mp.greeting();//1
        mp.greeting2("Samir"); //2
        String str=mp.greetings3(); //3
        System.out.println(str); //3
        System.out.println(mp.greetings3()); //3 different printing approach
        String stp=mp.greetings4("Samir");//4
        System.out.println(stp);//4
        System.out.println(mp.greetings4("Samir"));//4 different printing approach




    }
}
