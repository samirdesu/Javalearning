class abc{
    void s(int a){
        System.out.println(a);
    }
    void k (int b){
        System.out.println(b);
    }
}
class xyz extends abc{
    void s(int a){
        System.out.println(a+a);
    }
    void k (int a, int b){
        System.out.println(b);
    }
}

public class overridingvsvoerloading {
    public static void main(String[] args) {
        xyz xyzobj = new xyz();
        xyzobj.k(100,200);
        xyzobj.k(10);
        xyzobj.s(40);
    }
}
