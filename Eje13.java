package Concurso;

import java.util.Scanner;

public class Eje13 {
    // Definimos la función recursiva
    static long f(int n) {
        if (n <= 5) {
            return 1; // caso base
        } else {
            return f(n - 2) * 5; // caso recursivo
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // leemos n
        System.out.println(f(n));
    }
}