import javax.sound.midi.Soundbank;
import java.util.Date;

public class TestFormats {
    public static void main(String[] args) {
        String s = String.format("%,d", 1000000);
        System.out.println(s);

        String s1 = String.format("Мне нужно исправить %,.2f ошибки.", 476578.09876);
        System.out.println(s1);

        String s2 = String.format("%c", 120);
        System.out.println(s2);

        int one = 2020;
        double two = 12345.54321;
        s = String.format("Уровень  %,d из %,.2f", one, two);
        System.out.println(s + "\n");

        s = String.format("%tc", new Date());
        System.out.println(s + "\n");

        s = String.format("%tr", new Date());
        System.out.println(s + "\n");

        Date today = new Date();
        System.out.println(String.format("%tA, %tB %td", today, today, today) + "\n");

        System.out.println(String.format("%tA, %<tB %<td", today) + "\n");


    }
}