class Poppet {
    private int i;
    Poppet(int ii){
        i = ii;
    }
}

public class BlankFinal {
    private final static int x;
    static {
        x = 3;
    }
    private final int i = 0; // Инициализированная константа
    private final int j;     // Пустая константа
    private final Poppet p;  // Пустая константа-ссылка
    // Пустые константы НЕОБХОДИМО инициализировать
    // в конструкторе:
    public BlankFinal(){
        j = 1;
        p = new Poppet(1);
    }
    public BlankFinal(int x){
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
