class pawn extends piece{
public String player;
public boolean hasMoved;
public boolean ep_able;
    public pawn(String player){
        this.player = player;
        this.hasMoved = false;
    }

    public boolean validateMove(piece[][] board, char move) {

        if(!(move=='F'||move=='B'||move=='L'||move=='R'))
        {

           return false;
        }
        return true;

    }
    public String getPlayer(){

        return this.player;
    }
}