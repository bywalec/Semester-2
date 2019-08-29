package com.company;

public class Rekurencja {
    public int iloczyn_iteracyjnie(int[] tab)
    {
        int iloczyn = 1;
        for(int i = 0 ; i < tab.length ; i++)
        {
            iloczyn *= tab[i];
        }

        return iloczyn;
    }

    public int iloczyn_rekurencyjnie(int[] tab, int p)
    {
        if(p == tab.length - 1) return tab[p];
        else{
            return tab[p] * iloczyn_rekurencyjnie(tab, p + 1);
        }
    }
}
