/*
Napisz funkcję, która w sposób rekurencyjny wyznacza sumę cyfr dodatniej
liczby całkowitej np. dla a=1558 suma cyfr wynosi 19.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
	int liczba = 1558;
	Rekurencja r = new Rekurencja();
	int sumaInt = r.suma_mod_10(liczba, 0);
        System.out.println(sumaInt);


    }
}
