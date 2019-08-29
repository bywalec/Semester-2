package com.company;

public class Rekurencja{
    public int suma_mod_10(int liczba, int suma)
    {
        if(liczba < 0.01)
            return suma;
            else return suma_mod_10(liczba/10, suma += liczba%10);

    }

}
