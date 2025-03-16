package com.tic_tac_toe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Random;


import com.tic_tactoe.App;

public class AppTest {
  @Test
  public void itShouldReturnFalseWhenTheTicTacToeHasStarted() {
    char[][] ticTacToeBoard = new char[App.TAMANO_TABLERO][App.TAMANO_TABLERO];
    App.inicializarTablero(ticTacToeBoard);

    assertFalse(App.tableroLleno(ticTacToeBoard));
  }

  @Test
  public void itShouldReturnTrueWhenTheTicTacToeIsCompleted() {
    char[][] ticTacToeBoard = new char[App.TAMANO_TABLERO][App.TAMANO_TABLERO];
    App.inicializarTablero(ticTacToeBoard);

    for (int fila = 0; fila < App.TAMANO_TABLERO; fila++) {
      for (int columna = 0; columna < App.TAMANO_TABLERO; columna++) {
        ticTacToeBoard[fila][columna] = new Random().nextBoolean() ? App.JUGADOR_X : App.JUGADOR_O;
      }
    }

    assertTrue(App.tableroLleno(ticTacToeBoard));
  }

  @Test
  public void itShouldReturnFalseWhenTheTicTacToeIsOngoing() {
    char[][] ticTacToeBoard = new char[App.TAMANO_TABLERO][App.TAMANO_TABLERO];
    App.inicializarTablero(ticTacToeBoard);

    int fila = new Random().nextInt(0, 2);
    int columna = new Random().nextInt(0, 2);
    ticTacToeBoard[fila][columna] = new Random().nextBoolean() ? App.JUGADOR_X : App.JUGADOR_O;

    assertFalse(App.tableroLleno(ticTacToeBoard));
  }
}
