class MyEx extends Exception {

}

public class ExTestDrive {
    public static void main(String[] args) {
        String test = "yes";
        System.out.print("t");

        try {
            doRisky(test);
        } catch (MyEx ex) {
            System.out.print("a");
        } finally {
            System.out.println("ws");
        }
    }

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)){
            throw new MyEx();
        }
        System.out.print("ro");
    }
}