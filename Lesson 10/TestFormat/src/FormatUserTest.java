import java.util.Date;

public class FormatUserTest {
    public static void main(String[] args) {
        int x = -1;
        while (x < 0) {
            String s = String.format("%tr", new Date());
            System.out.println(s);
            x--;

        }
    }
}
