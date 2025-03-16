package com.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// public class AppTest {

//     @Test
//     public void testTableroLleno() {
//         char[][] tablero = new char[3][3];
//         App.inicializarTablero(tablero);

//         // Caso 1: Tablero vacío
//         assertFalse(App.tableroLleno(tablero));

//         // Caso 2: Tablero lleno
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 tablero[i][j] = 'X';  
//             }
//         }
     
//         // Caso 4: Tablero lleno con O
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 tablero[i][j] = 'O'; // Llenamos el tablero con 'O'
//             }
//         }

//         assertTrue(App.tableroLleno(tablero));

//     }
// }

public class AppTest {

    // Método auxiliar para llenar el tablero
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

        // Caso 1: Tablero vacío
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