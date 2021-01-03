import java.util.Random;

public class RandomNum {

    public boolean equals(RandomNum obj){
        if(obj.z == z){
            return true;
        } else {
            return false;
        }
    }

    RandomNum(int i){
        z = i;
    }
    RandomNum(){}

    int z;

    static int result = 0;
    static void test(int testval, int target) {
        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0; // равные числа >
    }
        public static void main(String[] args) {
        Random rand = new Random();
/*

        for(int i = 0; i < 100; i++){
            int x = rand.nextInt(100);
            System.out.println(x);
        }
*/
        RandomNum h1 = new RandomNum(1);
        RandomNum h2 = new RandomNum(2);

        if(h1.equals(h2)){
            System.out.println("переменные равны " + h1.z + " " + h2.z);
        } else {
            System.out.println("не равны " + h1.z + " " + h2.z);
        }

        /*int x = 3, y = 5;
        RandomNum rn = new RandomNum();
        rn.z = x = y;
        System.out.println("rn.z " + rn.z + " x " + x);*/

        int big = Integer.MAX_VALUE;
        System.out.println("\nбольше = " + big);
        int bigger = big * 4;
        System.out.println("eme больше = " + bigger);

            test(10, 5);
            System.out.println("\n"+result);
            test(5, 10);
            System.out.println(result);
            test(5, 5);
            System.out.println(result);


        }
}
