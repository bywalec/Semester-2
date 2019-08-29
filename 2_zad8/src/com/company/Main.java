/*
Napisz program, który sprawdza czy dany napis jest palindromem pomijając spacje (czytany od początku i od końca daje to samo), np.Ikar łapał raki.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        String palindrom = "Kamil Slimak";
        String palindrom2 = palindrom.toLowerCase();
        palindrom2 = palindrom2.replaceAll("\\s+",""); // usuniecie bialych znakow

        System.out.println(palindrom2 + " rozmiar stringa: " + palindrom2.length());

        boolean is_true = false;

        for(int i = 0 ; i < palindrom2.length() - 1 ; i++)
        {
            if(palindrom2.charAt(i) == palindrom2.charAt(palindrom2.length() - i - 1))
            {
                is_true = true;
            }
            else
            {
                is_true = false;
                break;
            }
        }

        if(is_true == true)
        {
            System.out.println(palindrom + " jest to palindrom");
        }
        else
        {
            System.out.println(palindrom + " nie jest to palindrom");
        }
    }
}
