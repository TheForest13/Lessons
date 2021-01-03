public class SimpleException extends Exception {
}

class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Возбуждение SimpleException из f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        System.out.println(sed.getClass());
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Перехвачено!");
        }
        int b = 3;
        switch (b) {
            case 1:
                System.out.println(b);
                break;
            case 0:
                System.out.println(b);
            default:
                System.out.println("default");
        }
    }
}