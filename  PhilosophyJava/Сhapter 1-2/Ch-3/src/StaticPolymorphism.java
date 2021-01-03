class StaticSuper {
    public static String staticGet() {
        return "Базовая версия staticGet()";
    }

    public String dynamicGet() {
        return "Базовая версия dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet(){
        return "Производная версия staticGet()";
    }

    public String dynamicGet() {
        return "Производная версия dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); // Восходящие преобразование
        StaticSub sub = new StaticSub();

        System.out.println(sup.staticGet());
        System.out.println(sub.staticGet());
        System.out.println(sup.dynamicGet());

       // System.out.println(StaticSub.staticGet());
    }
}
