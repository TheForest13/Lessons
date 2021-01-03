/*
Это ката взято с проверки py.checkio.org

Вам дан массив с положительными числами и числом N. Вы должны найти N-ю степень элемента в массиве с индексом N. Если N находится за пределами массива, верните -1. Не забывайте, что первый элемент имеет индекс 0.

Давайте посмотрим на несколько примеров:

    array = [1, 2, 3, 4] и N = 2, тогда результат будет 3 ^ 2 == 9;
    array = [1, 2, 3] и N = 3, но N находится за пределами массива, поэтому результат равен -1.
*/

public class Array0 {
    static int nthPower(int[] array, int n) {
        int sum = 1;
        if (array.length-1 >= n && n >= 0) {
            for (int i = 0; i < n; i++) {
                sum = sum * array[n];
            }
        } else {
            sum = -1;
        }
        return sum;
    }


    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5};
//        for(int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 10) + 1;
//            System.out.print(array[i] + " ");
//        }

        int r = nthPower(array, 5);
        System.out.println(r);


    }
}
