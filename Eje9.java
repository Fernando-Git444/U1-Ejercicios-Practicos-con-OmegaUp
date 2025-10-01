import java.util.*;

public class Main {
    static int[][][] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // Número a descomponer
        int K = sc.nextInt();  // Cantidad de cuadrados

        // Creamos tabla de memoización: n, k, start (hasta sqrt(n))
        memo = new int[N + 1][K + 1][(int)Math.sqrt(N) + 2];

        // Inicializamos con -1 como valor no calculado
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        int res = contar(N, K, 1);
        System.out.println(res);
    }

    static int contar(int n, int k, int start) {
        if (k == 0) return (n == 0) ? 1 : 0;
        if (n < 0) return 0;

        if (memo[n][k][start] != -1) return memo[n][k][start];

        int formas = 0;
        for (int i = start; i * i <= n; i++) {
            formas += contar(n - i * i, k - 1, i);
        }

        memo[n][k][start] = formas;
        return formas;
    }

}
