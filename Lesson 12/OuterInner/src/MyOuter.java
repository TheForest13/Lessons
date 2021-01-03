public class MyOuter {
    private int x = 3;
    MyInner inner = new MyInner();

    public void doStuff(){
        inner.go();
    }

    class MyInner {
        void go(){
            x= 42;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        MyOuter main = new MyOuter();
        main.doStuff();
        System.out.println(main.x);

    }
}
