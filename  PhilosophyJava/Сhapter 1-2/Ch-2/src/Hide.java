class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
    void doh(Milhous m, int x){}
}

class Milhous {}

class Bart extends Homer {
    void doh(Milhous m){
        System.out.println("doh(Milhouse)");
    }
}

class Lisa extends Homer {
    @Override
    void doh(Milhous m, int y){
        System.out.println("doh(Milhouse)");
    }
}
public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhous());
    }
}
