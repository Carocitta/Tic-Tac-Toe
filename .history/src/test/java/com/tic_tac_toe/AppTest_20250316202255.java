package com.tic_tac_toe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Random;




public class AppTest {
  @Test
  public void DebedarWhenTheTicTacToeHasStarted() {
    char[][] ticTacToeTablero = new char[App.TAMANO_TABLERO][App.TAMANO_TABLERO];
    App.inicializarTablero(ticTacToeTablero);

    assertFalse(App.tableroLleno(ticTacToeTablero));
  }

  @Test
  public void itShouldReturnTrueWhenTheTicTacToeIsCompleted() {
    char[][] ticTacToeTablero = new char[App.TAMANO_TABLERO][App.TAMANO_TABLERO];
    App.inicializarTablero(ticTacToeTablero);

    for (int fila = 0; fila < App.TAMANO_TABLERO; fila++) {
      for (int columna = 0; columna < App.TAMANO_TABLERO; columna++) {
        ticTacToeTablero[fila][columna] = new Random().nextBoolean() ? App.JUGADOR_X : App.JUGADOR_O;
      }
    }

    assertTrue(App.tableroLleno(ticTacToeTablero));
  }

  @Test
  public void itShouldReturnFalseWhenTheTicTacToeIsOngoing() {
    char[][] ticTacToeTablero = new char[App.TAMANO_TABLERO][App.TAMANO_TABLERO];
    App.inicializarTablero(ticTacToeTablero);

    int fila = new Random().nextInt(0, 2);
    int columna = new Random().nextInt(0, 2);
    ticTacToeTablero[fila][columna] = new Random().nextBoolean() ? App.JUGADOR_X : App.JUGADOR_O;

    assertFalse(App.tableroLleno(ticTacToeTablero));
  }
}
