public class Sample1 {
    int x;
    int y = 3;
    static int st;

    static {
        st = 0;
    }

    int ReturnNum(int y){
        y = y;
        return y;
    }
    void aVoid(){

        return;
    }

    public static void main(String[] args) {
        Sample1 ch = new Sample1();

        System.out.println(ch.y);
        System.out.println(ch.ReturnNum(5));
        System.out.println(ch.y);

        ch.st++;
        Sample1.st++;
        System.out.println(st);
    }
}
