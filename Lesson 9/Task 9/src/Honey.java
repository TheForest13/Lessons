class Bees {
    Honey [] beeHA;
   public void test(){
        System.out.println("test");
    }
}

class Raccoon {
    Kit k;
    Honey rh;
}

class Kit {
    Honey kh;
}

class Bear {
    Honey hunny;
}

public class Honey {
    public static void main(String[] args) {
        Honey h = new Honey();
        Bees b = new Bees();
        b.test();
        System.out.println();
    }
}

