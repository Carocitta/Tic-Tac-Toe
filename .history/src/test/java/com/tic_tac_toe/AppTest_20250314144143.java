package com.tictactoe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    
    private void llenarTablero(char[][] tablero, char caracter) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = caracter;
            }
        }
    }

    @Test
    public void testTableroLleno() {
        char[][] tablero = new char[3][3];
        App.inicializarTablero(tablero);

        
        assertFalse(App.tableroLleno(tablero));

       
        llenarTablero(tablero, 'X');
        assertTrue(App.tableroLleno(tablero));

       
        llenarTablero(tablero, 'O');
        assertTrue(App.tableroLleno(tablero));

       
        tablero[0][0] = ' ';
        assertFalse(App.tableroLleno(tablero));

    }
}