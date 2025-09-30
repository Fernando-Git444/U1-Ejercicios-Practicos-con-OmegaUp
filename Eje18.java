/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurso;

import java.util.*;

public class Eje18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();

        // Convertir a arreglo de caracteres
        char[] chars = palabra.toCharArray();
        Arrays.sort(chars); // ordenar alfabéticamente

        StringBuilder resultado = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                resultado.append(count).append(chars[i - 1]);
                count = 1;
            }
        }

        System.out.println(resultado.toString());
    }
}