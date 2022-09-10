import java.io.IOException;
import java.util.Scanner;
public class chess {

    public static void main(String[] args) throws IOException {
        Board board = new Board();
        String player = "Player A";
        while(true) {
            Scanner q = new Scanner(System.in);

            System.out.print(board);
            System.out.print(player+" move: ");
            String move=q.next();
            board.performMove(move);
            /*
            String p[] = new String[5];
            for (int i = 0; i < 5; i++) {
                p[i] = q.next();
               // Board.insertborad(p);
            }*/
            //System.out.print(board);
            player=playerToggle(player);
        }
    }
    public static String playerToggle(String player){
        if(player.equals("Player A")){
            return "Player B";
        }
        return "Player A";
    }
}