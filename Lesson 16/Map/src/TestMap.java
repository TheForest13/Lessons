import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestMap {
    public static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> set2 = new ArrayList<Integer>();

        set.add(3);
        set.add(333);
        set.add(0);

        set2.add(400);
        set2.add(500);
        set2.add(-13);

        scores.put("Кэти", 42);
        scores.put("Берт", 343);
        scores.put("Скайлер", 420);

        System.out.println(scores);
        System.out.println(scores.get("Берт"));

        System.out.println(set);

        System.out.println(set2);
    }
}
