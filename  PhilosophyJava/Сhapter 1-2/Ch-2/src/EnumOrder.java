public class EnumOrder {
    enum Spiciness{
        NOT_DONT, MILD, MEDIUM, HOT, FLAMING
    }

    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values()){
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
