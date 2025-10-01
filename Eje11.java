import java.util.Scanner;

public class Main {

    static final int MODULO = 2017;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        long posicion = lector.nextLong();
        lector.close();

        if (posicion == 1 || posicion == 2) {
            System.out.println(1);
        } else {
            System.out.println(fibonacciMod(posicion));
        }
    }

    static int fibonacciMod(long n) {
        int[][] matrizBase = { {1, 1}, {1, 0} };
        int[][] matrizResultado = elevarMatriz(matrizBase, n - 1);
        return matrizResultado[0][0] % MODULO;
    }

    static int[][] elevarMatriz(int[][] matriz, long exponente) {
        int[][] identidad = { {1, 0}, {0, 1} };

        while (exponente > 0) {
            if ((exponente & 1) == 1) {
                identidad = multiplicarMatrices(identidad, matriz);
            }
            matriz = multiplicarMatrices(matriz, matriz);
            exponente >>= 1;
        }

        return identidad;
    }

    static int[][] multiplicarMatrices(int[][] m1, int[][] m2) {
        int[][] resultado = new int[2][2];

        resultado[0][0] = (int)(((long)m1[0][0] * m2[0][0] + (long)m1[0][1] * m2[1][0]) % MODULO);
        resultado[0][1] = (int)(((long)m1[0][0] * m2[0][1] + (long)m1[0][1] * m2[1][1]) % MODULO);
        resultado[1][0] = (int)(((long)m1[1][0] * m2[0][0] + (long)m1[1][1] * m2[1][0]) % MODULO);
        resultado[1][1] = (int)(((long)m1[1][0] * m2[0][1] + (long)m1[1][1] * m2[1][1]) % MODULO);

        return resultado;
    }
}
