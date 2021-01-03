interface F1 {
    int x1 = 2;
    String f1();
}

interface F2 {
    String f2();

    String f22();
}

interface F12 extends F1, F2 {
    @Override
    String f22();
}




interface Two {
    int two();
    public interface inF{
        int fd();
    }
}

abstract class Ab {
    static int x = 0;
    int xx = 0;

    static int plus(int y) {
        x += y;
        return x;
    }

    int plus() {
        xx++;
        return xx;
    }
}
enum Day {Monday, Tuesday}

public class Intro extends Ab implements F12, Two.inF {
    private class prCL {

    }

//    Intro intro = new Intro();
    public static void main(String[] args) {
        Intro obj = new Intro();
        Intro obj2 = new Intro();
        System.out.println(obj.plus());
        System.out.println(obj2.plus());
        System.out.println(F1.x1);
        /*Intro intro2 = new Intro();
        System.out.println(Ab.plus(2));
       // System.out.println(obj.intro.plus());
        System.out.println(intro2.plus());
        F1 ff = new Intro();
        System.out.println(ff.x1);
        System.out.println(Day.Monday);*/
    }

    interface In2 {
        interface prIn {

        }
    }

    @Override
    public String f1() {
        return null;
    }

    @Override
    public String f2() {
        return null;
    }

    @Override
    public String f22() {
        return null;
    }

    @Override
    public int fd() {
        return 0;
    }

    public class inC implements Two{

        @Override
        public int two() {
            return 0;
        }
    }
}