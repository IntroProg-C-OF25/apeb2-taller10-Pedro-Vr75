import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        char jugadorActual = 'X'; // El jugador X comienza
        boolean juegoTerminado = false;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        while (!juegoTerminado) {
            System.out.println("Tablero:");
            for (int i = 0; i < 3; i++) {
                System.out.print("|");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + "|");
                }
                System.out.println();
            }
            System.out.println("Jugador " + jugadorActual + ", ingresa tu movimiento (fila y columna): ");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;
                for (int i = 0; i < 3; i++) {
                    if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) ||
                        (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                        System.out.println("Jugador " + jugadorActual + " ha ganado!");
                        juegoTerminado = true;
                    }
                }
                if (!juegoTerminado) {
                    if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                        (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
                        System.out.println("Jugador " + jugadorActual + " ha ganado!");
                        juegoTerminado = true;
                    }
                }
                if (!juegoTerminado) {
                    boolean empate = true;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (tablero[i][j] == ' ') {
                                empate = false;
                            }
                        }
                    }
                    if (empate) {
                        System.out.println("Es un empate");
                        juegoTerminado = true;
                    }
                }
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Movimiento inválido, intenta de nuevo.");
            }
        }
        System.out.println("Tablero final:");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + "|");
            }
            System.out.println();
        }
        scanner.close();
    }
}