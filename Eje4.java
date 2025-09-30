package Concurso;

import java.util.Scanner;

public class Eje4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // tamaño de la secuencia
        int[] arr = new int[n];

        // Leer la secuencia
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();      // número a buscar
        int contador = 0;

        // Contar ocurrencias
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                contador++;
            }
        }

        // Imprimir resultado
        System.out.println(contador);
    }
}
