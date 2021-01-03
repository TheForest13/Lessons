public class lab4 {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(3));
        go(3);
        stop("слово");
        warning();
        junp(3);
    }

    static void go(int x){
        x+=x;
    }

    static void stop(String x){
        System.out.println(x);
    }

    static String warning(){
        return "внимание";
    }

    static void junp(int x){
        for(int i =0; i < x; i++){
            System.out.println(i);
        }
    }

}
