import java.lang.Object; // забавы ради

public class BuzzwordsReport extends Report {
    void runReport(){
        System.out.println("report run Buzz");
    }

    void printReport(){
        System.out.println("print report Buzz");
        super.runReport();
    }

    public static void main(String[] args) {
        BuzzwordsReport x = new BuzzwordsReport();
        System.out.println(x.getClass());
        x.runReport();

        x.printReport();
    }
}

abstract class Report {
    void runReport(){
        System.out.println("report is Report");
    }

    abstract void printReport();
}

