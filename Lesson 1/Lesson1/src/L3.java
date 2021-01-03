public class L3 {
    public static void main(String[] args) {
        String[] wordListOne = {"привет", "ку", "Здрасте", "здаров"};
        String[] wordListTwo = {"как дела?", "что делаешь?", "что нового?", "как здоровье?"};
        String[] wordListThree = {"пока", "гуд бай", "спок"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(phrase);
    }
}
