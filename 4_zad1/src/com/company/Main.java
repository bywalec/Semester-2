/*
Napisz funkcję, który wyznacza i zwraca n-tą (n jest liczbą naturalną)
potęgę zadanej liczny rzeczywistej x. Rozwiąż problem iteracyjne oraz
rekurencyjnie.
 */

package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj podstawe potegi: ");
        int podstawa = scan.nextInt();
        System.out.println("Podaj n potegi: ");
        int potega = scan.nextInt();

        Rekurencja r = new Rekurencja();
        int iteracja, rekurencja = 0;

        iteracja = r.potega_iteracyjna(podstawa, potega);
        rekurencja = r.potega_rekurencyjna(podstawa, potega);


        System.out.println("Potegowanie iteracyjne: " + iteracja);
        System.out.println("Potegowanie rekurencyjne: " + rekurencja);


    }
}
