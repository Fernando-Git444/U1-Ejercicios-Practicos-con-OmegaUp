/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurso;

import java.util.Scanner;

public class Eje15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // número de elementos
        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += sc.nextInt();
        }

        System.out.println(suma);
    }
}