package Concurso;

import java.util.*;

public class Eje11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // usamos long porque n puede ser muy grande

        int MOD = 2017;

        if (n == 1 || n == 2) {
            System.out.println(1); // los dos primeros son 1
            return;
        }

        // Variables para ir generando la secuencia
        int a = 1, b = 1; 
        int fib = 0;

        // Iteramos desde el 3 hasta n
        for (long i = 3; i <= n; i++) {
            fib = (a + b) % MOD; // aplicamos módulo en cada paso
            a = b;
            b = fib;
        }

        System.out.println(fib);
    }
}