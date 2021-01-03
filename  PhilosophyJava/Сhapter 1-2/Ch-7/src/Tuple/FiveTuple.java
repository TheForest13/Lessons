package Tuple;

public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
    public final E fifth;
    public FiveTuple(A a, B b, C c, D d, E e){
        super(a, b, c, d);
        fifth = e;
    }
    public String toString(){
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ", " + fifth + ")";
    }

    public static void main(String[] args) {
        FiveTuple f = new FiveTuple(new GG(), new GG(), new GG(), new GG(), new GG());
        System.out.println(f.toString());
    }
}
class GG {}