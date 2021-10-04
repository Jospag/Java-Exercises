package tic_tac_toe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {

    @Test
    public void ticTacToeHasABoardTest(){
        //given
        TictacToe tikky = new TictacToe();
        TicTacToeBoard board = new TicTacToeBoard();
        board = tikky.getBoard();
        assertNotNull(board);
    }

    @Test
    public void ticTacToeBoardIsEmptyByDefaultTest(){
            //given
        TictacToe tikky = new TictacToe();
        TicTacToeBoard board = new TicTacToeBoard();

        assertSame(BoardPosition.EMPTY, board.getPosition());
    }
@Test
    public void ticTacToeHasPlayersTest(){
        //Given
    TictacToe tikky = new TictacToe();
    TicTacToeBoard board = new TicTacToeBoard();
    Player player1 = new Player();
    //when
    player1 = tikky.getPlayer();
    assertNotNull(player1);
}
}
