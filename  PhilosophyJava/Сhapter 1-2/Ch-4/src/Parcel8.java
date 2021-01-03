public class Parcel8 {
    public Wrapping wrapping(int x) {
// Вызов конструктора базового класса:
        return new Wrapping(x) { // Передача аргумента конструктору
            public int value() {
                return super.value() * 47;
            }
        }; // Точка с запятой необходима
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}

class Wrapping {
    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value() {
        return i;
    }
}