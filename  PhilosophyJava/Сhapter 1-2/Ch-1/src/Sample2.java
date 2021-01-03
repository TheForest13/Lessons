import java.util.Date;

public class Sample2 {
    public static void main(String[] args) {

        int x = 3, y = 5, z = 6;

        System.out.println("Привет, сегодня: ");
        System.out.println(new Date()+"\n");

        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.clearProperty("java.library.path"));

    }
}
