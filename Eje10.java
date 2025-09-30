package Concurso;

import java.util.*;

public class Eje10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leemos la matriz 3x3
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        boolean esMagico = true;

        // Verificar filas
        for (int i = 0; i < 3; i++) {
            int sumaFila = m[i][0] + m[i][1] + m[i][2];
            if (sumaFila != 15) esMagico = false;
        }

        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            int sumaCol = m[0][j] + m[1][j] + m[2][j];
            if (sumaCol != 15) esMagico = false;
        }

        // Verificar diagonales
        int diag1 = m[0][0] + m[1][1] + m[2][2];
        int diag2 = m[0][2] + m[1][1] + m[2][0];
        if (diag1 != 15 || diag2 != 15) esMagico = false;

        // Imprimir resultado
        if (esMagico) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}