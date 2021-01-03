public class Mas {
    public static void main(String[] args) {
      /*  int[][] m = new int[3][3];
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                m[i][j] = j;
                System.out.println("m["+i+"]["+j+"]");
            }
        }*/
        int[] m = new int[]{1,2,3,4};
        for(int r: m)
            System.out.println(r);
        m[3] = 0;
        for(int r: m)
            System.out.println(r);
    }
}
