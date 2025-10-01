import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Hacemos una copia para ordenar
        int[] copia = arr.clone();
        Arrays.sort(copia);

        // Obtenemos la mediana (n es impar, siempre hay un valor central)
        int mediana = copia[n / 2];

        // Encontramos índice en arreglo original
        int indice = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == mediana) {
                indice = i;
                break;
            }
        }

        System.out.println(mediana + " " + indice);
    }

}
