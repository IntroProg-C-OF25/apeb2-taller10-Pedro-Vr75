
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el número de filas de las matrices: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de las matrices: ");
        int columnas = scanner.nextInt();
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];
        System.out.println("Matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizA[i][j] = random.nextInt(10); // Valores aleatorios entre 0 y 9
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizB[i][j] = random.nextInt(10); // Valores aleatorios entre 0 y 9
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("Suma de las matrices:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Ingrese el número de columnas de la matriz B para la multiplicación: ");
        int columnasB = scanner.nextInt();

        if (columnas != filas) {
            System.out.println("Las matrices no son compatibles para la multiplicación.");
        } else {
            int[][] matrizC = new int[filas][columnasB];
            System.out.println("Matriz B (para multiplicación):");
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < columnasB; j++) {
                    matrizB[i][j] = random.nextInt(10); // Valores aleatorios entre 0 y 9
                    System.out.print(matrizB[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnasB; j++) {
                    for (int k = 0; k < columnas; k++) {
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
            System.out.println("Multiplicación de las matrices:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnasB; j++) {
                    System.out.print(matrizC[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
/*
Ingrese el n�mero de filas de las matrices: 5
Ingrese el n�mero de columnas de las matrices: 5
Matriz A:
4 1 1 6 9 
1 3 2 9 3 
3 9 5 1 1 
6 4 8 2 6 
1 8 3 2 3 
Matriz B:
8 8 1 1 2 
0 4 6 7 4 
6 2 4 7 8 
2 4 2 6 3 
5 0 7 8 5 
Suma de las matrices:
12 9 2 7 11 
1 7 8 16 7 
9 11 9 8 9 
8 8 10 8 9 
6 8 10 10 8 
Ingrese el n�mero de columnas de la matriz B para la multiplicaci�n: 4
Matriz B (para multiplicaci�n):
3 8 4 9 
7 4 0 1 
0 4 7 9 
7 9 3 9 
8 8 6 2 
Multiplicaci�n de las matrices:
133 166 95 118 
111 133 63 117 
87 97 56 92 
108 162 122 160 
97 94 49 68 
*/
