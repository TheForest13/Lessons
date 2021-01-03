public class Main {
    static int a;
    static Main main = new Main(4);
    Main(int c) {
        a = c;
    }
    //Main(){}

    final void f(){
        System.out.println("test");
    }

    void f(int x) {
        System.out.println(x);
    }
    public static void main(String[] args) {
        Main m = new Main(2);
        System.out.println(a);

        int[] x = {1,3};
        System.out.println(x[1]);
        Integer[] а = {
                new Integer(1),
                new Integer(2),
                3, // Autoboxing
        };

        Integer[] mint = {new Integer(3), 4};
    }
}
class Main2 extends Main {

    Main2(int c) {
        super(c);
    }

    void f(int x){

    }
}