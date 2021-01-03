public class MixFor5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int innner = 4; innner > 1; innner--){
                x = x + 3; // 3 6
                y = y - 2; // 2 0
                if (x == 6) {
                    break;
                }
                x += 3; // 6
            }
            y -= 2;
        }
        System.out.println(x + " " + y);
    }
}
