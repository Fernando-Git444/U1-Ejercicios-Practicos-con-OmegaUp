import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        // Leer matriz 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        // Comparar diagonales
        boolean iguales = true;
        for (int i = 0; i < 3; i++) {
            if (m[i][i] != m[i][2 - i]) {
                iguales = false;
                break;
            }
        }

        if (iguales) {
            System.out.println("Tesoro encontrado");
        } else {
            System.out.println("Sigue buscando");
        }
    }

}
