public class ExceptionMethods {
    static void f() {
        // Генерируем исключение для заполнения трассировки стека
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
       /* try {
            throw new Exception("Мое исключение");
        } catch (Exception e) {
            System.out.println("Перехвачено");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e);
            System.out.println("printStackTrace");
            e.printStackTrace(System.out);
        }
        System.out.println("\n");*/

        f();
        System.out.println("------------------------------------");
        g();
        System.out.println("------------------------------------");
        h();

    }
}
