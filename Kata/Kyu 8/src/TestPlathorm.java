/*
f you can't sleep, just count sheep!!
Task:

Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.

 */

public class TestPlathorm {
    public static String countingSheep(int num) {
        String sheeps = "";
        for (int i = 0; i < num; i++) {
            sheeps += (i + 1) + " sheep...";
        }
        return sheeps;
    }

    public static String correct(String string) {
       string = string.replace('5', 'S');
       string = string.replace('0', 'O');
       string =  string.replace("1", "I");

        return string;
    }

    public static String Replace(final String s) {
      return  s.replaceAll("[aeiouAEIOU]", "!");
    }

    public static void main(String[] args) {


    }
}
