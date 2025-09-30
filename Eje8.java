package Concurso;

import java.util.Scanner;

public class Eje8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tablero 3x3
        char[][] t = new char[3][3];
        for (int i = 0; i < 3; i++) {
            String fila = sc.nextLine();
            for (int j = 0; j < 3; j++) {
                t[i][j] = fila.charAt(j);
            }
        }

        boolean ganaX = false;
        boolean ganaO = false;

        // Revisar filas
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == t[i][1] && t[i][1] == t[i][2]) {
                if (t[i][0] == 'x') ganaX = true;
                if (t[i][0] == 'o') ganaO = true;
            }
        }

        // Revisar columnas
        for (int j = 0; j < 3; j++) {
            if (t[0][j] == t[1][j] && t[1][j] == t[2][j]) {
                if (t[0][j] == 'x') ganaX = true;
                if (t[0][j] == 'o') ganaO = true;
            }
        }

        // Revisar diagonales
        if (t[0][0] == t[1][1] && t[1][1] == t[2][2]) {
            if (t[0][0] == 'x') ganaX = true;
            if (t[0][0] == 'o') ganaO = true;
        }
        if (t[0][2] == t[1][1] && t[1][1] == t[2][0]) {
            if (t[0][2] == 'x') ganaX = true;
            if (t[0][2] == 'o') ganaO = true;
        }

        // Resultado
        if (ganaX && !ganaO) {
            System.out.println("Roots!:D");
        } else if (!ganaX && ganaO) {
            System.out.println("Velafloow 8)");
        } else {
            System.out.println("Bailo Verta :S");
        }
    }
}