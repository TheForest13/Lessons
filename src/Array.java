import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        int[] t = new int[]{2,0,1,7};
        ArrayList<Integer> test = new ArrayList<Integer>();
        for (int i = 0; i < t.length; i++){
            test.add(i, t[i]);
            System.out.println(t[i]);
        }
        System.out.println(test);
    }
}

