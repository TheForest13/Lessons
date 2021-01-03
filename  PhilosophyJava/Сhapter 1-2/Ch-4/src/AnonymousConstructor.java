abstract class Base {
    public Base(int i) {
        System.out.println("Базовый конструктор, i = " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {

            {
                System.out.println("B инициализаторе экземпляра");
            }

            public void f() {
                System.out.println("B анонимном f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}