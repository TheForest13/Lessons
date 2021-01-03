public class A {
    int x = 0;
    private int y = 1;
    void f(){
        System.out.println("default");
    }
    private void pf() {
        System.out.println("private");
    }
}

class B {
   static void pf(){
       System.out.printf("static");
    }
    public static void main(String[] args) {
        A a = new A();
       // System.out.println(a.y);
        pf();
    }
}

class C extends A {
    public static void main(String[] args) {
        A a = new A();
        a.f();
    }
}