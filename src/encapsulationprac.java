public class encapsulationprac {

   private int emp_no;
    private String emp_name;
    private double emp_sal;

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_sal(double emp_sal) {
        this.emp_sal = emp_sal;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public double getEmp_sal() {
        return emp_sal;
    }

    public static void main(String[] args) {
        encapsulationprac en=new encapsulationprac();
        en.setEmp_no(101);
        en.setEmp_name("Samir");
        en.setEmp_sal(10000);
        System.out.println(en.getEmp_no());
        System.out.println(en.getEmp_name());
        System.out.println(en.getEmp_sal());



    }

}
