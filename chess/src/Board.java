import java.io.IOException;

public class Board {
    public String [][] board1 = new String[5][5];
    public Board()
    {
        this.initialize();
    }
    private void initialize() {
        for (int i = 0 ; i < board1.length ; i++){
            for (int j = 0 ; j < board1[0].length ; j++) {
                board1[i][j]="-\t";
            }
        }
        for(int x=0; x<5; x++){
            board1[4][x] = "A-P"+(x+1);
        }

        for(int x=0; x<5; x++){
            board1[0][x] = "B-P"+(x+1);
        }
        for (int i = 0 ; i < board1.length ; i++){
            for (int j = 0 ; j < board1[0].length ; j++) {
               System.out.print( board1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void insertborad(String p[])
    {

    }

    public void performMove(String move) throws IOException{

        String ch[]=move.split(":");

    }
}