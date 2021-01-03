import java.util.*;

public class UsingStringBuilder {
    public static Random rand = new Random(47);

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");

        String str = "0";
        for(int i=1; i<10;i++){
            str += i;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }

}

