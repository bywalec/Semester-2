/*
Napisz program, który zliczy wystąpienia wzorca w tekście (wzorzec nie może się nakładać) np. dla String tekst = "bananana" i wzorca
string wzorzec = "nan" program zwróci 1
 */
package com.company;

public class Main {

    public static void main(String[] args) {
	String tekst = "bananannanan";
	String wzorzec = "nan";

	int licznik = 0;
	int ile = 0;

        System.out.println("Dlugosz wzorca; " + wzorzec.length());

	for(int i = 0 ; i < tekst.length() - wzorzec.length() + 1 ; i++)
    {
        for(int j = 0 ; j < wzorzec.length() ; j++)
        {
            if(tekst.charAt(i + j) == wzorzec.charAt(j))
            {
                licznik++;
            }
            if(licznik == wzorzec.length())
            {
                ile++;
                i += 2;
            }
        }
        licznik = 0;
    }

        System.out.println("bez nakladania sie " + ile + " razy.");
    }
}
