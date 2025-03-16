package com.tic_tac_toe;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    private static final int TAMANO_TABLERO = 3;
    private static final char VACIO = ' ';
    private static final char JUGADOR_X = 'X';
    private static final char JUGADOR_O = 'O';

    private static final String RESET_COLOR = "\u001B[0m";
    private static final String COLOR_CYAN = "\u001B[36-m";
    private static final String COLOR_MAGENTA = "\u001B[35m";
    private static final String COLOR_VERDE = "\001B[32m";
    private static final String COLOR_ROJO = "\u001B[31m";


    public static void main(String[] args) {
        char[][] tablero = new char[TAMANO_TABLERO][TAMANO_TABLERO];
        inicializarTablero(tablero);
       
        char jugador = JUGADOR_X;
        boolean juegoTerminado = false;
        Scanner escaner = new Scanner(System.in);

        while (!juegoTerminado) {
            System.out.println();
            imprimirTablero(tablero);
            System.out.print("Jugador " + jugador + " ingresa fila y columna (0-2): ");

            if (escaner.hasNextInt()) {
                int fila = escaner.nextInt();
                if (escaner.hasNextInt()) {
                    int columna = escaner.nextInt();
                    if (movimientoValido(tablero, fila, columna)) {
                        tablero[fila][columna] = jugador;
                        if (hayGanador(tablero, jugador)) {
                            imprimirTablero(tablero);
                            System.out.println();
                            System.out.println(COLOR_VERDE + "***************************************");
                            System.out.println(COLOR_VERDE + "¡Jugador " + jugador + " Ha ganado! ");
                            System.out.println("***************************************");
                            juegoTerminado = true;
                            
                        } else if (tableroLleno(tablero)) {
                            imprimirTablero(tablero);
                            System.out.println();
                            System.out.println(COLOR_VERDE + "***************************************");
                            System.out.println(COLOR_VERDE + "¡Es un empate!");
                            System.out.println("***************************************");
                            juegoTerminado = true;
                        } else { 
                            jugador = (jugador == JUGADOR_X) ? JUGADOR_O : JUGADOR_X;
                        }
                    } else { 
                        System.out.println(COLOR_ROJO +"Movimiento invalido. Intentalo de nuevo.");
                    }
                } else {
                    System.out.println("Entrada invalida. Intentalo de nuevo.");
                    escaner.next();
                }
                
            } else {
                System.out.println("Entrada invalida. Intentalo de nuevo.");
                escaner.next();
            }
        }
        imprimirTablero(tablero);
        escaner.close();
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int fila = 0; fila < TAMANO_TABLERO; fila++) {
            for (int columna = 0; columna < TAMANO_TABLERO; columna++) {
                tablero[fila][columna] = VACIO;
            }
        }
    }

    public static void imprimirTablero(char[][] tablero) {
        for (int fila = 0; fila < TAMANO_TABLERO; fila++) {
            for (int columna = 0; columna < TAMANO_TABLERO; columna++) {
                if (tablero[fila][columna] == JUGADOR_X) {
                    System.out.print(COLOR_CYAN + tablero[fila][columna] + RESET_COLOR + " ");
                } else if (tablero[fila][columna] == JUGADOR_O) {
                    System.out.print(COLOR_MAGENTA + tablero[fila][columna] + RESET_COLOR + " ");
                } else {
                    System.out.print(tablero[fila][columna] + " ");
                }
                if (columna < TAMANO_TABLERO - 1) {
                    System.out.print("| ");
                }
            }

            System.out.println();
            if (fila < TAMANO_TABLERO - 1) {
                System.out.println("---------");
            }

        }
    }

    public static boolean movimientoValido(char[][] tablero, int fila, int columna) {
        return fila >= 0 && fila < TAMANO_TABLERO && columna >= 0 && columna < TAMANO_TABLERO
                && tablero[fila][columna] == VACIO;
    }

public static boolean hayGanador(char[][] tablero, char jugador) {
for (int fila = 0; fila < TAMANO_TABLERO; fila++) {
    if (tablero[fila][0] == jugador && tablero[fila][1] == jugador && tablero[fila][2] == jugador) {
        return true;
    }
}
for (int columna = 0; columna < TAMANO_TABLERO; columna++) {
    if(tablero[0][columna] == jugador && tablero[1][columna] == jugador && tablero[2][columna] == jugador) {
        return true;
    }
}
if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
    return true;
}

if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
    return true;
}
return false;
}


    public static boolean tableroLleno(char[][] tablero) {
        for (int fila = 0; fila < TAMANO_TABLERO; fila++) {
            for (int columna = 0; columna < TAMANO_TABLERO; columna++) {
                if (tablero[fila][columna] == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }

}
