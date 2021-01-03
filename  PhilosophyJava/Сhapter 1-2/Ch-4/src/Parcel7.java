public class Parcel7 {
    public Contents contents() {
        return new Contents() { // Вставка определения класса
            private int i = 11;

            public int value() {
                return i;
            }
        }; // Точка с запятой здесь необходима
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents с = p.contents();
    }
}

/*
// Расширенная версия Pancel7.java
public class Parcel7b {
class MyContents implements Contents {
private int i = 11;
public int value() { return i; }
}
public Contents contents() { return new MyContents(); }
public static void main(String[] args) {
Parcel7b p = new Parcel7b();
Contents c = p.contents();
}
}
 */