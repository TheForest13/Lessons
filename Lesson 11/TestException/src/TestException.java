//public class TestException {
//    public static void main(String[] args){
//        String test = "Нет";
//        try {
//            System.out.println("Начало try");
//            doRisk(test);
//            System.out.println("Конец try");
//        } catch(ScaryException se) {
//            System.out.println("Жуткое исключение");
//        } finally {
//            System.out.println("finally");
//        }
//        System.out.println("end main");
//    }
//
//    static void doRisk(String test) throws ScaryException {
//        System.out.println("начало опасного кода");
//        if ("yes".eauals(test)) {
//            throw new ScaryException();
//        }
//        System.out.println("конец опасного метода");
//        return;
//    }
//}
