public class OperatorPrecedents {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000)
            System.out.println("Your score was 1000");

        else if(score < 1000)
            System.out.println("Your score was 1000");

        else
            System.out.println("Got here");


//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

    }
}
