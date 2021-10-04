package tic_tac_toe;

public class TictacToe {

    private TicTacToeBoard board = new TicTacToeBoard();
    private  int[][] ticTacToe;
    private Player player1 = new Player();
    private Player player2 = new Player();


    public TicTacToeBoard getBoard() {
        return board;
    }

    public void clearBoard() {
        ticTacToe = new int [3][3];
    }

    public Player getPlayer() {
        return player1;
    }
}
