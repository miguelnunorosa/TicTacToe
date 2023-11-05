package pt.miguelrosa.tictactoe.model;

import pt.miguelrosa.tictactoe.controller.View;

public class TicTacToeGame {

    public final int BOARD_SIZE = 3;
    private final View VIEW;
    private final Place[][] boardData;
    private int turnCounter;


    public TicTacToeGame(View view){
        this.VIEW = view;
        this.boardData = new Place[this.BOARD_SIZE][this.BOARD_SIZE];
        this.fillBoard();
    }

    private void fillBoard(){
        System.out.println("Creating game board. Wait a moment...");

        for (int line = 0; line < BOARD_SIZE; line++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                this.boardData[line][col] = Place.EMPTY;
            }
        }
    }




}
