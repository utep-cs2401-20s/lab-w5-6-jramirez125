public class SnakeGame {

    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;
    public int[][] headWhere;
    public int[] headX;
    public int[] headY;

    public SnakeGame() {
        this.game = new boolean[0][0];
    }

    public SnakeGame(boolean[][] game, int[] headX, int[] headY) {
        this.game = game;
        this.headX = headX;
        this.headY = headY;
    }

    public int[] findTailExhaustive(){
        int exhaustiveChecks = 0;
        int partOfSnake = 0;
        int[] tailCheck = new int[3];    //creates an array tailCheck[X][y][SNAKE LENGTH]
        tailCheck[0] = headX[0];         //tailCheck[x][][]
        tailCheck[1] = headY[0];         //tailCheck[][Y][]
        for (int i = 0; i < game.length; i++) {
            for (int k = 0; k < game[i].length; k++) {
                exhaustiveChecks++;
                if(game[i][k] == game[headX[0]][headY[0]]){

                    tailCheck[2] = exhaustiveChecks;
                    return tailCheck;
                }
            }
        }
        return tailCheck;
    }

    public static void main(String[] args) {

    }
}

