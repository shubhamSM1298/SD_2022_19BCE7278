public abstract class piece {
    public String player;
    public boolean hasMoved;
    public boolean ep_able;

    public abstract String getPlayer();

    public abstract boolean validateMove(piece[][] board, char move);
}
