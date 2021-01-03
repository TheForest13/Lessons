import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) {storage.add(item); }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s : ("Кукушка рябчик памада рука человек язык").split(" "))
            rs.add(s);
        for(int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
        System.out.println();
        RandomList<Integer> rd = new RandomList<Integer>();
        int[] n = {22,33,44,55,66};
        for(Integer tt: n)
            rd.add(tt);
        for(int i = 0; i < 11; i++)
            System.out.print(rd.select() + " ");
    }
}
