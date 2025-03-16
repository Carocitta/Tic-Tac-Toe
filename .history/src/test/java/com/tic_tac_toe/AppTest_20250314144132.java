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

        // Caso 2: Tablero lleno con X
        llenarTablero(tablero, 'X');
        assertTrue(App.tableroLleno(tablero));

        // Caso 4: Tablero lleno con O
        llenarTablero(tablero, 'O');
        assertTrue(App.tableroLleno(tablero));

        //Caso 3: tablero parcialmente lleno.
        tablero[0][0] = ' ';
        assertFalse(App.tableroLleno(tablero));

    }
}