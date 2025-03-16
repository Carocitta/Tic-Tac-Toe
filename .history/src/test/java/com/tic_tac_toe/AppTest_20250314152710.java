package com.tic_tac_toe;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;


// public class AppTest {

    
//     private void llenarTablero(char[][] tablero, char caracter) {
//         for (int fila = 0; fila < 3; fila++) {
//             for (int columna = 0; columna < 3; columna++) {
//                 tablero[fila][columna] = caracter;
//             }
//         }
//     }

//     @Test
//     public void testTableroLleno() {
//         char[][] tablero = new char[3][3];
//         App.inicializarTablero(tablero);

        
//         assertFalse(App.tableroLleno(tablero));

       
//         llenarTablero(tablero, 'X');
//         assertTrue(App.tableroLleno(tablero));

//         llenarTablero(tablero, 'O');
//         assertTrue(App.tableroLleno(tablero));

       
//         tablero[0][0] = ' ';
//         assertFalse(App.tableroLleno(tablero));


//     }
// }

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;
public class AppTest {

    private App app; // Instancia de App como variable de instancia

    @Before
    public void setUp() {
        app = new App(); // Inicializa la instancia de App antes de cada test
    }

    @Test
    public void testTableroLleno() {
        char[][] tablero = new char[3][3];
        App.inicializarTablero(tablero); // Asumiendo que inicializarTablero es estático

        assertFalse(App.tableroLleno(tablero));

        // Llenar el tablero directamente en el test
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = 'X';
            }
        }
        assertTrue(App.tableroLleno(tablero));

        // Llenar el tablero con 'O'
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = 'O';
            }
        }
        assertTrue(App.tableroLleno(tablero));

        tablero[0][0] = ' ';
        assertFalse(App.tableroLleno(tablero));
    }
}