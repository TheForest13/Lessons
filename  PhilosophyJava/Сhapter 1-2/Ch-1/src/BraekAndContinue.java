

public class BraekAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break;
            // Выход из цикла
            if (i % 9 != 0) continue; // Следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();
// Использование foreach:
        int[] ms = new int[100];
        for(int i = 0; i < 100; i++){
            ms[i] = i;
        }
        for (int i : ms) {
            if (i == 74) break;
            // Выход из цикла
            if (i % 9 != 0) continue; // Следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
// "Бесконечный цикл":
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            // Выход из цикла
            if (i % 10 != 0) continue; // Возврат в начало цикла
            System.out.print(i + " ");
        }

        for(;;){
            int j = 2;
            j =j + 2;
            System.out.println(j);
            if(j == 100000)
                break;
        }
    }
}
