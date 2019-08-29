/*
Używając dowolnej pętli napisz program wyświetlający malejący ciąg liczb od 24 do 6 z krokiem co 2.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 24;

        do{
            System.out.println(x);
            x -= 2;

        }
        while(x > 5);
    }


}
