public class SnakeGame {

    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;


    public SnakeGame() {
        game = new boolean[0][0];
    }

    int headX = 0;
    int headY = 0;

    public SnakeGame(boolean[][] game, int[] headX, int[] headY) {
        game = new boolean[game.length][game[0].length];
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                this.game[i][j] = game[i][j];
            }
        }
        headPosition[0] = this.headX;
        headPosition[1] = this.headY;
    }


    public int[] findTailExhaustive() {
        resetCounters();
        int[] snake1 = new int[3];
        int[] tailCheck = new int[3];//creates an array tailCheck[X][y][SNAKE LENGTH]
        for (int i = 0; i < game.length; i++) {
            for (int k = 0; k < game[i].length; k++) {

                while (game[i][k] = true) {
                    exhaustiveChecks++;
                }
                snake1[0] = headX;
                snake1[1] = headY;
                snake1[2] = exhaustiveChecks;
            }
        }
        return tailCheck;
    }

    private void resetCounters(){
        exhaustiveChecks = 0;
        recursiveChecks = 0;
    }

    public static void main(String[] args) {
    boolean[][] gameBoard = new boolean[5][5];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int k = 0; k < gameBoard.length; k++) {
                gameBoard[i][k] = false;
            }
        }

        SnakeGame run = new SnakeGame(gameBoard, new int[2], new int[2]);
        run.findTailExhaustive();
    }
}


