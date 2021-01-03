public class WhileTest {

    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
}
    public static void main(String[] args) {
        /*while(condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");*/

        for(char c = 0; c < 128; c++)
            if (Character.isLowerCase(c))
                System.out.println("Значениe: " + (int) c + " символ: " + c);

    }
} /* (Выполните, чтобы просмотреть результат) *///:~

