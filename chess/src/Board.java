import java.io.IOException;

public class Board {
    public piece[][] board1 = new piece[5][5];
    public Board()
    {
        this.initialize();
    }
    private void initialize() {
        for (int i = 0 ; i < board1.length ; i++){
            for (int j = 0 ; j < board1[0].length ; j++) {
                board1[i][j]=null;
            }
        }
        for(int x=0; x<5; x++){
            board1[4][x] = new pawn("Player A");
        }

        for(int x=0; x<5; x++){
            board1[0][x] = new pawn("Player B");
        }
    }
    public static void insertborad(String p[])
    {

    }

    public void performMove(char move, String player, boolean actuallyMove) throws IOException{

    }
}