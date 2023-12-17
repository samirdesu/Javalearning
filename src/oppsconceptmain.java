public class oppsconceptmain {
    public static void main(String[] args) {

        /* Approch 01 using refference variable
        oopsconceptpractice sc=new oopsconceptpractice();
        sc.empno=101;
        sc.empname="Samir";
        sc.empsalary=40000;
        sc.display();*/

        //Approach 2 using method

        oopsconceptpractice sc=new oopsconceptpractice();
        sc.show(101,"Samir",5000);
        sc.display();

/*        Approach 3 using constructor
        oopsconceptpractice sc=new oopsconceptpractice(101,"Samir",40000);
        sc.display();*/

    }
}
