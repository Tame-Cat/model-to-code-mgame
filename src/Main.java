import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input number of player : ");
        int numPlayer = input.nextInt();
        MGame mGame = new MGame(numPlayer,60,50,3);
        mGame.playGame();
    }
}
