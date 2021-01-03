//средняя оценка

public class AverageNumbers {

    public static int getAverage(int[] marks){
        int sum = 0;
        for (int i = 0; i < marks.length; i++){
            sum +=marks[i];
        }
        sum /= marks.length;
        return sum;
    }
    public static void main(String[] args) {
        int [] array = new int[] {1,1,1,1,1,1,1,2};
//        for(int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 10) + 1;
//            System.out.print(array[i] + " ");
//        }
        System.out.println(getAverage(array));




    }
}
