import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        // Leer matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Suma objetivo = suma de la primera fila
        int target = 0;
        for (int j = 0; j < n; j++) {
            target += mat[0][j];
        }

        boolean semimagico = true;

        // Revisar filas
        for (int i = 1; i < n && semimagico; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += mat[i][j];
            }
            if (sumaFila != target) semimagico = false;
        }

        // Revisar columnas
        for (int j = 0; j < n && semimagico; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) {
                sumaCol += mat[i][j];
            }
            if (sumaCol != target) semimagico = false;
        }

        // Revisar diagonal principal
        int sumaDiag1 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag1 += mat[i][i];
        }
        if (sumaDiag1 != target) semimagico = false;

        // Revisar diagonal secundaria
        int sumaDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag2 += mat[i][n - 1 - i];
        }
        if (sumaDiag2 != target) semimagico = false;

        // Imprimir resultado
        System.out.println(semimagico ? 1 : 0);
    }

}
