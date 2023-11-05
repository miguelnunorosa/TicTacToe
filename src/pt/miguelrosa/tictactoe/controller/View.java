package pt.miguelrosa.tictactoe.controller;

import pt.miguelrosa.tictactoe.model.Place;

public interface View {

    void playerWins(int player);

    void drawBoard();

    void update(Place place, int line, int col);

}
