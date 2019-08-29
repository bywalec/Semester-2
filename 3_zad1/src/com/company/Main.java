/*
 Napisz funkcję, która wyświetla liczbę typu int, będąca argument wejściowym funkcji, w postaci binarnej, pomijając poprzedzające zera, np.
liczba 5, która reprezentowana na 32 bitach (0000 0000 0000 0000 0000 0000 0000 0101) ma zostać wyświetlona jako 101.

 */
package com.company;

public class Main {

    public static void main(String[] args) {
	int mask = 1 << 31;
	int liczba = 5;
	boolean check = false;

        for(int i = 31 ; i >= 0 ; i--)
        {
            if(((1 << i) & liczba) != 0)
            {
                System.out.print(1);
            }
            else
                System.out.print(0);
            if(i % 4 == 0)
                System.out.print(" ");
        }
        System.out.println();
        System.out.println("Rozwiazanie zadania: ");
        for(int i = 0 ; i < 32 ; i++)
        {

            if(((mask ) & liczba) != 0)
            {
                check = true;
            }
            if((((mask ) & liczba) != 0) && check == true)
            {
                System.out.print(1);
            }
            else if((((mask ) & liczba) == 0) && check == true)
                System.out.print(0);

            mask >>>= 1;

        }

    }
}
