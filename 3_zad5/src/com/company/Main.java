/*
Napisz funkcję, która zlicza wystąpienie jednej sekwencji bitowej w drugiej (pomijając poprzedzające zera), sekwencje mogą się nakładać np.
dla int a = 5 (101) oraz int b = 0xA8E9D2AC wynik wyniesie 7.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 5;
	int b = 0xA8E9D2AC;

	int mask = 1 << 31;

	for(int i = 0 ; i < 32 ; i++)
    {
        if((mask & b) != 0)
        {
            System.out.print(1);
        }
        else
        {
            System.out.print(0);
        }
        mask >>>= 1;
    }
        System.out.println();

        mask = 1 << 31;
        int jedynka = 0; // do sprawdzenia na ktorej pozycji znajduje sie pierwsza jedynka


        for(int i = 0 ; i < 32 ; i++)
        {
            if(((mask & a) != 0) && jedynka == 0)
            {
                jedynka = i;
            }
            if((mask & a) != 0)
            {
                System.out.print(1);
            }
            else
            {
                System.out.print(0);
            }
            mask >>>= 1;
        }
        mask = 1 << 31;
        int mask2 = 1 << 31;
        int licznik = 0;
        int ile_razy = 0;
        System.out.println();

        for(int i = 0 ; i < jedynka ; i++)
        {
            for(int j = 0 ; j < 32 - jedynka ; j++)
            {
                if(((b & mask >>> j) != 0) == ((a & mask2 >>> jedynka + j) != 0))
                {
                    licznik++;
                }
                if(licznik == 32 - jedynka)
                {
                    ile_razy++;
                }
            }
            licznik = 0;
            mask >>>= 1;
        }
        System.out.println();
        System.out.println("Sekwencja naklada sie: " + ile_razy + " razy.");




    }
}
