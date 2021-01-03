import java.util.Iterator;

public class IterableClass implements Iterable{
    protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private  int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            public void remove() { // не реализован
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (Object s : new IterableClass()) {
            System.out.print(s + " ");
        }
    }
}
