public class L5 {
   static void l1(){
        int x = 5;

        while (x > 1) {
            x = x - 1;

            if (x < 3) {
                System.out.println("маленький икс");
            }
        }
    }

    static void l2(){
       int x = 1;
       while (x < 10) {
           if(x > 3) {
               System.out.println("большой икс");
           }
           x += 1;
       }
    }

    static void l3(){
       int x = 5;
       while (x > 1) {
           x = x - 1;
           if (x < 3) {
               System.out.println("маленький икс");
           }
       }
    }
    public static void main(String[] args){
        l1();
        System.out.println();
        l2();
        System.out.println();
        l3();
    }
}
