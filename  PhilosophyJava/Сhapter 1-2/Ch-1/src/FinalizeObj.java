public class FinalizeObj {
    boolean checkedOut = false;

    FinalizeObj(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut) {
            System.out.println("Ошибка: checkedOut");
            // обычно делается так
            // Super.finalize(); // Вызов версии базового класса
        }
    }
}
    class TerminationCondition {
        public static void main(String[] args) {
            FinalizeObj novel = new FinalizeObj(true);
            // правильная очистка:
            novel.checkIn();
            // Теряем ссылку, забыли про очистку:
            new FinalizeObj(true);
            // Принудительная уборка мусора и финализация:
            System.gc();
        }
    }

