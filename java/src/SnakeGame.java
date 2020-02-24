public class SnakeGame {

    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;
    public int[][] headWhere;
    public int[] headX = new int[1];
    public int[] headY = new int[1];
    int width;
    int height;

    public void SnakeGame(){
        game = new boolean[1][1];
    }

    public SnakeGame(boolean[][] game, int[] headX, int[] headY) {
        this.game = game;
        this.headX = headX;
        this.headY = headY;
    }


    public int[] findTailExhaustive() {
        int exhaustiveChecks = 0;
        int[] head1 = new int[2];
        int[] tailCheck = new int[3];//creates an array tailCheck[X][y][SNAKE LENGTH]

        for (int i = 0; i < game.length; i++) {
            for (int k = 0; k < game[i].length; k++) {
                exhaustiveChecks++;
                if (game[i][k] == game[headX[0]][headY[0]]) {

                    head1[0] = headX[0];
                    head1[1] = headY[0];
                }
            }
            tailCheck[0] = headX[0];
            tailCheck[1] = headY[0];
            tailCheck[2] = exhaustiveChecks;
        }
        return tailCheck;
    }

    public static void main(String[] args) {
        
    }
}


