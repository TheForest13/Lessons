public class Massif {
    public static void main(String[] args) {
        int[] m1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] m2 = m1;

        m1[1] = 333;
        for(int i: m1){
            System.out.println(i);
        }
        System.out.println("\n");
        for(int i: m2){
            System.out.println(i);
        }

        m2[1] = 00;
        System.out.println("поменял м2");
        for(int i: m1){
            System.out.println(i);
        }
        System.out.println("\n");
        for(int i: m2){
            System.out.println(i);
        }

        String str1 = new String("1234");  //"1234";
        String str2 = new String("1234"); //"123";

        if(str1==str2){
            System.out.println("==");
        }

        if(str1.equals(str2)){
            System.out.println("equals");
        }


    }
}
