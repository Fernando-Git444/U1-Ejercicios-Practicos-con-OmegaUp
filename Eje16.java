package Concurso;

import java.util.*;

public class Eje16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        f(a, 0, n);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
    }
    public static void f(int[] a, int start, int end) {
        if (end - start <= 1) return;

        // Paso 1: si el primer elemento (a[start]) es par
        if (a[start] % 2 == 0) {
            Arrays.sort(a, start, end - 1); // Ordena los primeros n-1 elementos
            f(a, start, end - 1); // Aplica f sobre los primeros n-1 elementos
        }

        // Paso 2: si el último elemento (a[end - 1]) es par
        if (a[end - 1] % 2 == 0) {
            reverse(a, start + 1, end); // Invierte los últimos n-1 elementos
            f(a, start + 1, end); // Aplica f sobre los últimos n-1 elementos
        }
    }

    public static void reverse(int[] a, int from, int to) {
        to--; // Convertimos a índice final inclusivo
        while (from < to) {
            int temp = a[from];
            a[from] = a[to];
            a[to] = temp;
            from++;
            to--;
        }
    }
}