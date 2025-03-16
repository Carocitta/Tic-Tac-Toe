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



public class AppTest {

    private App App;

    @Before
    public void setUp() {
        App = new App();
    }

    @Test
    public void testTableroLleno() {
        char[][] tablero = new char[3][3];
        App.inicializarTablero(tablero);

        assertFalse(App.tableroLleno(tablero));

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = 'X';
            }
        }
        assertTrue(App.tableroLleno(tablero));

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