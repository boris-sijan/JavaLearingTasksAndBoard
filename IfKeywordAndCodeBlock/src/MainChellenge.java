public class MainChellenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next high score is: " + calculateScore(true, score, levelCompleted, bonus));

        displayHighScorePosition("Player1", calculateHighScorePosition(1500));
        displayHighScorePosition("Player2", calculateHighScorePosition(1000));
        displayHighScorePosition("Player3", calculateHighScorePosition(500));
        displayHighScorePosition("Player4", calculateHighScorePosition(100));
        displayHighScorePosition("Player5", calculateHighScorePosition(25));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
        }
        return finalScore;
    }

    public static int calculateHighScorePosition(int playerScore){
        int result;
        if (playerScore >= 1000) {
            result = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            result = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }
}
