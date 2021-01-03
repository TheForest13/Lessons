public class SimpleEnumUse {
    enum Spiciness{
        NOT_DONT, MILD, MEDIUM, HOT, FLAMING
    }

    public static void main(String[] args) {
       Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
    }
}
