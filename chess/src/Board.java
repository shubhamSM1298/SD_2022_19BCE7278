import java.io.IOException;

public class Board {

    public Board()
    {
        this.initialize();
    }
    private void initialize() {
      String board[][] = new String[5][5];
        for (int i = 0 ; i <= 5 ; i++){
            for (int j = 0 ; j <= 5 ; j++) {
                board[i][j]= "-";
            }
        }
    }
    public static void insertborad(String p[])
    {
        
    }
    public void performMove(char move, String player, boolean actuallyMove) throws IOException{

    }
}