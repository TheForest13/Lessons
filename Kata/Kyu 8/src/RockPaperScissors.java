/*
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples:

rps('scissors','paper') // Player 1 won!
rps('scissors','rock') // Player 2 won!
rps('paper','paper') // Draw!
*/

public class RockPaperScissors {

    public static String rps(String p1, String p2) {
        String res = "";

        if (p1 == p2) {
            res = "Draw!";
        }

        p1 += p2;

        switch (p1) {
            case ("rockpaper"):
                res = "Player 2 won!";
                break;
            case ("rockscissors"):
                res = "Player 1 won!";
                break;
            case ("paperrock"):
                res = "Player 1 won!";
                break;
            case ("paperscissors"):
                res = "Player 2 won!";
                break;
            case ("scissorsrock"):
                res = "Player 2 won!";
                break;
            case ("scissorspaper"):
                res = "Player 1 won!";
            }
            return res;
        }


    public static void main(String[] args) {
        String s1 = "rock";
        String s2 = "paper";
        String s3 = "scissors";

        System.out.println(rps(s1, s1));
        System.out.println(rps(s1, s2));
        System.out.println(rps(s1, s3));
        System.out.println(rps(s1, s1));
        System.out.println(rps(s1, s1));


    }
}

/* самый маленький
* public class Kata {
  public static String rps(String p1, String p2) {
    return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
  }
}*/

