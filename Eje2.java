package Concurso;

import java.util.Scanner;

public class Eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        // Leer primera secuencia
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Leer segunda secuencia
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Verificar condición
        boolean dominante = true;
        for (int i = 0; i < n; i++) {
            if (a[i] <= b[i]) {   // debe ser estrictamente mayor
                dominante = false;
                break;
            }
        }

        // Imprimir resultado
        if (dominante) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}