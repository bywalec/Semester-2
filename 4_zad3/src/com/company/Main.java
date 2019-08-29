/*
Napisz funkcję, która wyznacza iloczyn elementów tablicy. Rozwiąż
problem w sposób iteracyjny i rekurencyjny. Przy rozwiązaniu rekurencyjnym skorzystaj z następującej własności: iloczyn wszystkich elementów tablicy jest
iloczynem wartości pierwszego elementu oraz wartości iloczynu od drugiego do ostatniego elementu.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
	int tab[] = {1, 2, 3, 4, 5};
	int p = 0;

	Rekurencja r = new Rekurencja();
	int iteracyjnie = r.iloczyn_iteracyjnie(tab);
	int rekurencyjnie = r.iloczyn_rekurencyjnie(tab, p);

        System.out.println("Iloczyn iteracyjnie: " + iteracyjnie);
        System.out.println("Iloczyn rekurencyjnieL " + rekurencyjnie);

    }
}
