package tic_tac_toe;

public class TicTacToeBoard {
    private  int[][] ticTacToe;

    public void displayBoard() {
        for (int counter = 0; counter < 3; counter++){
            System.out.println("-".repeat(13));
            System.out.println("|" + " \t"+ "|" +" \t"+ "|" +" \t"+ "|");
        }
        System.out.println("-".repeat(13));
    }

    public BoardPosition getPosition() {
        return BoardPosition.EMPTY;
    }
}
