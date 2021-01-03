public class Main12 {

    void f(){
        System.out.println("что то делает");
    }
    public static void main(String[] args) {
        try {
            System.out.println("try");
        } finally {
            System.out.println("finally");
        }
    }
}

class Main21 extends Main12{
    public static void main(String[] args) {
        Main21 mn = new Main21();
        mn.f();
    }
}
