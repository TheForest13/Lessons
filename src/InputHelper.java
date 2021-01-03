import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHelper {
    private static BufferedReader reader;

    public static String getInput(String title) {
        String line = null;
        System.out.println(title);
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            line = reader.readLine();
            if (line.length() == 0) return null;
        } catch (IOException ex) {
            System.out.println("Exception " + ex);
        }
        return line;
    }

    public static byte[] insert(int size) {
        byte[] values = new byte[size];
        String line;
        System.out.println("Вводите биты через пробел ");
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            line = reader.readLine();
            if (line.length() == 0) return null;
            String[] el = line.split(" ");
            for (int i = 0; i < size; i++) {
                values[i] = (byte)Integer.parseInt(el[i]);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return values;
    }
}
