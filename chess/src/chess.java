import java.io.IOException;
import java.util.Scanner;
public class chess {

    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        Board board=new Board();
        System.out.print("white input: ");
        String p[] =new String[5];
        for(int i=0;i<5;i++)
        {
             p[i]=q.next();
            Board.insertborad(p);
        }
        System.out.print(board);
    }
}