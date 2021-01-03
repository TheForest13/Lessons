import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> inset = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++)
            inset.add(rand.nextInt(30));
        System.out.println(inset);

        SortedSet<Integer> inSetSort = new TreeSet<Integer>();
        for (int i = 0; i < 10000; i++)
            inSetSort.add(rand.nextInt(30));
        System.out.println(inSetSort);
    }
}
