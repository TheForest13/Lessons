import java.text.DecimalFormat;

class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("создаем Characteristic " + s);
    }
    protected void dispose() {
        System.out.println("Завершаем Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Создаем Description " + s);
    }
    protected void dispose() {
        System.out.println("Завершаем Description " + s);
    }
}

// Живое существо
class LivingCreature {
    private Characteristic p = new Characteristic("живое существо");
    private Description t = new Description("Обычное животное сущесство");
    LivingCreature() {
        System.out.println("LivingCreature ");
    }
    protected void dispose(){
        System.out.println("dispose() в LivingCreature ");
        t.dispose();
        p.dispose();
    }
}

// Животное
class Animal extends LivingCreature {
    private Characteristic p = new Characteristic ("имеет сердце ");
    private Description t = new Description("Животное, не растение");
    Animal() {
        System.out.println("Animal()");
    }
    protected void dispose() {
        System.out.println("dispose() в Animal ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

// земноводное
class Ampibian extends Animal {
    private Characteristic p = new Characteristic("может жить в воде");
    private Description t = new Description("и в воде, и на земле");
    Ampibian() {
        System.out.println("Amphibian()");
    }
    protected  void dispose() {
        System.out.println("dispose() в Amphibian ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

// Лягушка
public class Frog extends Ampibian {
    private Characteristic p = new Characteristic("квакает");
    private Description t = new Description("есть жуков");
    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose(){
        System.out.println("Завершение Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Пока! ");
        frog.dispose();
    }
}
