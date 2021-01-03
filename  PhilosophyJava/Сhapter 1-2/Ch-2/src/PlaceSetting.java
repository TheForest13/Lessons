import java.awt.*;

class Plate {
    Plate(int i) {
        System.out.println("конструктор Plate");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i){
        super(i);
        System.out.println("Конструктор DinnerPlate");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Конструктор Utenstil");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Конструктор Spoon");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Конструктор Fork");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Конструктор Knife");
    }
}

class Custem {
    Custem(int i) {
        System.out.println("Конструктор Custem");
    }
}

public class PlaceSetting extends Custem{
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;
    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("Конструктор PlaceSetting");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
