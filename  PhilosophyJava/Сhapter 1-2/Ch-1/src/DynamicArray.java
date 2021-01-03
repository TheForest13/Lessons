public class DynamicArray {

    static void f(int required, String... trailing){
        System.out.print("обязательно " + required + " ");
        for(String s: trailing){
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Other.main(new String[]{"fiddle", "de", "dum"});
        f(1);
        f(2, "suip", "risk");

        VarargType.f(3, 4, 6);
    }
}

class VarargType{
    static void f(Integer... args){
        System.out.println(args.getClass());
        for(int x: args){
            System.out.print(x + " ");
        }
    }

    static void f(VarargType... args){
    }
}



class Other{
    public static void main(String[] args) {
        for(String s: args){
            System.out.print(s.length());
            System.out.print(s + " ");
        }
        System.out.println();
    }
}