import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Leer la secuencia
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Encontrar el máximo
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Contar los que no son máximos
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max) {
                count++;
            }
        }

        // Imprimir cantidad
        System.out.println(count);

        // Imprimir secuencia resultante (si no está vacía)
        if (count > 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] != max) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

}
