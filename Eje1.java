import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // tamaño del arreglo
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();         // leer elementos
        }

        int m = sc.nextInt();              // 0 = pares, 1 = impares

        for (int i = 0; i < n; i++) {
            if (m == 0 && arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            } else if (m == 1 && arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}

