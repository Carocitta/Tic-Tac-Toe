package com.tic_tac_toe;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final int TAMANO_TABLERO = 3;
    private static final char VACIO = ' ';
    private static final char JUGADOR_X = 'X';
    private static final char JUGADOR_O = 'O';
    
    private static final String RESET_COLOR = "\u001B[0m";
    private static final String COLOR_CYAN = "\u001B[36-m";
    private static final String COLOR_MAGENTA = "\u001B[35m";
    private static final String COLOR_VERDE = "\001B[32m";
    
   
    public static void main( String[] args )
    {
        System.out.println( "Hello Carol!" );
    }
}


public static void inicializarTablero(char[][] tablero) {
    for (int fila = 0; fila < TAMANO_TABLERO;  fila++) {
        for (int columna = 0; columna < TAMANO_TABLERO; columna++) {
            tablero[fila] [columna] = VACIO;
        }
    }
}

public static void imprimirTablero(char[][] tablero) {
    for (int fila =0; fila < TAMANO_TABLERO; fila++) {
for (int columna = 0; columna < TAMANO_TABLERO; columna++){
    if (tablero[fila][columna] == JUGADOR_X) {
        System.out.print(COLOR_CYAN + tablero[fila] [columna] + RESET_COLOR + " ");
    } else if (tablero[fila] [columna] == JUGADOR_O) {
        System.out.print(COLOR_MAGENTA + tablero[fila][columna] + RESET)
    }
    }
}

    }
}