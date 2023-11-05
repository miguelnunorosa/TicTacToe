package pt.miguelrosa.tictactoe.view;

import pt.miguelrosa.tictactoe.controller.View;
import pt.miguelrosa.tictactoe.model.Place;
import pt.miguelrosa.tictactoe.model.TicTacToeGame;

import java.util.Scanner;

public class TUI implements View {

    final static Scanner playerInput = new Scanner(System.in);
    private final TicTacToeGame GAME_MODEL;


    public TUI() {
        this.GAME_MODEL = new TicTacToeGame(this);
    }

    @Override
    public void playerWins(int player) {
        //TODO
    }

    @Override
    public void drawBoard() {
        //TODO
    }

    @Override
    public void update(Place place, int line, int col) {
        //TODO
    }








    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}