public class SplitText {
    public static void main(String[] args) {
        String text = "Ram/Rem/Emilia";
        String[] result = text.split("/");
        for(String token: result){
            System.out.println(token);
        }
    }
}
