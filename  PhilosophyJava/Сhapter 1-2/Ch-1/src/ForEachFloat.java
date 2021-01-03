import org.w3c.dom.ranges.Range;

import java.awt.font.NumericShaper;
import java.util.Random;
import java.util.stream.IntStream;


public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        for (float x : f)
            System.out.println(x);

        String str = "Ноги в руки";
        for(char c : str.toCharArray() )
            System.out.print(c + " ");


       
    }
}
